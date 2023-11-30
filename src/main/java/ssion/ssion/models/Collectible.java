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
public class Collectible {
    @Id
    private Integer code;
    private Integer cooldown;
    private String itemCode1;
    private String itemCode2;
    private Integer probability1;
    private Double probability2;
    private Integer dropCount;
    private String castingActionType;
}