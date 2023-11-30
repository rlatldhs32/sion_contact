package ssion.ssion.character.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterAttributePK implements Serializable {

    private String characterName;

    private String mastery;
}
