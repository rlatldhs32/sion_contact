package ssion.ssion.userTest.dto;

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

public class GameResultDto extends responseDto {
    List<GameResultDetailDto> userGames;
    Long next;
}
