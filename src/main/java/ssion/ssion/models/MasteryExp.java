package ssion.ssion.models;

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
@Table(name = "mastery_exp")
public class MasteryExp {
    private Integer code;
    private Integer modeType;
    private String conditionType;
    private String grade;
    private Integer conditionValue;
    private String masteryType1;
    private Integer value1;
    private String masteryType2;
    private Double value2;
    private String masteryType3;
    private Double value3;
}