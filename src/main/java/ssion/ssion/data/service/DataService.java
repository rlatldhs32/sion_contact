//package ssion.ssion.data.service;
//
//import static java.lang.Thread.sleep;
//import static ssion.ssion.utils.Constants.ETERNAL_API_URL;
//import static ssion.ssion.utils.Constants.ETERNAL_KEY;
//
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//import ssion.ssion.data.dto.DataDto;
//import ssion.ssion.utils.ApiUtil;
//
//@Transactional
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class DataService {
//
//    public String getData(String metaType) {
//        //metaType에 따라
//        String apiUrl = ETERNAL_API_URL + "/v2/data/"+metaType;
//
//        WebClient client = ApiUtil.getWebClient(apiUrl);
//        Mono<DataDto> response2 = client.get()
//                .retrieve()
//                .bodyToMono(DataDto.class);
//
//        DataDto responseBody = response2.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//
//        List<Map<String,Object>> dataString = responseBody.getData();
//
//        Map<String,Object> data1 = dataString.get(0);
//
//        String returnStr= "package ssion.ssion.models;\n\n"
//                +"import jakarta.persistence.Entity;\n"
//                + "import jakarta.persistence.Id;\n"
//                + "import lombok.AllArgsConstructor;\n"
//                + "import lombok.Builder;\n"
//                + "import lombok.Getter;\n"
//                + "import lombok.NoArgsConstructor;\n\n\n"
//                + "@NoArgsConstructor\n"
//                + "@AllArgsConstructor\n"
//                + "@Builder\n"
//                + " \n"
//                + "@Getter\n";
//        returnStr+="public class "+metaType+" {\n";
//
//        returnStr +="@Id\n";
//        for(String key : data1.keySet()){
//            String str = "private ";
//            System.out.println("key : " + key + " value : " + data1.get(key));
//            System.out.println("type : " + getValueType(data1.get(key)));
//            str+=getValueType(data1.get(key))+" "+key+";";
//            System.out.println(str);
//            returnStr+=str + "\n";
//        }
//
//        returnStr+="}";
//
//
//        return returnStr;
//    }
//
//    @Value("${spring.datasource.url}")
//    private String jdbcURL;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    public Integer insertDataAll() throws InterruptedException {
//        List<String> metaTypeList = new ArrayList<>();
//        metaTypeList.add("ActionCost");
//        metaTypeList.add("Area");
//        metaTypeList.add("BattleZoneReward");
//        metaTypeList.add("BulletCapacity");
//        metaTypeList.add("Character");
//        metaTypeList.add("CharacterAttributes");
//        metaTypeList.add("CharacterExp");
//        metaTypeList.add("CharacterLevelUpStat");
//        metaTypeList.add("CharacterMastery");
//        metaTypeList.add("CharacterModeModifier");
//        metaTypeList.add("CharacterSkin");
//        metaTypeList.add("Collectible");
//        metaTypeList.add("DropGroup");
//        metaTypeList.add("GainExp");
//        metaTypeList.add("GainScore");
//        metaTypeList.add("GameTip");
//        metaTypeList.add("HowToFindItem");
//        metaTypeList.add("InfusionProduct");
//        metaTypeList.add("ItemArmor");
//        metaTypeList.add("ItemConsumable");
//        metaTypeList.add("ItemMisc");
//        metaTypeList.add("ItemSearchOptionV2");
//        metaTypeList.add("ItemSpawn");
//        metaTypeList.add("ItemSpecial");
//        metaTypeList.add("ItemWeapon");
//        metaTypeList.add("Level");
//        metaTypeList.add("LoadingTip");
//        metaTypeList.add("MasteryExp");
//        metaTypeList.add("MasteryLevel");
//        metaTypeList.add("MasteryStat");
//        metaTypeList.add("Monster");
//        metaTypeList.add("MonsterDropGroup");
//        metaTypeList.add("MonsterLevelUpStat");
//        metaTypeList.add("MonsterSpawnLevel");
//        metaTypeList.add("NaviCollectAndHunt");
//        metaTypeList.add("NearByArea");
//        metaTypeList.add("RandomEquipment");
//        metaTypeList.add("RecommendedList");
//        metaTypeList.add("Season");
//        metaTypeList.add("SummonObjectStat");
//        metaTypeList.add("TacticalSkillSet");
//        metaTypeList.add("TacticalSkillSetGroup");
//        metaTypeList.add("Trait");
//        metaTypeList.add("TransferConsole");
//        metaTypeList.add("VFCredit");
//        metaTypeList.add("WeaponTypeInfo");
//        int cnt = 0;
//        for(String metaType : metaTypeList){
//            log.info("metaType : {}",metaType);
//            deleteData(metaType);
//            cnt+=insertData(metaType);
//            sleep(2000);
//        }
//        return cnt;
//    }
//    public void deleteData(String metaType){
//        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
//            //camelCase to snake_case
//            if(metaType.equals("Character")) metaType+="Mst";
//            String snakeCaseTableName = metaType.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
//            String sql = "delete from "+snakeCaseTableName;
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public Integer insertData(String metaType) {
//        String apiUrl = ETERNAL_API_URL + "/v2/data/" + metaType;
//
//        WebClient client = ApiUtil.getWebClient(apiUrl);
//        Mono<DataDto> response2 = client.get()
//                .retrieve()
//                .bodyToMono(DataDto.class);
//
//        DataDto responseBody = response2.block(); // 이 부분에서 실제 요청을 보내고 응답을 기다립니다.
//
//        List<Map<String, Object>> dataList = responseBody.getData();
//        if(metaType.equals("Character")) metaType+="_mst";
//
//        int cnt=0;
//        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
//            if (connection != null) {
//                for (Map<String, Object> data : dataList) {
//                    //insert into DB
//                    //camelCase to snake_case
//                    String snakeCaseTableName = metaType.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
//
//                    String insertSql = "insert into " + snakeCaseTableName  + " (";
//                    for (String key : data.keySet()) {
//                        if(key.equals("key")) key+="Number";
//                        else if (key.equals("character")) key += "Name";
//                        else if (key.equals("index")) key +="Double";
//                        else if (key.equals("group")) key+="Code";
//                        //camelCase to snake_case
//                        String snakeCase = key.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
//                        if(snakeCase.equals("itemcode")) snakeCase = "item_code"; //randomEquipment 예외처리
//
//                        insertSql += snakeCase + ",";
//                    }
//                    insertSql = insertSql.substring(0, insertSql.length() - 1);
//                    insertSql += ") values (";
//                    for (String key : data.keySet()) {
//                        if(data.get(key) ==null){
//                            insertSql += "null,";
//                            continue;
//                        }
//                        if(data.get(key) instanceof String) {
//                            if(data.get(key).equals("")){
//                                insertSql += "null,";
//                                continue;
//                            }
//                            if(data.get(key).equals("34,57")){ //예외 ( itemSpecial 하나 이상한애있음)
//                                insertSql += "0,";
//                                continue;
//                            }
//                            insertSql += "'" + data.get(key) + "',";
//                            continue;
//                        }
//                        insertSql +=  data.get(key) + ",";
//                    }
//                    insertSql = insertSql.substring(0, insertSql.length() - 1);
//                    insertSql += ");";
//                    System.out.println(insertSql);
//                    Statement statement = connection.createStatement();
//
//                    // INSERT 실행
//                    int rowsAffected = statement.executeUpdate(insertSql);
//                    if (rowsAffected > 0) {
//                        System.out.println("Data inserted successfully.");
//                        cnt++;
//                    } else {
//                        System.out.println("Data insertion failed.");
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        log.info("insertData cnt : {}", cnt);
//        return cnt;
//    }
//
//    public String getValueType(Object value) {
//        if (value == null) {
//            return "null";
//        } else if (value instanceof Integer) {
//            if(value.equals(0)){
//                return "Double";
//            }
//            return "Integer";
//        } else if (value instanceof Double) {
//            return "Double";
//        } else if (value instanceof String) {
//            return "String";
//        }else if (value instanceof Boolean) {
//            return "Boolean";
//        }
//        else {
//            return "Unknown"; // 다른 데이터 형식일 경우
//        }
//    }
//
//
//}
