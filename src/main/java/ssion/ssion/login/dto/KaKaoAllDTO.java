package ssion.ssion.login.dto;

import lombok.*;

import java.util.HashMap;
import java.util.Properties;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KaKaoAllDTO {
    private Long id;
    private String connected_at;

    private HashMap<String, String> properties;

    private HashMap<String, Object> kakao_account;

}
