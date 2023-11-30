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
public class BattleZoneReward {
    @Id
    private Integer code;
    private Integer modeType;
    private Integer areaAttributesCreateEventCount;
    private Integer itemCode;
    private String type;
    private Integer value;
    private Boolean selectable;
}