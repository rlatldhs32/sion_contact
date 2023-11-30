package ssion.ssion.login.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KakaoUserDTO {
    private String nickname;
    private String email;
}
