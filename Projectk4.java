package projectk4;
import javax.swing.*;
public class Projectk4 {
    static String mn;
    static boolean putar;
    public static void main(String[] args) 
    {
        MENU.info();
         do{
            mn = JOptionPane.showInputDialog("  MENU SISTEM PEDAGANG \n"
                + "      KOTA PEKALONGAN \n"
                + "        DAN SEKITARNYA \n"
                + "1. INPUT DATA PEDAGANG \n"
                + "2. EDIT DATA PEDAGANG \n"
                + "3. HAPUS DATA PEDAGANG \n"
                + "4. LAPORAN DATA PEDAGANG \n"
                + "5. LAPORAN STATISTIK \n"
                + "6. LAPORAN ALAMAT USAHA \n"
                + "7. LAPORAN INOVASI MAHASISWA \n"
                + "8. EXIT \n"
                + "                         PILIH [1-8]     \n");
            switch(mn)
            {
                case "1" :
                {
                    MENU.input();
                    putar = true;
                    break;
                }
                case "2" :
                {
                    MENU.edit();
                    putar = true;
                    break;
                }
                case "3" :
                {
                    MENU.hapus();
                    putar = true;
                    break;
                }
                case "4" :
                {
                    MENU.rekapdata();
                    putar = true;
                    break;
                }
                case "8" :
                {
                    System.exit(0); putar = false;
                    break;
                }
            }
         }
         while(putar);
    }
    
}
