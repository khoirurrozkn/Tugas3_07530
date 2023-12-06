package view;

import controller.PakaianController;

import java.util.Scanner;

public class UpdatePakaian implements MustHaveView{
    private PakaianController pakaian;
    private Scanner input;

    public UpdatePakaian(){
        pakaian = new PakaianController();
        input = new Scanner( System.in );
    }

    @Override
    public void view(){
        System.out.println("--------------------------------------------------");
        System.out.println("                  UPDATE PAKAIAN                  ");
        System.out.println("--------------------------------------------------");

        System.out.print("Masukan id pakaian : ");
        int id = input.nextInt();

        System.out.println("Masukan status yang baru : \n");
        System.out.println("- Baru masuk");
        System.out.println("- Process");
        System.out.println("- Siap di ambil");
        System.out.println("Ketik salah satu di antara ketiga pilihan kata tersebut cth ( 'Baru masuk' ) : ");
        String status = input.next();

        script(pakaian.update(id, status));
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    private void script(int responseStatusCode){
        if(responseStatusCode < 400) System.out.println("Data tersebut sudah di update");
        else System.out.println("Data tersebut tidak di temukan");
    }
}
