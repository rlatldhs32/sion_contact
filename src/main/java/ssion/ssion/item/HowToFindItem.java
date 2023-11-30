package ssion.ssion.item;

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
public class HowToFindItem {
    @Id
    private Integer code;
    private Integer itemCode;
    private Double huntChicken;
    private Double huntBat;
    private Double huntBoar;
    private Double huntWildDog;
    private Double huntWolf;
    private Double huntBear;
    private Double huntWickline;
    private Double huntAlpha;
    private Double huntOmega;
    private Double collectibleCode;
    private Double airSupply;
}