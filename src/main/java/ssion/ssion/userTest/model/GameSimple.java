package ssion.ssion.userTest.model;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
 
@Getter
@Table(name = "game_simple")
@IdClass(GameSimplePK.class)
public class GameSimple { //1대 다로 user 테이블에서 박을 예정



    @Id
    private Long userNum;
    @Id
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
    private Long masteryLevel;
    private Long mmrGain;
    private Long mmrAfter;
    private Long mmrBefore;
    private Long damageToPlayer;
    private Long routeIdOfStart;
    private String startDtm;




}
