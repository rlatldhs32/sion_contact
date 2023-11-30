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
public class InfusionProduct {
    @Id
    private Integer code;
    private String productType;
    private Integer productGroup;
    private Integer productCode;
    private String storeType;
    private String stockType;
    private Integer stock;
    private Boolean isRestore;
    private Integer price;
    private Integer specialWeight;
    private Integer weight;
    private Double requirement;
    private String icon;
    private String simpleIcon;
    private Boolean alertInSpectator;
    private Integer characterNum;
}