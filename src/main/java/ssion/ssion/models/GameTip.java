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
public class GameTip {
    @Id
    private Integer keyNumber; //바꿈
    private Integer code;
    private String gameTipType;
    private Integer sequence;
    private String titleTextKey;
    private String contentTextKey;
    private String imageName;
    private String link;
}