package utils;

import entity.PakaianEntity;
import org.json.simple.JSONArray;
import org.json.simple.JsonObject;

import java.util.ArrayList;

public class ArrayListToJsonArray {
    public static JSONArray convert(ArrayList<PakaianEntity> data ){
        JSONArray response = new JSONArray();

        for ( PakaianEntity value : data ){
            JsonObject jsonObject = new JsonObject();
            jsonObject.put( "id", value.getId() );
            jsonObject.put( "status", value.getStatus() );

            response.add( jsonObject );
        }

        return response;
    }

    // method static overload lain apabila ada yang mau ubah dari list ke json
}