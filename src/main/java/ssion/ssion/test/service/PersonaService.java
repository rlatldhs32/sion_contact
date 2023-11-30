//package ssion.ssion.test.service;
//
//import static ssion.ssion.utils.Constants.ETERNAL_API_URL;
//import static ssion.ssion.utils.Constants.ETERNAL_KEY;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//import ssion.ssion.test.dto.UserDto;
//import ssion.ssion.test.model.Persona;
//import ssion.ssion.test.repository.PersonaRepository;
//
//@Transactional
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class PersonaService {
//
//    private final PersonaRepository personaRepository;
//
//    public Long saveTest(String name) {
//        Persona persona = Persona.builder().name(name).build();
//        return personaRepository.save(persona).getId();
//    }
//
//    public String eternalTest(String name) {
//        String apiUrl = ETERNAL_API_URL + "/v1/user/nickname?query=" + name;
//
//        WebClient client = WebClient.builder()
//                .baseUrl(apiUrl)
//                .defaultHeader(HttpHeaders.ACCEPT, "application/json")
//                .defaultHeader("x-api-key", ETERNAL_KEY)
//                .build();
//
//        Mono<UserDto> response = client.get()
//                .retrieve()
//                .bodyToMono(UserDto.class);
//
//        UserDto responseBody = response.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//
//        Long personaId = responseBody.getUser().getUserNum();
//
//        String apiUrl2 = ETERNAL_API_URL + "/v1/user/games/" + personaId.toString();
//
//        WebClient client2 = WebClient.builder()
//                .baseUrl(apiUrl2)
//                .defaultHeader(HttpHeaders.ACCEPT, "application/json")
//                .defaultHeader("x-api-key", ETERNAL_KEY)
//                .build();
//
////        Mono<String> response2 = client2.get()
////                .retrieve()
////                .bodyToMono(String.class);
//
//        String response3 = client2.get()
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//
//
////        String responseBody2 = response2.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//        log.info("responseBody3: " + response3);
//
//        System.out.println("응답 본문: " + responseBody);
//        return response3;
//    }
//
//}
