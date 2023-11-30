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
@Table(name = "monster_drop_group")
public class MonsterDropGroup {
    private Integer monsterCode;
    private Integer monsterLevel;
    private Integer dropGroup;
}