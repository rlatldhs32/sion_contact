package ssion.ssion.character.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
 
@IdClass(CharacterAttributePK.class)
@Getter
public class CharacterAttributes {
    @Id
    private String characterName;
    private Integer characterCode;
    @Id
    private String mastery;
    private Integer controlDifficulty;
    private Integer attack;
    private Integer defense;
    private Integer disruptor;
    private Integer move;
    private Integer assistance;
}