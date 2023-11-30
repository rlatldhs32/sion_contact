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
public class ItemSpawn {
    @Id
    private Integer code;
    private Integer areaCode;
    private Double areaSpawnGroup;
    private Integer itemCode;
    private String dropPoint;
    private Integer dropCount;
}