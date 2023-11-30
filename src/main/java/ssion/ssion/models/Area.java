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
public class Area {
    @Id
    private Integer code;
    private String name;
    private Integer modeType;
    private Integer maskCode;
    private Boolean startingArea;
    private String areaType;
    private Boolean isProvideCollectibleItem;
    private Integer routeCalcBitCode;
    private Boolean isHyperLoopInstalled;
}