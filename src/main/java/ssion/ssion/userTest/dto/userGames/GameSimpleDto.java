package ssion.ssion.userTest.dto.userGames;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ssion.ssion.userTest.model.GameSimple;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameSimpleDto {
    private Long userNum;
    private Long gameId;
    private Long seasonId;
    private Long matchingMode;
    private Long matchingTeamMode;
    private Long characterNum;
    private Long skinCode;
    private Long characterLevel;
    private Long gameRank;
    private Long playerKill;
    private Long playerAssistant;
    private Long playerDeaths;
    private Long monsterKill;
    private Long bestWeapon;
//    private Long masteryLevel;
    private Long mmrGain;
    private Long mmrAfter;
    private Long mmrBefore;
    private Long damageToPlayer;
    private Long routeIdOfStart;
    private String startDtm;



    public GameSimple toEntity(){
        return GameSimple.builder()
        .userNum(userNum)
        .gameId(gameId)
        .seasonId(seasonId)
        .matchingMode(matchingMode)
        .matchingTeamMode(matchingTeamMode)
        .characterNum(characterNum)
        .skinCode(skinCode)
        .characterLevel(characterLevel)
        .gameRank(gameRank)
        .playerKill(playerKill)
        .playerAssistant(playerAssistant)
        .playerDeaths(playerDeaths)
        .monsterKill(monsterKill)
        .bestWeapon(bestWeapon)
        .mmrGain(mmrGain)
        .mmrAfter(mmrAfter)
        .mmrBefore(mmrBefore)
        .damageToPlayer(damageToPlayer)
        .routeIdOfStart(routeIdOfStart)
        .startDtm(startDtm)
        .build();

    }
}
