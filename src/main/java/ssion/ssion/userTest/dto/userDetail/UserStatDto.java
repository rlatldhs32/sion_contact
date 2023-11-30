package ssion.ssion.userTest.dto.userDetail;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ssion.ssion.test.dto.responseDto;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserStatDto extends responseDto {

    private List<UserDetailDto> userStats;
}
