package model;

import org.json.simple.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

abstract class Model {
    protected abstract ArrayList<?> readFromFile();

    protected boolean writeToFile(JSONArray data, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(data.toJSONString());
            fileWriter.flush();
            fileWriter.close();
            return true;
        } catch (IOException error) {
            return false;
        }
    }
}