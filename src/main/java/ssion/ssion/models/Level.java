package ssion.ssion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
 
@Getter
public class Level {
    @Id
    private Integer level;
    private Integer needExp;
    private Integer accumulateExp;
    private Integer rewardAcoin;
    private Integer reward;
}