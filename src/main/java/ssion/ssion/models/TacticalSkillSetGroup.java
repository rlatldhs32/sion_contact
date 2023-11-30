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
public class TacticalSkillSetGroup {
    @Id
    private Integer groupCode;
    private Integer modeType;
    private Integer startCode;
    private Boolean equipWithStart;
    private String icon;
}