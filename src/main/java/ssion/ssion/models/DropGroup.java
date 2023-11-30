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
public class DropGroup {
    @Id
    private Integer groupCode;
    private String itemCode;
    private Integer min;
    private Integer max;
    private Integer probability;
    private String dropType;
}