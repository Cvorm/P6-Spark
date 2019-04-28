package filterJson;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;

//public class filterJsonData {
//
//    JSONObject _jsonData = null;
//
//    public void ReadJson(String filePath){
//
//        //JSON parser object to parse read file
//        JSONParser jsonParser = new JSONParser();
//
//        try (FileReader reader = new FileReader(filePath))
//        {
//            //Read JSON file
//            Object obj = jsonParser.parse(reader);
//
//             _jsonData = (JSONArray) obj;
//             System.out.println(_jsonData);
//
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        JsonParser parser = new JsonParser();
//        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("polygonData.geojson");
//        Reader reader = new InputStreamReader(inputStream);
//        JsonElement rootElement = parser.parse(reader);
//        _jsonData = rootElement.getAsJsonObject();
//    }
//    public JSONArray filter(JSONArray jsonData){
//        jsonData.forEach( spatialObj -> PruneFields( (JSONObject) spatialObj ) );
//        for (spatial:jsonData) {
//
//        }
//        return jsonData;
//    }

//    private void PruneFields(JSONObject spatialObejct){
//
//    }
//
//}
public class ReadJson {
    public JsonObject ParseJson() {
        JsonParser parser = new JsonParser();
        InputStream inputSteam = getClass().getClassLoader().getResourceAsStream("polygonData.geojson");
        Reader reader = new InputStreamReader(inputSteam);
        /*parser.parse(reader);*/
        JsonElement rootElement = parser.parse(reader);
        JsonObject rootObject = rootElement.getAsJsonObject();
        return  rootObject;
//        JsonObject type = rootObject.getAsJsonObject("type");
//        System.out.println(rootObject.toString());
//
    }
}

