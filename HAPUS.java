package projectk4;

import javax.swing.*;
import static projectk4.project4.*; //MENGAMBIL ARRAY DARI CLASS project4
import static projectk4.INPUT.*;    //MENGAMBIL ARRAY DAN VARIABEL DARI CLASS INPUT

public class HAPUS {

    static void hapus() {
        do {
            if (x == -1) {            //JIKA DATA BELUM DIINPUT
                JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
                ulang = "t";
            } else {                 //JIKA DATA SUDAH DIINPUT
                do {
                    try {
                        dh = JOptionPane.showInputDialog(" DATA YANG AKAN DIHAPUS [1 - " + (x + 1) + "]");//MEMILIH DATA YANG AKAN DIHAPUS
                        nh = Integer.parseInt(dh);
                        putar = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, " DATA SALAH, ULANGI");
                        putar = true;
                    }
                } while (putar || (!(nh >= 1 && nh <= (x + 1))));
                                        //IDENTIFIKASI KETERANGAN JENIS USAHA
                switch (jenus[nh - 1]) {
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
                            //IDENTIFIKASI KETERANGAN PENJUALAN
                if ("D".equals(penjualan[nh - 1]) || "d".equals(penjualan[nh - 1])) {
                    ket2 = "DALAM NEGERI";
                } else if ("L".equals(penjualan[nh - 1]) || "l".equals(penjualan[nh - 1])) {
                    ket2 = "LUAR NEGERI";
                } else {
                    ket2 = "DALAM DAN LUAR NEGERI";
                }
                            //IDENTIFIKASI KETERANGAN PEMBELIAN
                if ("D".equals(pembelian[nh - 1]) || "d".equals(pembelian[nh - 1])) {
                    ket3 = "DOMESTIK";
                } else if ("L".equals(pembelian[nh - 1]) || "l".equals(pembelian[nh - 1])) {
                    ket3 = "LUAR";
                } else {
                    ket3 = "CAMPURAN";
                }
                            //IDENTIFIKASI KETERANGAN CABANG
                if ("T".equals(cabang[nh - 1]) || "t".equals(cabang[nh - 1])) {
                    ket4 = "TIDAK ADA";
                } else {
                    ket4 = "ADA";
                }
                            //IDENTIFIKASI KETERANGAN SOSMED
                switch (sosmed[nh - 1]) {
                    case "1": {
                        ket5 = "FACEBOOK";
                        break;
                    }
                    case "2": {
                        ket5 = "WHATSAPP";
                        break;
                    }
                    case "3": {
                        ket5 = "INSTAGRAM";
                        break;
                    }
                    case "4": {
                        ket5 = "TELEGRAM";
                        break;
                    }
                    case "5": {
                        ket5 = "DAN LAIN-LAIN";
                        break;
                    }
                }
                            //IDENTIFIKASI KETERANGAN STATUS
                if ("N".equals(status[nh - 1]) || "n".equals(status[nh - 1])) {
                    ket6 = "NIKAH";
                } else {
                    ket6 = "BELUM";
                }
                            //IDENTIFIKASI KETERANGAN KERJASAMA
                if ("Y".equals(kerjasama[nh - 1]) || "y".equals(kerjasama[nh - 1])) {
                    ket7 = "ADA KERJASAMA";
                } else {
                    ket7 = "TIDAK ADA KERJASAMA";
                }                                    //REKAP DATA YANG DIHAPUS
                hasil += "                                             DATA PEDAGANG           \n";
                hasil += "==========================================================\n";
                hasil += "NAMA TOKO = " + nama[nh - 1] + "\n";
                hasil += "ALAMAT = " + alamat[nh - 1] + "\n";
                hasil += "NAMA PEMILIK = " + pemilik[nh - 1] + "\n";
                hasil += "JENIS USAHA = " + ket + "\n";
                hasil += "MODAL = " + modal[nh - 1] + "\n";
                hasil += "PENJUALAN = " + ket2 + "\n";
                hasil += "PEMBELI = " + ket3 + "\n";
                hasil += "CABANG = " + ket4 + "\n";
                hasil += "ALAMAT EMAIL = " + email[nh - 1] + "\n";
                hasil += "SOSIAL MEDIA = " + ket5 + "\n";
                hasil += "NO TELPON / HP = " + nomor[nh - 1] + "\n";
                hasil += "STATUS PEMILIK = " + ket6 + "\n";
                hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN = " + ket7 + "\n";
                hasil += "==========================================================\n";

                JOptionPane.showMessageDialog(null, hasil, "LAPORAN DATA PEDAGANG NO " + nh + " YANG AKAN DIHAPUS", JOptionPane.INFORMATION_MESSAGE);
                hasil = "";
                if (nh >= 1 && nh < x + 1) {            //MENGHAPUS DATA
                    for (int n = nh; n <= x; n = n + 1) {
                        nama[n - 1] = nama[n];
                        alamat[n - 1] = alamat[n];
                        pemilik[n - 1] = pemilik[n];
                        jenus[n - 1] = jenus[n];
                        modal[n - 1] = modal[n];
                        penjualan[n - 1] = penjualan[n];
                        pembelian[n - 1] = pembelian[n];
                        cabang[n - 1] = cabang[n];
                        email[n - 1] = email[n];
                        sosmed[n - 1] = sosmed[n];
                        nomor[n - 1] = nomor[n];
                        status[n - 1] = status[n];
                        kerjasama[n - 1] = kerjasama[n];
                    }
                }
                do {
                    ulang = JOptionPane.showInputDialog("HAPUS DATA LAGI [Y/T]");
                    x = x - 1;
                    no = no - 1;
                    if (x < 0) {        //JIKA DATA SUDAH HABIS
                        JOptionPane.showMessageDialog(null, "DATA HABIS");
                    }
                } while (!("Y".equals(ulang) | "y".equals(ulang) | "t".equals(ulang) | "T".equals(ulang)));
            }
        } while ("Y".equals(ulang) || "y".equals(ulang));
    }
}
