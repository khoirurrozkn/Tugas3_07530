package route;

import view.*;

public class Route {
    /**
     * Routing get / view yang menuju tampilan secara langsung tanpa melewati controller
     */
    public static Home home = new Home();
    public static LihatPakaian lihatPakaian = new LihatPakaian();
    public static TambahPakaian tambahPakaian = new TambahPakaian();
    public static UpdatePakaian updatePakaian = new UpdatePakaian();
    public static HapusPakaian hapusPakaian = new HapusPakaian();

    /**
     * Routing post mengandung logika melewati controller
     */

}