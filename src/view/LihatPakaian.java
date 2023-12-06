package view;

import controller.PakaianController;
import entity.PakaianEntity;

import java.util.ArrayList;

public class LihatPakaian implements MustHaveView {
    private ArrayList<PakaianEntity> pakaian;

    public LihatPakaian(){
        pakaian = new PakaianController().read();
    }

    @Override
    public void view(){
        System.out.println("--------------------------------------------------");
        System.out.println("                   LIHAT PAKAIAN                  ");
        System.out.println("--------------------------------------------------");
        script();
        System.out.println();
    }

    private void script(){
        if(pakaian.isEmpty()) {
            System.out.println("Tidak ada laundry sama sekali");
            System.out.println("--------------------------------------------------");
        }else{
            for(PakaianEntity value : pakaian ){
                System.out.println(value.getId());
                System.out.println(value.getStatus());
                System.out.println("--------------------------------------------------");
            }
        }
    }
}