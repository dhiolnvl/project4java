package projectk4;

import javax.swing.*;
import static projectk4.project4.*; //MENGAMBIL ARRAY DARI CLASS project4
import static projectk4.INPUT.*;    //MENGAMBIL ARRAY DAN VARIABEL DARI CLASS INPUT

public class LIM {

    static void inovasi() {
        if (x == -1) {        //JIKA DATA BELUM DI INPUT
            JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
            ulang = "t";
        } else {             //JIKA DATA SUDAH DI INPUT
            
            sisa = (x + 1) % 8;        //UNTUK HALAMAN PADA LAPORAN
            if (sisa == 0) {
                hal = (x + 1) / 8;
            } else {
                hal = ((x + 1) / 8) + 1;
            }
            if (hal == 1) {
                x1 = 1;
                x2 = (x + 1);
            } else {
                x1 = 1;
                x2 = 8;
            }
            z = 0;
            for (int h = 1; h <= hal; h = h + 1) {
                ak = 0;
                tk = 0;                        //LAPORAN INOVASI MAHASISWA
                rekap += "HAL : " + h + "                           TANGGAL : " + tgl + "/" + bln + "/" + thn + "\n";
                rekap += "========================================== \n";
                rekap += " NO   NAMA TOKO       KERJA SAMA              \n";
                rekap += "========================================== \n";
                if (h == hal) {
                    x2 = (x + 1);
                }
                for (int d = x1; d <= x2; d = d + 1) {
                    g = g + 1;
                    z = z + 1;
                                        //IF UNTUK KETERANGAN PILIHAN PERHALAMAN
                    if ("Y".equals(kerjasama[d - 1]) || "y".equals(kerjasama[d - 1])) {
                        ket7 = "ADA KERJASAMA";
                        ak = ak + 1;
                    } else {
                        ket7 = "TIDAK ADA KERJASAMA";
                        tk = tk + 1;
                    }

                    rekap += " " + z + "   " + nama[d - 1] + "       " + ket7 + "\n";
                }
                rekap += "========================================== \n";
                rekap += "TIDAK ADA KERJA SAMA = " + tk + "\n ";
                rekap += "ADA KERJA SAMA = " + ak + "\n ";
                JOptionPane.showMessageDialog(null, rekap, "REKAP LAPORAN INOVASI MAHASISWA", JOptionPane.INFORMATION_MESSAGE);
                rekap = "";

                x1 = x1 + 8;
                x2 = x2 + 8;
            }
        }
    }

}
