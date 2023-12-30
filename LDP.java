package projectk4;

import javax.swing.*;
import static projectk4.project4.*; //MENGAMBIL ARRAY DARI CLASS project4
import static projectk4.INPUT.*;    //MENGAMBIL ARRAY DAN VARIABEL DARI CLASS INPUT

public class LDP {

    static void laporandata() {
        if (x == -1) {        //JIKA DATA BELUM DI INPUT
            JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
            ulang = "t";
        } else {            //JIKA DATA SUDAH DI INPUT

            sisa = (x + 1) % 4;            //UNTUK HALAMAN PADA LAPORAN
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
            z = 0;
            for (int h = 1; h <= hal; h = h + 1) {
                p = 0;            //RESET VARIABEL
                s = 0;
                m = 0;
                bb = 0;
                spt = 0;
                bp = 0;
                e = 0;
                ll = 0;
                g = 0;
                                //LAPORAN DATA PEDAGANG
                rekap += "TANGGAL : " + tgl + "/" + bln + "/" + thn + "                                                 HAL : " + h + "\n";
                rekap += "======================================================= \n";
                rekap += " NO   NAMA TOKO       ALAMAT       NAMA PEMILIK      JENIS USAHA \n";
                rekap += "======================================================= \n";
                if (h == hal) {
                    x2 = (x + 1);
                }
                for (int d = x1; d <= x2; d = d + 1) {
                    g = g + 1;
                    z = z + 1;
                    switch (jenus[d - 1]) {      //SWICTH CASE UNTUK KETERANGAN PILIHAN PERHALAMAN
                        case "1": {
                            ket = "PAKAIAN";
                            p = p + 1;
                            break;
                        }
                        case "2": {
                            ket = "SARUNG";
                            s = s + 1;
                            break;
                        }
                        case "3": {
                            ket = "MAKANAN";
                            m = m + 1;
                            break;
                        }
                        case "4": {
                            ket = "SEPATU/TAS";
                            spt = spt + 1;
                            break;
                        }
                        case "5": {
                            ket = "ELEKTRONIK";
                            e = e + 1;
                            break;
                        }
                        case "6": {
                            ket = "BARANG BEKAS";
                            bb = bb + 1;
                            break;
                        }
                        case "7": {
                            ket = "BAHAN POKOK";
                            bp = bp + 1;
                            break;
                        }
                        case "8": {
                            ket = "LAIN-LAIN";
                            ll = ll + 1;
                            break;
                        }
                    }

                    rekap += " " + z + "   " + nama[d - 1] + "       " + alamat[d - 1] + "       " + pemilik[d - 1] + "       " + ket + "\n";

                }
                rekap += "========================================================= \n";
                rekap += " PAKAIAN : " + p + "          SEPATU/TAS : " + spt + "\n";
                rekap += " SARUNG : " + s + "           BAHAN POKOK : " + bp + "\n";
                rekap += " MAKANAN : " + m + "          ELEKTRONIK : " + e + "\n";
                rekap += " BARANG BEKAS : " + bb + "    LAIN - LAIN : " + ll + "\n";
                JOptionPane.showMessageDialog(null, rekap, "LAPORAN DATA PEDAGANG PERHALAMAN", JOptionPane.INFORMATION_MESSAGE);

                rekap = "";
                x1 = x1 + 4;
                x2 = x2 + 4;
                hr = hr + 1;
            }

        }
    }

    static void rekapdata() {
        if (x == -1) {        //JIKA DATA BELUM DI INPUT
            ulang = "t";
        } else {            //JIKA DATA SUDAH DI INPUT
            p = 0;        //RESET VARIABEL
            s = 0;
            m = 0;
            bb = 0;
            spt = 0;
            bp = 0;
            e = 0;
            ll = 0;

            for (int y = 0; y <= x; y = y + 1) {
                switch (jenus[y]) {            //SWITCH CASE UNTUK KETERANGAN PILIHAN
                    case "1": {
                        ket = "PAKAIAN";
                        p = p + 1;
                        break;
                    }
                    case "2": {
                        ket = "SARUNG";
                        s = s + 1;
                        break;
                    }
                    case "3": {
                        ket = "MAKANAN";
                        m = m + 1;
                        break;
                    }
                    case "4": {
                        ket = "SEPATU/TAS";
                        spt = spt + 1;
                        break;
                    }
                    case "5": {
                        ket = "ELEKTRONIK";
                        e = e + 1;
                        break;
                    }
                    case "6": {
                        ket = "BARANG BEKAS";
                        bb = bb + 1;
                        break;
                    }
                    case "7": {
                        ket = "BAHAN POKOK";
                        bp = bp + 1;
                        break;
                    }
                    case "8": {
                        ket = "LAIN-LAIN";
                        ll = ll + 1;
                        break;
                    }
                }

            }                    //LAPORAN DATA PEDAGANG HALAMAN TERAKHIR
            hr = hr + 1;
            rekap += "TANGGAL : " + tgl + "/" + bln + "/" + thn + "                                                 HAL : " + hr + "\n"; //HALAMAN AKHIR
            rekap += "======================================================= \n";
            rekap += " PAKAIAN : " + p + "          SEPATU/TAS : " + spt + "\n";
            rekap += " SARUNG : " + s + "           BAHAN POKOK : " + bp + "\n";
            rekap += " MAKANAN : " + m + "          ELEKTRONIK : " + e + "\n";
            rekap += " BARANG BEKAS : " + bb + "    LAIN - LAIN : " + ll + "\n";
            rekap += "======================================================= \n";
            JOptionPane.showMessageDialog(null, rekap, "REKAP LAPORAN DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
            rekap = "";
            hr = 0;
        }
    }
}
