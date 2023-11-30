package ssion.ssion.userTest.dto.userGames;

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
public class UserGameDto extends responseDto {

    List<GameSimpleDto> userGames;
    Long next;
}
