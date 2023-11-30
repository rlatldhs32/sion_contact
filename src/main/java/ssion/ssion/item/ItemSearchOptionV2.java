package ssion.ssion.item;

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
@Table(name = "item_search_option_v2")
public class ItemSearchOptionV2 {
    @Id
    private Integer code;
    private String name;
    private Boolean attackPowerSearch;
    private Boolean attackSpeedSearch;
    private Boolean criticalStrikeSearch;
    private Boolean lifeStealSearch;
    private Boolean normalAttackIncreaseSearch;
    private Boolean skillAttackIncreaseSearch;
    private Boolean cooldownReductionSearch;
    private Boolean maxSpSearch;
    private Boolean spRegenSearch;
    private Boolean defenseSearch;
    private Boolean maxHpSearch;
    private Boolean hpRegenSearch;
    private Boolean damageReductionSearch;
    private Boolean moveSpeedSearch;
    private Boolean sightRangeSearch;
    private String tag1;
    private String tag2;
    private String tag3;
}