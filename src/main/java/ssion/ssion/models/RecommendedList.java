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
public class RecommendedList {
    @Id
    private Integer code;
    private String characterName;
    private Integer characterCode;
    private String mastery;
    private Integer startWeapon;
    private Double cobaltStartWeapon;
    private Integer startItemGroupCode;
    private Integer cobaltDraft;
    private String cobaltExtraDraft;
    private Boolean cobaltCanChooseWeapon;
    private String favoriteMainTag;
}