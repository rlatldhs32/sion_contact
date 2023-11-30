package ssion.ssion.character.entity;

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
public class CharacterSkin {
    @Id
    private String name;
    private Integer code;
    private Integer characterCode;
    private Double indexDouble;
    private Integer grade;
    private String purchaseType;
    private String effectsPath;
    private String projectilesPath;
    private String objectPath;
    private String fxSoundPath;
    private String voicePath;
    private String weaponMountPath;
    private String weaponMountCommonPath;
    private String indicatorPath;
    private String projectilesDeflectorPath;
}