package model;

import entity.PakaianEntity;
import org.json.simple.JsonArray;
import utils.ArrayListToJsonArray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PakaianModel {
    private int id = 1;

    public boolean create( String status ) throws IOException {

        ArrayList<PakaianEntity> newData = new ArrayList<PakaianEntity>();
        newData.add( new PakaianEntity( id, status ) );
        JsonArray jsonArray = ArrayListToJsonArray.convert( newData );

        try{
            FileWriter fileWriter = new FileWriter( "src/data/PakaianData.json" );
            fileWriter.write( jsonArray.toJson() );
            fileWriter.flush();
            fileWriter.close();

            this.id++;
            return true;
        }catch(IOException e){
            throw new RuntimeException( e );
        }
    }

    public PakaianEntity findById( int id ){

        return null;
    }
}