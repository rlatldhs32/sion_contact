package ssion.ssion.userTest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ssion.ssion.test.dto.responseDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends responseDto{
    private Long userNum;
    private String nickname;
    private Long rank;
    private Long mmr;
}
