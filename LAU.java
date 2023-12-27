package projectk4;

import javax.swing.*;
import static projectk4.project4.*; //MENGAMBIL ARRAY DARI CLASS project4
import static projectk4.INPUT.*;    //MENGAMBIL ARRAY DAN VARIABEL DARI CLASS INPUT

public class LAU {

    static void alamat() {
        if (x == -1) {
            JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
            ulang = "t";
        } else {
            sisa = (x + 1) % 6;
            if (sisa == 0) {
                hal = (x + 1) / 6;
            } else {
                hal = ((x + 1) / 6) + 1;
            }
            if (hal == 1) {
                x1 = 1;
                x2 = (x + 1);
            } else {
                x1 = 1;
                x2 = 6;
            }
            
            for (int h = 1; h <= hal; h = h + 1) {
                tme = 0;
                tmt = 0;
                z = 0;
                fb = 0;
                wa = 0;
                ig = 0;
                tele = 0;
                dll = 0;
                rekap += "HAL : " + h + "                                                   TANGGAL : " + tgl + "/" + bln + "/" + thn + "\n";
                rekap += "======================================================= \n";
                rekap += " NO   NAMA TOKO       MEDIA SOSIAL       EMAIL      TELPON/HP\n";
                rekap += "======================================================= \n";
                if (h == hal) {
                    x2 = (x + 1);
                }
                for (int d = x1; d <= x2; d = d + 1) {
                    g = g + 1;
                    z = z + 1;

                    switch (sosmed[d - 1]) {
                        case "1": {
                            ket5 = "FACEBOOK";
                            fb = fb + 1;
                            break;
                        }
                        case "2": {
                            ket5 = "WHATSAPP";
                            wa = wa + 1;
                            break;
                        }
                        case "3": {
                            ket5 = "INSTAGRAM";
                            ig = ig + 1;
                            break;
                        }
                        case "4": {
                            ket5 = "TELEGRAM";
                            tele = tele + 1;
                            break;
                        }
                        case "5": {
                            ket5 = "DAN LAIN-LAIN";
                            dll = dll + 1;
                            break;
                        }
                    }
                    
                    if (email[d-1].length() > 1) {
                        tme = tme + 1;
                    }
                    if (nomor[d-1].length() > 1) {
                        tmt = tmt + 1;
                        }
                    

                    rekap += " " + z + "   " + nama[d - 1] + "       " + ket5 + "       " + email[d - 1] + "       " + nomor[d - 1] + "\n";

                }

                rekap += "========================================================= \n";
                rekap += " JUMLAH TOKO YANG MEMILIKI EMAIL : " + tme + "\n";
                rekap += " JUMLAH TOKO YANG MEMILIKI TELPON : " + tmt + "\n";
                rekap += " FB = " + fb + "   WA = " + wa + "   IG = " + ig + "   TELEGRAM = " + tele + "   DLL = " + dll + "\n";
                JOptionPane.showMessageDialog(null, rekap, "LAPORAN ALAMAT USAHA", JOptionPane.INFORMATION_MESSAGE);
                rekap = "";

                x1 = x1 + 6;
                x2 = x2 + 6;
            }
        }
    }

    static void rekapalamat() {
        if (x == -1) {
            ulang = "t";
        } else {
            tme = 0;
            tmt = 0;
            fb = 0;
            wa = 0;
            ig = 0;
            tele = 0;
            dll = 0;
            for (int y = 0; y <= x; y = y + 1) {
                switch (sosmed[y]) {
                    case "1": {
                        ket5 = "FACEBOOK";
                        fb = fb + 1;
                        break;
                    }
                    case "2": {
                        ket5 = "WHATSAPP";
                        wa = wa + 1;
                        break;
                    }
                    case "3": {
                        ket5 = "INSTAGRAM";
                        ig = ig + 1;
                        break;
                    }
                    case "4": {
                        ket5 = "TELEGRAM";
                        tele = tele + 1;
                        break;
                    }
                    case "5": {
                        ket5 = "DAN LAIN-LAIN";
                        dll = dll + 1;
                        break;
                    }
                }
                if (email[y].length() > 1) {
                        tme = tme + 1;
                    }
                    if (nomor[y].length() > 1) {
                        tmt = tmt + 1;
                        }

            }
            rekap += "======================================================= \n";
            rekap += " TOTAL KESELURUHAN      EMAIL = " + tme + "       TELPON = " + tmt + "\n";
            rekap += " TOTAL MEDIA SOSIAL : " + "\n";
            rekap += " FB = " + fb + "   WA = " + wa + "   IG = " + ig + "   TELEGRAM = " + tele + "   DLL = " + dll + "\n";
            rekap += "======================================================= \n";
            JOptionPane.showMessageDialog(null, rekap, "REKAP LAPORAN ALAMAT USAHA", JOptionPane.INFORMATION_MESSAGE);
            rekap = "";
        }
    }

    static void rekapalamat2() {
        if (x == -1) {
            JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
            ulang = "t";
        } else {
            
            sisa = (x + 1) % 6;
            if (sisa == 0) {
                hal = (x + 1) / 6;
            } else {
                hal = ((x + 1) / 6) + 1;
            }
            if (hal == 1) {
                x1 = 1;
                x2 = (x + 1);
            } else {
                x1 = 1;
                x2 = 6;
            }
            z = 0;
            for (int h = 1; h <= hal; h = h + 1) {
                tnmo = 0;
                fb = 0;
                wa = 0;
                ig = 0;
                tele = 0;
                dll = 0;
                rekap += "                LAPORAN ALAMAT PEDAGANG DI " + tempat + "\n";
                rekap += "                          PEKALONGAN BULAN " + kett + " TAHUN " + tahun + "\n";
                rekap += "HAL : " + h + "\n";
                rekap += "======================================================= \n";
                rekap += " NO   NAMA TOKO       ALAMAT       NAMA PEMILIK      STATUS\n";
                rekap += "======================================================= \n";
                if (h == hal) {
                    x2 = (x + 1);
                }
                for (int d = x1; d <= x2; d = d + 1) {
                    g = g + 1;
                    z = z + 1;
                    if ("N".equals(status[d - 1]) || "n".equals(status[d - 1])) {
                        ket6 = "NIKAH";
                    } else {
                        ket6 = "BELUM";
                    }
                    rekap += " " + z + "   " + nama[d - 1] + "       " + alamat[d - 1] + "       " + pemilik[d - 1] + "       " + ket6 + "\n";
                    tnmo = tnmo + modal[d - 1];
                }

                rekap += "========================================================== \n";
                rekap += " TOTAL KESELURUHAN MODAL : " + tnmo + "      [TEKAN ENTER UNTUK LANJUT] " + "\n";
                JOptionPane.showMessageDialog(null, rekap, "LAPORAN ALAMAT USAHA", JOptionPane.INFORMATION_MESSAGE);
                rekap = "";
                x1 = x1 + 6;
                x2 = x2 + 6;
            }
        }
    }

}
