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
public class VFCredit {
    @Id
    private Integer code;
    private Integer mode;
    private Double phase;
    private String conditionType;
    private Double conditionValue;
    private Integer acquireSelf;
    private Double acquireTeam;
}