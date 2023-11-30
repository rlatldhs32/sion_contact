//package ssion.ssion.user.service;
//
//import static ssion.ssion.utils.Constants.ETERNAL_API_URL;
//
//import java.util.ArrayList;
//import java.util.List;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//import ssion.ssion.user.dto.RankDto;
//import ssion.ssion.user.dto.User;
//import ssion.ssion.user.dto.userDetail.UserDetailDto;
//import ssion.ssion.user.dto.userDetail.UserStatDto;
//import ssion.ssion.user.dto.userGames.GameSimpleDto;
//import ssion.ssion.user.dto.userGames.UserGameDto;
//import ssion.ssion.user.model.GameSimple;
//import ssion.ssion.user.model.UserDetail;
//import ssion.ssion.user.repository.GameSimpleRepository;
//import ssion.ssion.user.repository.UserRepository;
//import ssion.ssion.utils.ApiUtil;
//
//@Transactional
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class UserDetailService {
//
//    private final UserRepository userRepository;
//
//    private final GameSimpleRepository gameSimpleRepository;
//
//    public Long getUserInfoFromAPI(Long userNum, Integer seasonId) {
//        String apiUrl = ETERNAL_API_URL + "/v1/user/stats/" +userNum.toString() + "/" + seasonId.toString();
//
//        WebClient client = ApiUtil.getWebClient(apiUrl);
//
//        Mono<UserStatDto> response = client.get()
//                .retrieve()
//                .bodyToMono(UserStatDto.class);
//
//        UserStatDto responseBody = response.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//
//        if(responseBody.getUserStats() == null){ //TODO: 예외처리
//            log.error("userStats is null");
//            return 0L;
//        };
//
//        UserDetail userDetail = responseBody.getUserStats().get(0).toEntity();
//
//        UserDetail save = userRepository.save(userDetail);
//
//        return save.getUserNum();
//    }
//
//    public Long getUserGameList(Long userNum) { //하나만 해야함.
//        String apiUrl = ETERNAL_API_URL + "/v1/user/games/" +userNum.toString(); //TODO: next 넣어서
//
//        WebClient client = ApiUtil.getWebClient(apiUrl);
//
//        Mono<UserGameDto> response = client.get()
//                .retrieve()
//                .bodyToMono(UserGameDto.class);
//
//        UserGameDto responseBody = response.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//
//        if(responseBody.getUserGames() == null){ //TODO: 예외처리
//            log.error("userGames is null");
//            return 0L;
//        };
//
//        List<GameSimpleDto> userGames = responseBody.getUserGames();
//        UserDetail user = userRepository.findByUserNumAndSeasonId(userNum,19L); //TODO: 이거 수정해야함
//
//        for (GameSimpleDto userGame : userGames) {
//            GameSimple gameSimple = userGame.toEntity();
//            if(gameSimpleRepository.existsByUserNumAndGameId(userNum,gameSimple.getGameId())){
//                continue;
//            }
//            gameSimpleRepository.save(gameSimple);
//            user.addGames(gameSimple);
//
//        }
//        return 100L;
//    }
//
//    public UserDetail getUserInfoFromDb(Long userNum, Long seasonId) {
//
//        UserDetail userDetail = userRepository.findByUserNumAndSeasonId(userNum, seasonId);
//
//        return userDetail;
//    }
//
//    //게임 수
//}
