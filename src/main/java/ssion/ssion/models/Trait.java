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
public class Trait {
    @Id
    private Integer code;
    private Integer openAccountLv;
    private String traitGroup;
    private String traitType;
    private Boolean active;
}