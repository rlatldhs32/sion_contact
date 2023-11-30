package ssion.ssion.item;

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
public class ItemWeapon {
    @Id
    private Integer code;
    private String name;
    private Double modeType;
    private String itemType;
    private String weaponType;
    private String itemGrade;
    private Boolean isCompletedItem;
    private Boolean alertInSpectator;
    private String markingType;
    private String craftAnimTrigger;
    private Integer stackable;
    private Integer initialCount;
    private String itemUsableType;
    private Double itemUsableValueList;
    private Double exclusiveProducer;
    private Boolean isRemovedFromPlayerCorpseInventoryWhenPlayerKilled;
    private Double makeMaterial1;
    private Double makeMaterial2;
    private Boolean notDisarm;
    private Boolean consumable;
    private Integer manufacturableType;
    private Integer attackPower;
    private Double attackPowerByLv;
    private Double defense;
    private Double defenseByLv;
    private Double skillAmp;
    private Double skillAmpByLevel;
    private Double skillAmpRatio;
    private Double skillAmpRatioByLevel;
    private Double adaptiveForce;
    private Double adaptiveForceByLevel;
    private Double maxHp;
    private Double maxHpByLv;
    private Double hpRegenRatio;
    private Double hpRegen;
    private Double maxSP;
    private Double spRegenRatio;
    private Double spRegen;
    private Double attackSpeedRatio;
    private Double attackSpeedRatioByLv;
    private Double criticalStrikeChance;
    private Double criticalStrikeDamage;
    private Double cooldownReduction;
    private Double preventCriticalStrikeDamaged;
    private Double cooldownLimit;
    private Double lifeSteal;
    private Double normalLifeSteal;
    private Double skillLifeSteal;
    private Double moveSpeed;
    private Double moveSpeedOutOfCombat;
    private Double sightRange;
    private Double attackRange;
    private Double increaseBasicAttackDamage;
    private Double increaseBasicAttackDamageByLv;
    private Double increaseBasicAttackDamageRatio;
    private Double increaseBasicAttackDamageRatioByLv;
    private Double preventBasicAttackDamaged;
    private Double preventBasicAttackDamagedByLv;
    private Double preventBasicAttackDamagedRatio;
    private Double preventBasicAttackDamagedRatioByLv;
    private Double preventSkillDamaged;
    private Double preventSkillDamagedByLv;
    private Double preventSkillDamagedRatio;
    private Double preventSkillDamagedRatioByLv;
    private Double penetrationDefense;
    private Double penetrationDefenseRatio;
    private Double trapDamageReduce;
    private Double trapDamageReduceRatio;
    private Double hpHealedIncreaseRatio;
    private Double healerGiveHpHealRatio;
    private Double uniqueAttackRange;
    private Double uniqueHpHealedIncreaseRatio;
    private Double uniqueCooldownLimit;
    private Double uniqueTenacity;
    private Double uniqueMoveSpeed;
    private Double uniquePenetrationDefense;
    private Double uniquePenetrationDefenseRatio;
    private Double uniqueLifeSteal;
    private Double uniqueSkillAmpRatio;
    private Boolean restoreItemWhenResurrected;
    private Double creditValueWhenConvertedToBounty;
}