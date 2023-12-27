package projectk4;

import javax.swing.*;
import static projectk4.project4.*; //MENGAMBIL ARRAY DARI CLASS project4
import static projectk4.INPUT.*;    //MENGAMBIL ARRAY DAN VARIABEL DARI CLASS INPUT

public class LST {

    static void statistik() {
        if (x == -1) {
            JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
            ulang = "t";
        } else {
            sisa = (x + 1) % 4;
            if (sisa == 0) {
                hal = (x + 1) / 4;
            } else {
                hal = ((x + 1) / 4) + 1;
            }
            if (hal == 1) {
                x1 = 1;
                x2 = (x + 1);
            } else {
                x1 = 1;
                x2 = 4;
            }
            g = 0;
            for (int h = 1; h <= hal; h = h + 1) {
                z = 0;
                bnd = 0;
                bnc = 0;
                bnl = 0;
                jnd = 0;
                jnl = 0;
                jns = 0;
                cnt = 0;
                cna = 0;
                tnmo = 0;
                rekap += "TANGGAL : " + tgl + "/" + bln + "/" + thn + "                                                 HAL : " + h + "\n";
                rekap += "======================================================= \n";
                rekap += " NO   NAMA TOKO       MODAL       PENJUALAN      PEMBELI     CABANG \n";
                rekap += "======================================================= \n";
                if (h == hal) {
                    x2 = (x + 1);
                }
                for (int d = x1; d <= x2; d = d + 1) {
                    z = z + 1;
                    if ("D".equals(penjualan[d - 1]) || "d".equals(penjualan[d - 1])) {
                        ket2 = "DALAM NEGERI";
                        jnd = jnd + 1;
                    } else if ("L".equals(penjualan[d - 1]) || "l".equals(penjualan[d - 1])) {
                        ket2 = "LUAR NEGERI";
                        jnl = jnl + 1;
                    } else {
                        ket2 = "DALAM DAN LUAR NEGERI";
                        jns = jns + 1;
                    }

                    if ("D".equals(pembelian[d - 1]) || "d".equals(pembelian[d - 1])) {
                        ket3 = "DOMESTIK";
                        bnd = bnd + 1;
                    } else if ("L".equals(pembelian[d - 1]) || "l".equals(pembelian[d - 1])) {
                        ket3 = "LUAR";
                        bnl = bnl + 1;
                    } else {
                        ket3 = "CAMPURAN";
                        bnc = bnc + 1;
                    }

                    if ("T".equals(cabang[d - 1]) || "t".equals(cabang[d - 1])) {
                        ket4 = "TIDAK ADA";
                        cnt = cnt + 1;
                    } else {
                        ket4 = "ADA";
                        cna = cna + 1;
                    }

                    rekap += " " + z + "   " + nama[d - 1] + "       " + modal[d - 1] + "       " + ket2 + "       " + ket3 + "       " + ket4 + "\n";
                    tnmo = tnmo + modal[d - 1];
                    
                }
                
                rekap += "========================================================= \n";
                rekap += " PEMBELI  : D = " + bnd + "  C = " + bnc + "  L = " + bnl + "\n";
                rekap += " PENJUALAN  : D = " + jnd + "  L = " + jnl + "  S = " + jns + "\n";
                rekap += " CABANG  : T = " + cnt + "  A = " + cna + "\n";
                rekap += " TOTAL MODAL : " + tnmo;

                JOptionPane.showMessageDialog(null, rekap, "LAPORAN STATISTIK PERHALAMAN", JOptionPane.INFORMATION_MESSAGE);
                rekap = "";
                x1 = x1 + 4;
                x2 = x2 + 4;
                hr = hr + 1;
            }
            
        }
    }

    static void rekapstatistik() {
        if (x == -1) {
            ulang = "t";
        } else {
            bnd = 0;
            bnc = 0;
            bnl = 0;
            jnd = 0;
            jnl = 0;
            jns = 0;
            cnt = 0;
            cna = 0;
            tnmo = 0;
            for (int y = 0; y <= x; y = y + 1) {
                g = g + 1;
                if ("D".equals(penjualan[y]) || "d".equals(penjualan[y])) {
                    ket2 = "DALAM NEGERI";
                    jnd = jnd + 1;
                } else if ("L".equals(penjualan[y]) || "l".equals(penjualan[y])) {
                    ket2 = "LUAR NEGERI";
                    jnl = jnl + 1;
                } else {
                    ket2 = "DALAM DAN LUAR NEGERI";
                    jns = jns + 1;
                }

                if ("D".equals(pembelian[y]) || "d".equals(pembelian[y])) {
                    ket3 = "DOMESTIK";
                    bnd = bnd + 1;
                } else if ("L".equals(pembelian[y]) || "l".equals(pembelian[y])) {
                    ket3 = "LUAR";
                    bnl = bnl + 1;
                } else {
                    ket3 = "CAMPURAN";
                    bnc = bnc + 1;
                }

                if ("T".equals(cabang[y]) || "t".equals(cabang[y])) {
                    ket4 = "TIDAK ADA";
                    cnt = cnt + 1;
                } else {
                    ket4 = "ADA";
                    cna = cna + 1;
                }
                tnmo = tnmo + modal[y];
            }
            rnmo = (rnmo + tnmo) / g;
            hr = hr + 1;
            rekap += "TANGGAL : " + tgl + "/" + bln + "/" + thn + "                                                 HAL : " + hr + "\n"; //HALAMAN AKHIR
            rekap += "======================================================= \n";
            rekap += " PEMBELI      :   D = " + bnd + "\n";
            rekap += "                           C = " + bnc + "\n";
            rekap += "                           L = " + bnl + "\n";
            rekap += " PENJUALAN    :   D = " + jnd + "\n";
            rekap += "                               L = " + jnl + "\n";
            rekap += "                               S = " + jns + "\n";
            rekap += " CABANG       :   T = " + cnt + "\n";
            rekap += "                            A = " + cna + "\n";
            rekap += " RATA-RATA MODAL  :  " + rnmo + "\n";
            rekap += "======================================================= \n";
            JOptionPane.showMessageDialog(null, rekap, "REKAP LAPORAN STATISITK", JOptionPane.INFORMATION_MESSAGE);
            rekap = "";
            hr = 0;
            rnmo = 0;
        }
    }
}
