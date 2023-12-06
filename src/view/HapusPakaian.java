package view;

import controller.PakaianController;

import java.util.Scanner;

public class HapusPakaian implements MustHaveView {
    private PakaianController pakaian;
    private Scanner input;

    public HapusPakaian(){
        pakaian = new PakaianController();
        input = new Scanner( System.in );
    }

    @Override
    public void view(){
        System.out.println("--------------------------------------------------");
        System.out.println("                  HAPUS PAKAIAN                   ");
        System.out.println("--------------------------------------------------");

        System.out.print("Masukan id pakaian : ");
        int id = input.nextInt();

        script(pakaian.delete(id));
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    private void script(int responseStatusCode){
        if(responseStatusCode < 400) System.out.println("Data tersebut sudah di hapus");
        else System.out.println("Data tersebut tidak di temukan");
    }
}
