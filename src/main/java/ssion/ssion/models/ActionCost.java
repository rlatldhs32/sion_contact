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
public class ActionCost {
    @Id
    private Integer code;
    private String type;
    private Double sp;
    private Double time1;
    private Double time2;
    private Double actionWaitTime;
    private String castingAnimTrigger;
    private String effectCancelCondition;
    private String castingBarImgName;
}
