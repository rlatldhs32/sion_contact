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
public class MonsterSpawnLevel {
    @Id
    private Integer code;
    private Integer mode;
    private Integer playerLevel;
    private Integer monsterCode;
    private Integer spawnLevel;
}