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
public class MasteryLevel {
    @Id
    private Integer code;
    private String type;
    private Integer masteryLevel;
    private Integer nextMasteryExp;
    private Double giveLevelExp;
    private Double weaponSkillPoint;
    private Integer expGrowthCapRatio;
}