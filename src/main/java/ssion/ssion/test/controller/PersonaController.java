//package ssion.ssion.test.controller;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import ssion.ssion.test.service.PersonaService;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/")
//@Slf4j
//public class PersonaController {
//
//    private final PersonaService personaService;
//
//    @PostMapping("/save")
//    public Long saveTest(@RequestParam String name) {
//        Long saveId = personaService.saveTest(name);
//        return saveId;
//    }
//
//    @GetMapping("iternal/nick")
//    public String interalTest(@RequestParam String name) {
//        String result = personaService.eternalTest(name);
//        return result;
//    }
//
//}
