package filterJson;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.*;
import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        ReadJson readJson = new ReadJson();
        JsonObject geoData = new JsonObject();
        geoData = readJson.ParseJson();
        JsonArray features = geoData.getAsJsonArray("features");
        for(JsonElement ele : features){
            JsonObject featureobj = ele.getAsJsonObject();
            JsonPrimitive type = featureobj.getAsJsonPrimitive("type");
            JsonObject properties = featureobj.getAsJsonObject("properties");
            JsonObject geometry = featureobj.getAsJsonObject("geometry");
            JsonPrimitive id = featureobj.getAsJsonPrimitive("id");
            System.out.println("hej");
        }


//        FilterJson filter = new FilterJson();
//        filter.filterData(geoData);
    }
}
