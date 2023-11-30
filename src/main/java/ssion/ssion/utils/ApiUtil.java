package ssion.ssion.utils;

import static ssion.ssion.utils.Constants.ETERNAL_KEY;

import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

public class ApiUtil {

    public static WebClient getWebClient(String apiUrl) {
        WebClient client = WebClient.builder()
                .baseUrl(apiUrl)
                .defaultHeader(HttpHeaders.ACCEPT, "application/json")
                .defaultHeader("x-api-key", ETERNAL_KEY)
                .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(30*1024*1024))
                .build();
        return client;
    }
}
