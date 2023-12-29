package projectk4;

import javax.swing.*;
import static projectk4.project4.*; //MENGAMBIL ARRAY DARI CLASS project4
import static projectk4.INPUT.*;    //MENGAMBIL ARRAY DAN VARIABEL DARI CLASS INPUT

public class EDIT {

    static void edit() {
        do {
            if (x == -1) {                //JIKA DATA BELUM DIINPUT
                JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
                ulang = "t";
            } else {                      //JIKA DATA SUDAH DIINPUT
                do {
                    try {
                        do {
                            ruang = true;
                            nr = JOptionPane.showInputDialog("NOMOR RUANG [1 - " + (x + 1) + "]");//MEMILIH DATA YANG AKAN DIEDIT
                            ed = Integer.parseInt(nr);
                            if (ed >= 1 & (ed <= x + 1)) {
                                ruang = false;
                            }
                        } while (ruang);
                        salah = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                        salah = true;
                    }
                } while (salah);
                                                //IDENTIFIKASI KETERANGAN JENIS USAHA
                switch (jenus[ed - 1]) {
                    case "1": {
                        ket = "PAKAIAN";
                        break;
                    }
                    case "2": {
                        ket = "SARUNG";
                        break;
                    }
                    case "3": {
                        ket = "MAKANAN";
                        break;
                    }
                    case "4": {
                        ket = "SEPATU/TAS";
                        break;
                    }
                    case "5": {
                        ket = "ELEKTRONIK";
                        break;
                    }
                    case "6": {
                        ket = "BARANG BEKAS";
                        break;
                    }
                    case "7": {
                        ket = "BAHAN POKOK";
                        break;
                    }
                    case "8": {
                        ket = "LAIN-LAIN";
                        break;
                    }
                }
                                    //IDENTIFIKASI KETERANGAN PENJUALAN
                if ("D".equals(penjualan[ed - 1]) || "d".equals(penjualan[ed - 1])) {
                    ket2 = "DALAM NEGERI";
                } else if ("L".equals(penjualan[ed - 1]) || "l".equals(penjualan[ed - 1])) {
                    ket2 = "LUAR NEGERI";
                } else {
                    ket2 = "DALAM DAN LUAR NEGERI";
                }
                                    //IDENTIFIKASI KETERANGAN PEMBELIAN
                if ("D".equals(pembelian[ed - 1]) || "d".equals(pembelian[ed - 1])) {
                    ket3 = "DOMESTIK";
                } else if ("L".equals(pembelian[ ed- 1]) || "l".equals(pembelian[ed - 1])) {
                    ket3 = "LUAR";
                } else {
                    ket3 = "CAMPURAN";
                }
                                    //IDENTIFIKASI KETERANGAN CABANG
                if ("T".equals(cabang[ed - 1]) || "t".equals(cabang[ed - 1])) {
                    ket4 = "TIDAK ADA";
                } else {
                    ket4 = "ADA";
                }
                                    //IDENTIFIKASI KETERANGAN SOSMED
                switch (sosmed[ed - 1]) {
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
                if ("N".equals(status[ed - 1]) || "n".equals(status[ed - 1])) {
                    ket6 = "NIKAH";
                } else {
                    ket6 = "BELUM";
                }
                                    //IDENTIFIKASI KETERANGAN KERJASAMA
                if ("Y".equals(kerjasama[ed - 1]) || "y".equals(kerjasama[ed - 1])) {
                    ket7 = "ADA KERJASAMA";
                } else {
                    ket7 = "TIDAK ADA KERJASAMA";
                }                                //REKAP DATA YANG DIPILIH
                hasil += "                                             DATA PEDAGANG           \n";
                hasil += "==========================================================\n";
                hasil += "NAMA TOKO    = " + nama[ed- 1] + "\n";
                hasil += "ALAMAT    = " + alamat[ed - 1] + "\n";
                hasil += "NAMA PEMILIK    = " + pemilik[ed - 1] + "\n";
                hasil += "JENIS USAHA    = " + ket + "\n";
                hasil += "MODAL    = " + modal[ed - 1] + "\n";
                hasil += "PENJUALAN    = " + ket2 + "\n";
                hasil += "PEMBELI    = " + ket3 + "\n";
                hasil += "CABANG    = " + ket4 + "\n";
                hasil += "ALAMAT EMAIL    = " + email[ed - 1] + "\n";
                hasil += "SOSIAL MEDIA    = " + ket5 + "\n";
                hasil += "NO TELPON / HP    = " + nomor[ed - 1] + "\n";
                hasil += "STATUS PEMILIK    = " + ket6 + "\n";
                hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN    = " + ket7 + "\n";
                hasil += "==========================================================\n";

                JOptionPane.showMessageDialog(null, hasil, "LAPORAN DATA PEDAGANG NO " + ed + " YANG AKAN DIEDIT", JOptionPane.INFORMATION_MESSAGE);
                hasil = "";

                edit = JOptionPane.showInputDialog("DATA YANG AKAN DIEDIT \n" //MEMILIH YANG AKAN DIEDIT
                        + "1. NAMA TOKO \n"
                        + "2. ALAMAT \n"
                        + "3. NAMA PEMILIK \n"
                        + "4. JENIS USAHA \n"
                        + "5. MODAL \n"
                        + "6. PENJUALAN \n"
                        + "7. PEMBELI \n"
                        + "8. CABANG \n"
                        + "9. ALAMAT EMAIL \n"
                        + "10. SOSIAL MEDIA \n"
                        + "11. NO TELPON / HP \n"
                        + "12. STATUS PEMILIK [NIKAH/BELUM] \n"
                        + "13. KERJASAMA PERUSAHAAN / ORANG LAIN \n"
                        + "14. EDIT KESELURUHAN \n"
                        + "[PILIH 1-14]");
                switch (edit) {
                    case "1": {        //EDIT NAMA TOKO
                        na = JOptionPane.showInputDialog("NAMA TOKO");
                        nama[ed - 1] = na;
                        break;
                    }
                    case "2": {        //EDIT ALAMAT
                        al = JOptionPane.showInputDialog("ALAMAT");
                        alamat[ed - 1] = al;
                        break;
                    }
                    case "3": {        //EDIT NAMA PEMILIK
                        np = JOptionPane.showInputDialog("NAMA PEMILIK");
                        pemilik[ed - 1] = np;
                        break;
                    }
                    case "4": {        //EDIT JENIS USAHA
                        do {
                            jenis = JOptionPane.showInputDialog("JENIS USAHA \n"
                                    + "1. PAKAIAN \n"
                                    + "2. SARUNG \n"
                                    + "3. MAKANAN \n"
                                    + "4. SEPATU/TAS \n"
                                    + "5. ELEKTRONIK \n"
                                    + "6. BARANG BEKAS \n"
                                    + "7. BAHAN POKOK \n"
                                    + "8. LAIN-LAIN \n");
                            switch (jenis) {         //SWITCH CASE UNTUK KETERANGAN PILIHAN
                                case "1": {
                                    ket = "PAKAIAN";
                                    break;
                                }
                                case "2": {
                                    ket = "SARUNG";
                                    break;
                                }
                                case "3": {
                                    ket = "MAKANAN";
                                    break;
                                }
                                case "4": {
                                    ket = "SEPATU/TAS";
                                    break;
                                }
                                case "5": {
                                    ket = "ELEKTRONIK";
                                    break;
                                }
                                case "6": {
                                    ket = "BARANG BEKAS";
                                    break;
                                }
                                case "7": {
                                    ket = "BAHAN POKOK";
                                    break;
                                }
                                case "8": {
                                    ket = "LAIN-LAIN";
                                    break;
                                }
                            }
                        } while (!("1".equals(jenis) || "2".equals(jenis) || "3".equals(jenis) || "4".equals(jenis) || "5".equals(jenis) || "6".equals(jenis) || "7".equals(jenis) || "8".equals(jenis)));
                        jenus[ed - 1] = jenis;
                        break;
                    }
                    case "5": {        //EDIT MODAL
                        do {
                            try {
                                mod = JOptionPane.showInputDialog("MODAL");
                                nmo = Integer.parseInt(mod);
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                                salah = true;
                            }
                        } while (salah);
                        modal[ed - 1] = nmo;
                        break;
                    }
                    case "6": {        //EDIT PENJUALAN
                        do {
                            pj = JOptionPane.showInputDialog("PENJUALAN \n"
                                    + "D. DALAM NEGERI \n"
                                    + "L. LUAR NEGERI \n"
                                    + "S. DALAM DAN LUAR NEGERI \n");
                        } while (!("D".equals(pj) || "L".equals(pj) || "S".equals(pj) || "d".equals(pj) || "l".equals(pj) || "s".equals(pj)));
                        penjualan[ed - 1] = pj;
                        
                        if ("D".equals(pj) || "d".equals(pj)) {  //IF UNTUK KETERANGAN PILIHAN
                            ket2 = "DALAM NEGERI";
                        } else if ("L".equals(pj) || "l".equals(pj)) {
                            ket2 = "LUAR NEGERI";
                        } else {
                            ket2 = "DALAM DAN LUAR NEGERI";
                        }

                        break;
                    }
                    case "7": {        //EDIT PEMBELI
                        do {
                            pb = JOptionPane.showInputDialog("PEMBELI \n"
                                    + "D. DOMESTIK \n"
                                    + "L. LUAR \n"
                                    + "C. CAMPURAN \n");
                        } while (!("D".equals(pb) || "L".equals(pb) || "C".equals(pb) || "d".equals(pb) || "l".equals(pb) || "c".equals(pb)));
                        pembelian[ed - 1] = pb;

                        if ("D".equals(pb) || "d".equals(pb)) {    //IF UNTUK KETERANGAN PILIHAN
                            ket3 = "DOMESTIK";
                        } else if ("L".equals(pb) || "l".equals(pb)) {
                            ket3 = "LUAR";
                        } else {
                            ket3 = "CAMPURAN";
                        }
                        break;
                    }
                    case "8": {        //EDIT CABANG
                        do {
                            cb = JOptionPane.showInputDialog("CABANG \n"
                                    + "T. TIDAK ADA  A. ADA\n");
                        } while (!("T".equals(cb) || "A".equals(cb) || "t".equals(cb) || "a".equals(cb)));
                        cabang[ed - 1] = cb;

                        if ("T".equals(cb) || "t".equals(cb)) {    //IF UNTUK KETERANGAN PILIHAN
                            ket4 = "TIDAK ADA";
                        } else {
                            ket4 = "ADA";
                        }
                        break;
                    }
                    case "9": {        //EDIT EMAIL
                        ale = JOptionPane.showInputDialog("ALAMAT EMAIL");
                        email[ed - 1] = ale;
                        break;
                    }
                    case "10": {        //EDIT SOSMED
                        do {
                            sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"
                                    + "1. FACEBOOK  \n2. WHATSAPP  \n3. INSTAGRAM  \n4. TELEGRAM  \n5. DLL");
                            switch (sm) {          //SWITCH CASE UNTUK KETERANGAN PILIHAN
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
                        } while (!("1".equals(sm) || "2".equals(sm) || "3".equals(sm) || "4".equals(sm) || "5".equals(sm)));
                        sosmed[ed - 1] = sm;
                        break;
                    }
                    case "11": {        //EDIT NOMOR TELEPON
                        do {
                            try {
                                hp = JOptionPane.showInputDialog("NO TELPON / HP");
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "MOHON INPUT ANGKA");
                                salah = true;
                            }
                        } while (salah);
                        nomor[ed - 1] = hp;
                        break;
                    }
                    case "12": {        //EDIT STATUS
                        do {
                            st = JOptionPane.showInputDialog("STATUS PEMILIK(NIKAH/BELUM) \n"
                                    + "[N/B]");
                        } while (!("N".equals(st) || "B".equals(st) || "n".equals(st) || "b".equals(st)));
                        status[ed - 1] = st;

                        if ("N".equals(st) || "n".equals(st)) {    //IF UNTUK KETERANGAN PILIHAN
                            ket6 = "NIKAH";
                        } else {
                            ket6 = "BELUM";
                        }
                        break;
                    }
                    case "13": {        //EDIT KERJASAMA
                        do {
                            ks = JOptionPane.showInputDialog("KERJASAMA DENGAN PERUSAHAAN/ORANGLAIN \n"
                                    + "[Y/T]");
                        } while (!("Y".equals(ks) || "T".equals(ks) || "y".equals(ks) || "t".equals(ks)));
                        kerjasama[ed - 1] = ks;
                        
                        if ("Y".equals(ks) || "y".equals(ks)) {    //IF UNTUK KETERANGAN PILIHAN
                            ket7 = "ADA KERJASAMA";
                        } else {
                            ket7 = "TIDAK ADA KERJASAMA";
                        }
                        break;
                    }
                    case "14": {            //EDIT KESELURUHAN
                        na = JOptionPane.showInputDialog("NAMA TOKO");
                        nama[ed - 1] = na;
                        al = JOptionPane.showInputDialog("ALAMAT");
                        alamat[ed - 1] = al;
                        np = JOptionPane.showInputDialog("NAMA PEMILIK");
                        pemilik[ed - 1] = np;
                        do {
                            jenis = JOptionPane.showInputDialog("JENIS USAHA \n"
                                    + "1. PAKAIAN \n"
                                    + "2. SARUNG \n"
                                    + "3. MAKANAN \n"
                                    + "4. SEPATU/TAS \n"
                                    + "5. ELEKTRONIK \n"
                                    + "6. BARANG BEKAS \n"
                                    + "7. BAHAN POKOK \n"
                                    + "8. LAIN-LAIN \n");
                            switch (jenis) {
                                case "1": {
                                    ket = "PAKAIAN";
                                    break;
                                }
                                case "2": {
                                    ket = "SARUNG";
                                    break;
                                }
                                case "3": {
                                    ket = "MAKANAN";
                                    break;
                                }
                                case "4": {
                                    ket = "SEPATU/TAS";
                                    break;
                                }
                                case "5": {
                                    ket = "ELEKTRONIK";
                                    break;
                                }
                                case "6": {
                                    ket = "BARANG BEKAS";
                                    break;
                                }
                                case "7": {
                                    ket = "BAHAN POKOK";
                                    break;
                                }
                                case "8": {
                                    ket = "LAIN-LAIN";
                                    break;
                                }
                            }
                        } while (!("1".equals(jenis) || "2".equals(jenis) || "3".equals(jenis) || "4".equals(jenis) || "5".equals(jenis) || "6".equals(jenis) || "7".equals(jenis) || "8".equals(jenis)));
                        jenus[ed - 1] = jenis;
                        do {
                            try {
                                mod = JOptionPane.showInputDialog("MODAL");
                                nmo = Integer.parseInt(mod);
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                                salah = true;
                            }
                        } while (salah);
                        modal[ed - 1] = nmo;
                        do {
                            pj = JOptionPane.showInputDialog("PENJUALAN \n"
                                    + "D. DALAM NEGERI \n"
                                    + "L. LUAR NEGERI \n"
                                    + "S. DALAM DAN LUAR NEGERI \n");
                        } while (!("D".equals(pj) || "L".equals(pj) || "S".equals(pj) || "d".equals(pj) || "l".equals(pj) || "s".equals(pj)));
                        penjualan[ed - 1] = pj;

                        if ("D".equals(pj) || "d".equals(pj)) {
                            ket2 = "DALAM NEGERI";
                        } else if ("L".equals(pj) || "l".equals(pj)) {
                            ket2 = "LUAR NEGERI";
                        } else {
                            ket2 = "DALAM DAN LUAR NEGERI";
                        }

                        do {
                            pb = JOptionPane.showInputDialog("PEMBELI \n"
                                    + "D. DOMESTIK \n"
                                    + "L. LUAR \n"
                                    + "C. CAMPURAN \n");
                        } while (!("D".equals(pb) || "L".equals(pb) || "C".equals(pb) || "d".equals(pb) || "l".equals(pb) || "c".equals(pb)));
                        pembelian[ed - 1] = pb;

                        if ("D".equals(pb) || "d".equals(pb)) {
                            ket3 = "DOMESTIK";
                        } else if ("L".equals(pb) || "l".equals(pb)) {
                            ket3 = "LUAR";
                        } else {
                            ket3 = "CAMPURAN";
                        }

                        do {
                            cb = JOptionPane.showInputDialog("CABANG \n"
                                    + "T. TIDAK ADA  A. ADA\n");
                        } while (!("T".equals(cb) || "A".equals(cb) || "t".equals(cb) || "a".equals(cb)));
                        cabang[ed - 1] = cb;

                        if ("T".equals(cb) || "t".equals(cb)) {
                            ket4 = "TIDAK ADA";
                        } else {
                            ket4 = "ADA";
                        }

                        ale = JOptionPane.showInputDialog("ALAMAT EMAIL");
                        email[ed - 1] = ale;
                        do {
                            sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"
                                    + "1. FACEBOOK  \n2. WHATSAPP  \n3. INSTAGRAM  \n4. TELEGRAM  \n5. DLL");
                            switch (sm) {
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
                        } while (!("1".equals(sm) || "2".equals(sm) || "3".equals(sm) || "4".equals(sm) || "5".equals(sm)));
                        sosmed[ed - 1] = sm;
                        do {
                            try {
                                hp = JOptionPane.showInputDialog("NO TELPON / HP");
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "MOHON INPUT ANGKA");
                                salah = true;
                            }
                        } while (salah);
                        nomor[ed - 1] = hp;
                        do {
                            st = JOptionPane.showInputDialog("STATUS PEMILIK(NIKAH/BELUM) \n"
                                    + "[N/B]");
                        } while (!("N".equals(st) || "B".equals(st) || "n".equals(st) || "b".equals(st)));
                        status[ed - 1] = st;

                        if ("N".equals(st) || "n".equals(st)) {
                            ket6 = "NIKAH";
                        } else {
                            ket6 = "BELUM";
                        }

                        do {
                            ks = JOptionPane.showInputDialog("KERJASAMA DENGAN PERUSAHAAN/ORANGLAIN \n"
                                    + "[Y/T]");
                        } while (!("Y".equals(ks) || "T".equals(ks) || "y".equals(ks) || "t".equals(ks)));
                        kerjasama[ed - 1] = ks;
                        if ("Y".equals(ks) || "y".equals(ks)) {
                            ket7 = "ADA KERJASAMA";
                        } else {
                            ket7 = "TIDAK ADA KERJASAMA";
                        }
                        break;
                    }
                }
                hasil += "NAMA TOKO = " + nama[ed - 1] + "\n";        //REKAP HASIL EDIT
                hasil += "ALAMAT = " + alamat[ed - 1] + "\n";
                hasil += "NAMA PEMILIK = " + pemilik[ed - 1] + "\n";
                hasil += "JENIS USAHA = " + ket + "\n";
                hasil += "MODAL = " + modal[ed - 1] + "\n";
                hasil += "PENJUALAN = " + ket2 + "\n";
                hasil += "PEMBELI = " + ket3 + "\n";
                hasil += "CABANG = " + ket4 + "\n";
                hasil += "ALAMAT EMAIL = " + email[ed - 1] + "\n";
                hasil += "SOSIAL MEDIA = " + ket5 + "\n";
                hasil += "NO TELPON / HP = " + nomor[ed - 1] + "\n";
                hasil += "STATUS PEMILIK [NIKAH(N)/BELUM(B)] = " + ket6 + "\n";
                hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN = " + ket7 + "\n";

                JOptionPane.showMessageDialog(null, hasil, "LAPORAN DATA PEDAGANG NO " + ed, JOptionPane.INFORMATION_MESSAGE);
                hasil = "";

                do {
                    ulang = JOptionPane.showInputDialog("EDIT DATA LAGI [Y/T]");
                } while (!("Y".equals(ulang) | "y".equals(ulang) | "t".equals(ulang) | "T".equals(ulang)));
            }
        } while ("Y".equals(ulang) || "y".equals(ulang));
    }
}
