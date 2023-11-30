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
public class CharacterMastery {
    @Id
    private Integer code;
    private String weapon1;
    private String weapon2;
    private String weapon3;
    private String weapon4;
    private String combat1;
    private String combat2;
    private String survival1;
    private String survival2;
    private String survival3;
}