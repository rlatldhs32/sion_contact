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
public class WeaponTypeInfo {
    @Id
    private String type;
    private Double attackSpeed;
    private Double attackRange;
    private Integer shopFilter;
    private Integer summonObjectHitDamage;
}