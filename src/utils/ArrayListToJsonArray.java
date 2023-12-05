package utils;

import entity.PakaianEntity;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;

import java.util.ArrayList;

public class ArrayListToJsonArray {
    public static JsonArray convert( ArrayList<PakaianEntity> request ){
        JsonArray jsonArray = new JsonArray();

        for ( PakaianEntity value : request ){
            JsonObject jsonObject = new JsonObject();
            jsonObject.put( "id", value.getId() );
            jsonObject.put( "status", value.getStatus() );

            jsonArray.add( jsonObject );
        }

        return jsonArray;
    }
}