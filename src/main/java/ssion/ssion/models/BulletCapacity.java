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
@Table(name = "bullet_capacity")
public class BulletCapacity {
    private Integer itemCode;
    private Integer capacity;
    private String loadType;
    private Integer time;
    private Double initCount;
    private Integer count;
}