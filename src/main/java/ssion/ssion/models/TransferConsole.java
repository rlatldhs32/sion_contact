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
public class TransferConsole {
    @Id
    private Integer itemCode;
    private Integer mode;
    private String itemType;
    private Integer transferTimeSafeArea;
    private Double subtractTrasferTimeRestrictedArea;
    private Integer manufactureCooldown;
    private Integer consumeVFCredit;
    private Double limitCount;
    private Boolean traitSale;
}