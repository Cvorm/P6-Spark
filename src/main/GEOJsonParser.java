import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

public class GEOJsonParser {

    JSONObject _jsonObject = null;

    public GEOJsonParser(string filepath){
        ReadFile(filepath);
    }

    private void ReadFile(string filepath){
        Object fileObject = new JSONParser().parse(new FileReader(filepath));
        // typecasting obj to JSONObject
        _jsonObject  = (JSONObject) fileObject;
    }

    public GetBy(string anemity){
        JSONArray ja = (JSONArray) _jsonObject.get(anemity);
    }

}
