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
public class RandomEquipment {
    @Id
    private Integer code;
    private String groupCode;
    private Integer itemCode;
    private Integer weight;
    private String itemGrade;
    private Integer tagMultiplier;
    private Integer characterNum;
}