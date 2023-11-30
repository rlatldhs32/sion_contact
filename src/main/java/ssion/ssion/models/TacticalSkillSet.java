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
public class TacticalSkillSet {
    @Id
    private Integer code;
    private Integer nextUpgradecode;
    private Integer upgradeCredit;
    private Double upgradeMaterial;
    private Integer skillCode;
}