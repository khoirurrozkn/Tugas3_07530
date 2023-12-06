package view;

import java.util.Scanner;

public class Home implements MustHaveView{

    @Override
    public void view(){
        Scanner input = new Scanner( System.in );

        while( true ){
            System.out.println();
            System.out.println("--------------------------------------------------");
            System.out.println("                     LAUNDRY                      ");
            System.out.println("--------------------------------------------------");

            System.out.println("1. Tambah pakaian");
            System.out.println("2. Lihat pakaian");
            System.out.println("3. Update pakaian");
            System.out.println("4. Hapus pakaian");
            System.out.println("5. Exit");
            System.out.println("--------------------------------------------------");

            System.out.print("Masukan pilihan : ");
            int pilihan = input.nextInt();

            if ( pilihan == 1 ) ( new TambahPakaian() ).view();
            else if ( pilihan == 2 ) ( new LihatPakaian() ).view();
            else if ( pilihan == 3 ) ( new UpdatePakaian() ).view();
            else if ( pilihan == 4 ) ( new HapusPakaian() ).view();
            else if ( pilihan == 5 ) break;
            else System.out.println("Format tidak di temukan");
        }
    }
}