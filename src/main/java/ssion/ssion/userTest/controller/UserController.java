//package ssion.ssion.user.controller;
//
//
//import java.util.List;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ssion.ssion.user.model.UserDetail;
//import ssion.ssion.user.service.UserDetailService;
//import ssion.ssion.user.service.UserService;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/user")
//@Slf4j
//public class UserController {
//    private final UserService userService;
//    private final UserDetailService userDetailService;
//
//    @GetMapping("/getUserIdList")
//    public List<Long> getUserIdList() throws InterruptedException {
//        userService.getAllUserStatistics(19);
//        return null;
//    }
//
//    @GetMapping("/info/{userNum}/{seasonId}")
//    public Long getUserInfo(@PathVariable Long userNum , @PathVariable Integer seasonId) {
//        return userDetailService.getUserInfoFromAPI(userNum, seasonId);
//    }
//
//    @GetMapping("/game/{userNum}")
//    public Long getUserGameList(@PathVariable Long userNum) {
//        return userDetailService.getUserGameList(userNum);
//    }
//
//    @GetMapping("/game/{userNum}/{seasonId}")
//    public UserDetail getUserInfoAndGameList(@PathVariable Long userNum, @PathVariable Long seasonId) {
//        return userDetailService.getUserInfoFromDb(userNum,seasonId);
//    }
//}
