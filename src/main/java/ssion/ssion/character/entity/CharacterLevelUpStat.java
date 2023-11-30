package ssion.ssion.character.entity;

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
public class CharacterLevelUpStat {
    @Id
    private Integer code;
    private String name;
    private Integer maxHp;
    private Integer maxSp;
    private Double attackPower;
    private Integer defense;
    private Double skillAmp;
    private Double adaptiveForce;
    private Double criticalChance;
    private Double hpRegen;
    private Double spRegen;
    private Double attackSpeed;
    private Double moveSpeed;
    private Double attackSpeedRatio;
    private Double increaseBasicAttackDamageRatio;
    private Double skillAmpRatio;
    private Double preventBasicAttackDamagedRatio;
    private Double preventSkillDamagedRatio;
}