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
public class GainScore {
    @Id
    private Integer code;
    private Integer phase;
    private String conditionType;
    private Double conditionValue;
    private Integer pointsEnemy;
    private Double pointsAlly;
}