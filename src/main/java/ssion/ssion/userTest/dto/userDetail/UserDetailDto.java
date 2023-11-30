package ssion.ssion.userTest.dto.userDetail;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ssion.ssion.userTest.model.UserDetail;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailDto {
    private Long seasonId;
    private Long userNum;
    private String nickname;
    private Long matchingMode;
    private Long matchingTeamMode;
    private Long mmr;
    private Long rank;
    private Long rankSize;
    private Long totalGames;
    private Long totalWins;
    private Long totalTeamKills;
    private Long totalDeaths;
    private Long escapeCount;
    private Double rankPercent;
    private Double averageRank;
    private Double averageKills;
    private Double averageAssistants;
    private Double averageHunts;
    private Double top1;
    private Double top2;
    private Double top3;
    private Double top5;
    private Double top7;
    private List<CharacterStat> characterStats;

    public UserDetail toEntity(){
        return UserDetail.builder()
            .seasonId(seasonId)
            .userNum(userNum)
            .nickname(nickname)
            .matchingMode(matchingMode)
            .matchingTeamMode(matchingTeamMode)
            .mmr(mmr)
            .rank(rank)
            .rankSize(rankSize)
            .totalGames(totalGames)
            .totalWins(totalWins)
            .totalTeamKills(totalTeamKills)
            .totalDeaths(totalDeaths)
            .escapeCount(escapeCount)
            .rankPercent(rankPercent)
            .averageRank(averageRank)
            .averageKills(averageKills)
            .averageAssistants(averageAssistants)
            .averageHunts(averageHunts)
            .top1(top1)
            .top2(top2)
            .top3(top3)
            .top5(top5)
            .top7(top7)
            .build();
    }
}
