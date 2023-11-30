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
public class Monster {
    @Id
    private Integer code;
    private String monster;
    private Boolean isMutant;
    private String grade;
    private Integer mode;
    private String createDay;
    private Double createTime;
    private Integer regenTime;
    private Integer levelUpPeriod;
    private Integer levelUpAmount;
    private Integer levelUpMax;
    private Integer maxHp;
    private Double maxEp;
    private Double initExtraPoint;
    private Integer attackPower;
    private Integer defense;
    private Double attackSpeed;
    private Double moveSpeed;
    private Integer sightRange;
    private Integer chasingRange;
    private Double attackRange;
    private Integer firstAttackRange;
    private String aggressive;
    private Boolean detectInvisible;
    private Double radius;
    private Double pathingRadius;
    private Double uiHeight;
    private Integer gainExp;
    private Double targetOnRange;
    private Integer randomDropCount;
    private String resource;
    private String corpseResource;
    private Double appearTime;
}