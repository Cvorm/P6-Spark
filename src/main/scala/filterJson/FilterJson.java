package filterJson;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;

public class FilterJson {
    JSONObject _jsonobject = null;

    public void filterData(JsonObject data){
        for(Iterator iterator = data.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            System.out.println(data.get(key));
            
        }
        System.out.println("yo");
    }
}
