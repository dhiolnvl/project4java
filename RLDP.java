package projectk4;

import javax.swing.*;
import static projectk4.project4.*;
import static projectk4.INPUT.*;

public class RLDP {

    static void rekapseluruh() {
        p = 0;
        s = 0;
        m = 0;
        bb = 0;
        spt = 0;
        bp = 0;
        e = 0;
        ll = 0;

        for (int y = 0; y <= x; y = y + 1) {
            switch (jenus[y]) {
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

        }
        rekap += "TANGGAL : " + tgl + "/" + bln + "/" + thn + "\n";
        rekap += "======================================================= \n";
        rekap += " PAKAIAN : " + p + "          SEPATU/TAS : " + spt + "\n";
        rekap += " SARUNG : " + s + "           BAHAN POKOK : " + bp + "\n";
        rekap += " MAKANAN : " + m + "          ELEKTRONIK : " + e + "\n";
        rekap += " BARANG BEKAS : " + bb + "    LAIN - LAIN : " + ll + "\n";
        rekap += "======================================================= \n";
        JOptionPane.showMessageDialog(null, rekap, "REKAP LAPORAN DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
        rekap = "";

    }
}
