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
public class SummonObjectStat {
    @Id
    private Integer code;
    private String name;
    private Integer duration;
    private Integer createRange;
    private Integer pileRange;
    private Integer createVisibleTime;
    private Integer createStealthTime;
    private Double infiltrationTime;
    private Double detectionRange;
    private Integer maxHp;
    private Double maxSp;
    private Double initExtraPoint;
    private Double maxExtraPoint;
    private Double attackPower;
    private Double defense;
    private Double criticalStrikeChance;
    private Double hpRegen;
    private Double spRegen;
    private Double rangeRadius;
    private Integer attackSpeed;
    private Double attackRange;
    private Double attackDelay;
    private Double moveSpeed;
    private Double radius;
    private Double uiHeight;
    private Integer sightRange;
    private Integer sightAngle;
}