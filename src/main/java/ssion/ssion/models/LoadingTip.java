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
public class LoadingTip {
    @Id
    private Integer code;
    private String loadingTipType;
    private Double minLv;
    private Integer maxLv;
    private String textKey;
    private String imageName;
}