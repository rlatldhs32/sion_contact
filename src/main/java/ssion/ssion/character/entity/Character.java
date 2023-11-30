package ssion.ssion.character.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
 
@Getter
@Table(name = "character_mst")
public class Character {
    @Id
    private Integer code;
    private String name;
    private Integer maxHp;
    private Integer maxSp;
    private String strLearnStartSkill;
    private String strUsePointLearnStartSkill;
    private Double initExtraPoint;
    private Double maxExtraPoint;
    private Integer attackPower;
    private Integer defense;
    private Double skillAmp;
    private Double adaptiveForce;
    private Double criticalStrikeChance;
    private Double hpRegen;
    private Double spRegen;
    private Double attackSpeed;
    private Double attackSpeedRatio;
    private Double increaseBasicAttackDamageRatio;
    private Double skillAmpRatio;
    private Double preventBasicAttackDamagedRatio;
    private Double preventSkillDamagedRatio;
    private Double attackSpeedLimit;
    private Double attackSpeedMin;
    private Double moveSpeed;
    private Double sightRange;
    private Double radius;
    private Double pathingRadius;
    private Double uiHeight;
    private Integer initStateDisplayIndex;
    private Integer localScaleInCutscene;
    private String localScaleInVictoryScene;
    private String resource;
    private String lobbySubObject;


}
