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
@Table(name = "mastery_stat")
public class MasteryStat {
    private Integer code;
    private String type;
    private Integer characterCode;
    private String firstOption;
    private Double firstOptionSection1Value;
    private Double firstOptionSection2Value;
    private Double firstOptionSection3Value;
    private Double firstOptionSection4Value;
    private String secondOption;
    private Double secondOptionSection1Value;
    private Double secondOptionSection2Value;
    private Double secondOptionSection3Value;
    private Double secondOptionSection4Value;
    private String thirdOption;
    private Double thirdOptionSection1Value;
    private Double thirdOptionSection2Value;
    private Double thirdOptionSection3Value;
    private Double thirdOptionSection4Value;
}