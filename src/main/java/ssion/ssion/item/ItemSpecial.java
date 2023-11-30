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
public class ItemSpecial {
    @Id
    private Integer code;
    private String name;
    private Double modeType;
    private String itemType;
    private String specialItemType;
    private String itemGrade;
    private Boolean isCompletedItem;
    private Boolean alertInSpectator;
    private String markingType;
    private String craftAnimTrigger;
    private Integer stackable;
    private Integer initialCount;
    private Integer cooldownGroupCode;
    private Integer cooldown;
    private String itemUsableType;
    private Double itemUsableValueList;
    private Double exclusiveProducer;
    private Boolean canNotBeTakeItemFromCorpse;
    private Integer manufacturableType;
    private Double makeMaterial1;
    private Double makeMaterial2;
    private Integer consumeCount;
    private Integer summonCode;
    private Double ghostItemStateGroup;
    private Boolean isVPadQuickSlotItem;
    private Boolean restoreItemWhenResurrected;
    private Double creditValueWhenConvertedToBounty;
}