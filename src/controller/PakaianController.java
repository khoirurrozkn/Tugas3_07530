package controller;

import entity.PakaianEntity;
import model.PakaianModel;

import java.util.ArrayList;

public class PakaianController{

    private final PakaianModel pakaianModel;

    public PakaianController() {
        this.pakaianModel = PakaianModel.getInstance();
    }

    public int create() {
        try {
            pakaianModel.create();
            return 204;
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public ArrayList<PakaianEntity> read() {
        try {
            return pakaianModel.showAll();
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public int update(int id, String status) {
        if (!status.equals("Baru masuk") && !status.equals("Process") && !status.equals("Siap diambil")) {
            return 400;
        }

        try {
            if (!pakaianModel.findById(id)) return 404;

            pakaianModel.findByIdAndUpdate(id, status);
            return 204;
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }

    public int delete(int id) {
        try {
            if (!pakaianModel.findById(id)) return 404;

            pakaianModel.findByIdAndDelete(id);
            return 204;
        } catch (Exception error) {
            throw new RuntimeException(error.getMessage());
        }
    }
}