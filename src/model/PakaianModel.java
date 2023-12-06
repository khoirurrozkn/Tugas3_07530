package model;

import entity.PakaianEntity;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import utils.ArrayListToJsonArray;
import utils.JsonArrayToArrayList;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class PakaianModel extends Model {
    private int id;
    private ArrayList<PakaianEntity> pakaian;
    private final String path;
    private static PakaianModel singleton;

    public PakaianModel() {
        this.path = "src/data/PakaianData.json";
        this.pakaian = readFromFile();
        this.id = 1;
    }

    public static PakaianModel getInstance() {
        if (singleton == null) singleton = new PakaianModel();
        return singleton;
    }

    @Override
    protected ArrayList<PakaianEntity> readFromFile(){
        if(  !( new File(this.path) ).exists() ) return new ArrayList<>();

        JSONParser parser = new JSONParser();

        try{
            Reader reader = new FileReader(this.path);
            System.out.println(reader);
            JSONArray arrayBuku = ( JSONArray ) parser.parse(reader);
            return JsonArrayToArrayList.convert(arrayBuku);
        }catch (IOException | ParseException error){
            throw new RuntimeException(error.getMessage());
        }
    }

    public boolean create(){
        this.pakaian.add( new PakaianEntity( this.id, "Baru masuk" ) );
        this.id++;
        JSONArray data = ArrayListToJsonArray.convert( this.pakaian );
        return writeToFile(data, this.path);
    }

    public ArrayList<PakaianEntity> showAll(){
        return this.pakaian;
    }

    public boolean findById(int id){
        for(PakaianEntity value : this.pakaian){
            if(value.getId() == id){
                return true;
            }
        }
        return false;
    }

    public boolean findByIdAndUpdate(int id, String status) {
        for (PakaianEntity value : this.pakaian) {
            if (value.getId() == id) {
                value.setStatus(status);
                this.writeToFile(ArrayListToJsonArray.convert(this.pakaian), this.path);
                return true;
            }
        }
        return false;
    }

    public boolean findByIdAndDelete(int id){
        if(this.pakaian.removeIf(pakaian -> pakaian.getId() == id)){
            this.writeToFile(ArrayListToJsonArray.convert(this.pakaian), this.path);
            return true;
        }
        return false;
    }
}