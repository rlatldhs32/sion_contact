//package ssion.ssion.user.service;
//
//import static java.lang.Thread.sleep;
//import static ssion.ssion.utils.Constants.ETERNAL_API_URL;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//import ssion.ssion.user.dto.GameResultDetailDto;
//import ssion.ssion.user.dto.GameResultDto;
//import ssion.ssion.user.dto.RankDto;
//import ssion.ssion.user.dto.User;
//import ssion.ssion.utils.ApiUtil;
//
//@Transactional
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class UserService {
//
//    //1.topp100
//    //티어별 챔피언의 승률들을 알아보려면 어떻게할까?
//
//    private final UserDetailService userDetailService;
//    Set<Long> AllUserIdSet = new HashSet<>();
//    Set<Long> AllGameIdSet = new HashSet<>();
//    //지금 -> 그냥 유저들의 아이디를 긁을수 있음.
//
//    public void getAllUserStatistics(Integer seasonId) throws InterruptedException {
//        List<Long> top1000UserIdList = getTop1000UserIdList(seasonId);
//        List<Long> userIdList =top1000UserIdList;
//        log.info("===========================================");
//
//        for(int i=0;i<1;i++){
//            List<Long> allGameIdListByUserIdList = getAllGameIdListByUserIdList(userIdList);
//            List<Long> allUserIdList = getUserIdListByGameIdList(allGameIdListByUserIdList);
//
//            Set<Long> newUserIdSet = new HashSet<>();
//            Set<Long> newGameIdSet = new HashSet<>();
//
//            for(Long userId : allUserIdList)
//                if(!AllUserIdSet.contains(userId))
//                    newUserIdSet.add(userId);
//
//            for(Long gameId : allGameIdListByUserIdList)
//                if(!AllGameIdSet.contains(gameId))
//                    newGameIdSet.add(gameId);
//
//            AllUserIdSet.addAll(allUserIdList);
//            AllGameIdSet.addAll(allGameIdListByUserIdList);
//
//            userIdList = new ArrayList<>(newUserIdSet);                                                         //지우지마!!!
//
//        }
//        log.info("===========================================");
//        log.info("AllUserIdSetSIZE: : "+AllUserIdSet.size());
//
//        //AllUserIdSet 에 있는 유저들 콜
//        int cnt=0;
//        for (Long userId : AllUserIdSet) {
//            cnt++;
//            if(cnt%200==0) {
//                log.info("AllUser cnt : " + cnt);
//                //commit
//
//            }
//            userDetailService.getUserInfoFromAPI(userId,seasonId);
//            sleep(10);
//        }
//
//        //계속 반복임.
//    }
//
//
//    public List<Long> getTop1000UserIdList(Integer seasonId) {
//        List<Long> userIdList = new ArrayList<>();
//        //1 ) 티어 1000에 있는 userId를 모두 List로 넣음.
//        String apiUrl = ETERNAL_API_URL + "/v1/rank/top/" + seasonId.toString() + "/3"; //스쿼드
//
//        WebClient client = ApiUtil.getWebClient(apiUrl);
//
//        Mono<RankDto> response2 = client.get()
//                .retrieve()
//                .bodyToMono(RankDto.class);
//
//        RankDto responseBody = response2.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//
//        List<User> topRanks = responseBody.getTopRanks();
//
//        for (User user : topRanks) {
//            userIdList.add(user.getUserNum());
//        }
//        return userIdList;
//    }
//
//    public List<Long> getAllGameIdListByUserIdList(List<Long> userIdList) throws InterruptedException {
//        Set<Long> gameIdSet = new HashSet<>();
//
//        int cnt=0;
//        for (Long topUserId : userIdList) {
////            log.info("topUserId : "+topUserId);
//            cnt++;
//            if(cnt%200==0)
//                log.info("get GameIdList By USER cnt : "+cnt);
//            sleep(10);
//            String apiUrl = ETERNAL_API_URL + "/v1/user/games/" + topUserId; //스쿼드
//            WebClient client = ApiUtil.getWebClient(apiUrl);
//
//            Mono<GameResultDto> response2 = client.get()
//                    .retrieve()
//                    .bodyToMono(GameResultDto.class);
//
//            GameResultDto responseBody = response2.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//            List<GameResultDetailDto> gameResultDetailDtoList = responseBody.getUserGames();
//
//            for (GameResultDetailDto gameDetail : gameResultDetailDtoList) {
//                gameIdSet.add(gameDetail.getGameId());
//            }
//        }
//        log.info("AFTER gameIdSet.size() : "+gameIdSet.size());
//
//        return new ArrayList<>(gameIdSet);
//    }
//
//    public List<Long> getUserIdListByGameIdList(List<Long> gameIdList) throws InterruptedException {
//        Set<Long> userIdSet = new HashSet<>();
//
//        int cnt=0;
//        for (Long gameId : gameIdList) {
//            if(AllGameIdSet.contains(gameId)){ //이미 체크했던애들은 패스
//                continue;
//            }
//            cnt++;
//            if(cnt%200==0)
//                log.info("count UserId By Game. game cnt : "+cnt);
////            log.info("gameId : "+gameId);
//            sleep(10);
//            String apiUrl = ETERNAL_API_URL + "/v1/games/" + gameId.toString();
//            WebClient client = ApiUtil.getWebClient(apiUrl);
//
//            Mono<GameResultDto> response = client.get()
//                    .retrieve()
//                    .bodyToMono(GameResultDto.class);
//
//            GameResultDto responseBody = response.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//
//            List<GameResultDetailDto> gameResultDetailDtoList = responseBody.getUserGames();
//
//            for (GameResultDetailDto gameDetail : gameResultDetailDtoList) {
//                userIdSet.add(gameDetail.getUserNum());
//            }
//        }
//
//        log.info("AFTER userIdSet.size() : "+userIdSet.size());
//
//        return new ArrayList<>(userIdSet);
//    }
//
//}
