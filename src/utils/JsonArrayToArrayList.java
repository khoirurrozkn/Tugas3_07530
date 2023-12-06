package utils;

import entity.PakaianEntity;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class JsonArrayToArrayList {
    public static ArrayList<PakaianEntity> convert(JSONArray data){
        ArrayList<PakaianEntity> response = new ArrayList<>();

        for(Object objekPakaian : data){
            JSONObject pakaian = ( JSONObject ) objekPakaian;

            int id = Integer.parseInt( pakaian.get("id").toString() );
            String status = pakaian.get("status").toString();

            response.add( new PakaianEntity( id, status ) );
        }

        return response;
    }

    // method static overload lain apabila ada yang mau ubah dari json ke list
}