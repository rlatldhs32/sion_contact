package ssion.ssion.login.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import jdk.jfr.Description;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssion.ssion.login.dto.KaKaoAllDTO;
import ssion.ssion.login.dto.KakaoUserDTO;
import ssion.ssion.login.dto.SocialTokenDTO;
import ssion.ssion.utils.UrlConnection;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;

import static ssion.ssion.utils.Constants.KAKAO_TOKEN_REQUEST_URL;
import static ssion.ssion.utils.Constants.KAKAO_USER_INFO_REQUEST_URL;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
@Slf4j
public class LoginController {
    @GetMapping(value = "/kakao", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "카카오 간편로그인 테스트", notes = "카카오 간편로그인 시 활용한다.")
    @Description("Front로 부터 kakao Oauth를 받는다")
    public void getKakaoUserInfo(String code) {
        System.out.println("OAuth Code : "+code);
        //////////////////////Token 정보 요청//////////////////////
        try {
            URL url = new URL("https://kauth.kakao.com/oauth/token");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=" + "1822dd06f694078cc8cf43fb6def5d20"); //REST API 키
            sb.append("&code=" + code);
            BufferedWriter bw = null;
            try{
                bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
                bw.write(sb.toString());
            }catch(IOException e){
                throw e;
            }finally{
                if(bw != null) bw.flush();
            }
            BufferedReader br = null;
            String line = "", result = "";
            try {
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                while ((line = br.readLine()) != null) {
                    result += line;
                }
            } catch (IOException e) {
                throw e;
            } finally {
                if (br != null)
                    br.close();
            }
            System.out.println("result : " + result);

            ObjectMapper mapper = new ObjectMapper();
            String access_token = mapper.readValue(result, SocialTokenDTO.class).getAccess_token();

            url = new URL("https://kapi.kakao.com/v2/user/me");
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Authorization", "Bearer "+access_token);
            System.out.println(conn.getURL());

            line = ""; result = "";
            try {
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                while ((line = br.readLine()) != null) {
                    result += line;
                }
            } catch (IOException e) {
                throw e;
            } finally {
                if (br != null)
                    br.close();
            }

//            String accessToken = UrlConnection.builder().url(KAKAO_TOKEN_REQUEST_URL).build().getConnectionWithWrite(sb.toString()).getMessage(SocialTokenDTO.class).getAccess_token();
//
//            System.out.println("accessToken : " + accessToken);

            System.out.println("result user : " + result);

            KaKaoAllDTO kaKaoAllDTO = mapper.readValue(result, KaKaoAllDTO.class);

            System.out.println("kaKaoAllDTO : " + kaKaoAllDTO);

            String email = kaKaoAllDTO.getKakao_account().get("email").toString();

            System.out.println("email : " + email);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
