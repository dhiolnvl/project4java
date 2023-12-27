package projectk4;

import javax.swing.*;
import static projectk4.INPUT.*; //MEMANGGIL VARIABEL DARI CLASS INPUT

public class project4 {

    static String mn;                           //DEKLARASI GLOBAL ARRAY
    static boolean putar;

    static String nama[] = new String[20];
    static String alamat[] = new String[20];
    static String pemilik[] = new String[20];
    static String jenus[] = new String[20];
    static int modal[] = new int[20];
    static String penjualan[] = new String[20];
    static String pembelian[] = new String[20];
    static String cabang[] = new String[20];
    static String email[] = new String[20];
    static String sosmed[] = new String[20];
    static String nomor[] = new String[20];
    static String status[] = new String[20];
    static String kerjasama[] = new String[20];

    public static void main(String[] args) {
        INPUT.data();
        do {
            mn = JOptionPane.showInputDialog("  MENU SISTEM PEDAGANG \n" //MENU SISTEM PEDAGANG
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
                    + "                      PILIH [1-8]     \n");
            switch (mn) {
                case "1": {
                    if (x == 19) {
                        JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
                    } else {
                        INPUT.input(); //INPUT DATA
                    }
                    putar = true;
                    break;
                }
                case "2": {
                    EDIT.edit(); //EDIT DATA
                    putar = true;
                    break;
                }
                case "3": {
                    HAPUS.hapus(); //HAPUS DATA
                    putar = true;
                    break;
                }
                case "4": {
                    LDP.laporandata(); //LAPORAN DATA
                    LDP.rekapdata(); //REKAP LAPORAN DATA
                    putar = true;
                    break;
                }
                case "5": {
                    LST.statistik(); //LAPORAN STATISTIK
                    LST.rekapstatistik(); //REKAP STATISTIK5
                    putar = true;
                    break;
                }
                case "6": {
                    LAU.alamat(); //LAPORAN ALAMAT USAHA
                    LAU.rekapalamat();
                    LAU.rekapalamat2();
                    putar = true;
                    break;
                }
                case "7": {
                    LIM.inovasi(); //LAPORAN INOVASI
                    putar = true;
                    break;
                }
                case "8": {
                    System.exit(0);
                    putar = false; //EXIT
                    break;
                }
            }
        } while (putar);
    }
}
