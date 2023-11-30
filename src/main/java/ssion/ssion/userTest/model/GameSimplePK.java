package ssion.ssion.userTest.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameSimplePK implements Serializable {

    private Long userNum;

    private Long gameId;
}
