package ssion.ssion.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class UrlConnection {
    private static final Logger LOGGER = LoggerFactory.getLogger(UrlConnection.class);

    private String url;
    @Builder.Default
    private String method = "POST";
    @Builder.Default
    private boolean doOutput = true;
    private HashMap<String, String> properties;
    private HttpURLConnection conn;

    /**
     * URL 커넥션관련 설정을 하고 _self 리턴 (보내는 메시지가 없는 경우)
     *
     * @author GEONLEE
     * @return UrlConnection
     * @since 2023-02-24
     */
    public UrlConnection getConnection() throws IOException{
        URL url = new URL(this.url);
        this.conn = (HttpURLConnection) url.openConnection();
        this.conn.setRequestMethod(this.method);
        this.conn.setDoOutput(this.doOutput);

        if(this.properties != null){
            Set<String> keys = this.properties.keySet();
            for(Iterator<String> itr = keys.iterator(); itr.hasNext();){
                String key = itr.next();
                this.conn.setRequestProperty(key, this.properties.get(key));
            }
        }
        return this;
    }

    /**
     * URL 커넥션관련 설정을 하고 _self 리턴 (보내는 메시지가 있는 경우)
     *
     * @author GEONLEE
     * @return UrlConnection
     * @since 2023-02-24
     */
    public UrlConnection getConnectionWithWrite(String message) throws IOException{
        BufferedWriter bw = null;
        if(this.conn == null){
            getConnection();
        }
        try{
            bw = new BufferedWriter(new OutputStreamWriter(this.conn.getOutputStream()));
            bw.write(message);
        }catch(IOException e){
            throw e;
        }finally{
            if(bw != null) bw.flush();
        }
        if(this.conn.getResponseCode() != 200) {
            LOGGER.error("소셜로그인 처리 에러\n"+this.toString());
            throw new IOException("소셜 로그인 접속에 실패하였습니다. "+this.url);
        }
        return this;
    }

    /**
     * 받은 메시지 포맷과 같은 class를 매개변수로 받아 받은 json을 class로 변환하여 리턴
     *
     * @author GEONLEE
     * @return Class
     * @since 2023-02-24
     */
    public <T> T getMessage(Class<T> clazz) throws IOException {
        BufferedReader br = null;
        ObjectMapper mapper = new ObjectMapper();
        String line = "", result = "";
        try{
            br = new BufferedReader(new InputStreamReader(this.conn.getInputStream()));
            while ((line = br.readLine()) != null) {
                result += line;
            }
        }catch(IOException e){
            throw e;
        }finally{
            if(br != null) br.close();
        }
        return mapper.readValue(result, clazz);
    }
}
