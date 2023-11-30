package ssion.ssion.userTest.model;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
 
@Getter
@Table(name = "user_mst")
@IdClass(UserDetailPK.class)
public class UserDetail {

    @Id
    private Long userNum;
    @Id
    private Long seasonId;
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

    @OneToMany
    private List<GameSimple> gameSimples;

    public void addGames(GameSimple game) {
        this.gameSimples.add(game);
//        game.setCalendar(this);
    }

}
