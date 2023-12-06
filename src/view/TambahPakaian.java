package view;

import controller.PakaianController;


public class TambahPakaian implements MustHaveView{
    private PakaianController pakaian;

    public TambahPakaian(){
        pakaian = new PakaianController();
    }

    @Override
    public void view(){
        PakaianController pakaian = new PakaianController();
        System.out.println("--------------------------------------------------");
        System.out.println("                   TAMBAH PAKAIAN                 ");
        System.out.println("--------------------------------------------------");

        this.script(pakaian.create());
    }

    private void script(int responseStatusCode){
        if(responseStatusCode < 400) System.out.println("Data sudah di tambahkan");
        else System.out.println("Data gagal di tambahkan");
    }


}