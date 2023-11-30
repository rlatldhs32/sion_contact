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
public class MonsterLevelUpStat {
    @Id
    private Integer code;
    private String monster;
    private Integer mode;
    private Integer maxHp;
    private Integer attackPower;
    private Double defense;
    private Double moveSpeed;
    private Integer gainExp;
}