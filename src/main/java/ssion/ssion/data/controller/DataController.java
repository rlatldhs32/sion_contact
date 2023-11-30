//package ssion.ssion.data.controller;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import ssion.ssion.data.service.DataService;
//import ssion.ssion.test.service.PersonaService;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/data")
//@Slf4j
//public class DataController {
//
//    private final DataService dataService;
//
//
//    @GetMapping("/get/{metaType}") //테이블 만들떄 필요
//    public String getDataFromAPI(@PathVariable String metaType) {
//
//        String data = dataService.getData(metaType);
//        return data;
//    }
//
//    @GetMapping("/insert/{metaType}")
//    public Integer insertDataFromAPI(@PathVariable String metaType) {
//
//        Integer data = dataService.insertData(metaType);
//        return data;
//    }
//
//
//    @GetMapping("/insert/all")
//    public Integer insertDataFromAPAll() throws InterruptedException {
//
//        Integer data = dataService.insertDataAll();
//        return data;
//    }
//}
