package ssion.ssion.user.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ssion.ssion.user.dto.UserDTO;
import ssion.ssion.user.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
public class UserController {

    private final UserService userService;


    @PostMapping("/create")
    public Long createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
}
