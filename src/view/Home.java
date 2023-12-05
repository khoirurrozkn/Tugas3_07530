package view;

import route.Route;

import java.util.Scanner;

public class Home {
    public void view(){
        Scanner input = new Scanner( System.in );

        while( true ){
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

            if ( pilihan == 1 ) Route.home.view();
            else if ( pilihan == 2 ) Route.lihatPakaian.view();
            else if ( pilihan == 3 ) Route.updatePakaian.view();
            else if ( pilihan == 4 ) Route.hapusPakaian.view();
            else if ( pilihan == 5 ) break;
            else System.out.println("Format tidak di temukan");
        }

    }
}