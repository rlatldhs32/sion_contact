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
public class CharacterModeModifier {
    @Id
    private Integer characterCode;
    private String weaponType;
    private Double soloIncreaseModeDamageRatio;
    private Double soloPreventModeDamageRatio;
    private Double soloIncreaseModeHealRatio;
    private Double soloIncreaseModeShieldRatio;
    private Double duoIncreaseModeDamageRatio;
    private Double duoPreventModeDamageRatio;
    private Double duoIncreaseModeHealRatio;
    private Double duoIncreaseModeHealerGiveHealRatio;
    private Double duoIncreaseModeShieldRatio;
    private Double duoIncreaseModeHealerGiveShieldRatio;
    private Double squadIncreaseModeDamageRatio;
    private Double squadPreventModeDamageRatio;
    private Double squadIncreaseModeHealRatio;
    private Double squadIncreaseModeHealerGiveHealRatio;
    private Double squadIncreaseModeShieldRatio;
    private Double squadIncreaseModeHealerGiveShieldRatio;
    private Double cobaltIncreaseModeDamageRatio;
    private Integer cobaltPreventModeDamageRatio;
    private Double cobaltIncreaseModeHealRatio;
    private Double cobaltIncreaseModeHealerGiveHealRatio;
    private Double cobaltIncreaseModeShieldRatio;
    private Double cobaltIncreaseModeHealerGiveShieldRatio;
    private Integer cobaltIncreaseModeUltCooldownRatio;
    private Integer cobaltIncreaseModeMaxSpRatio;
    private Integer cobaltIncreaseModeSpRegenRatio;
    private Double soloIncreaseModeDamageToMonsterRatio;
    private Double duoIncreaseModeDamageToMonsterRatio;
    private Double squadIncreaseModeDamageToMonsterRatio;
    private Double cobaltIncreaseModeDamageToMonsterRatio;
}