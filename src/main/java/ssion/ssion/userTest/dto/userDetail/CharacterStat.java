package ssion.ssion.userTest.dto.userDetail;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CharacterStat {
    private Long characterCode;
    private Long usage;
    private Long maxKillings;
    private Long top3;
    private Long wins;
    private Double top3Rage;
    private Double averageRank;
}
