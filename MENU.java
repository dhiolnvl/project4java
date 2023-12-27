package projectk4;
import javax.swing.*;
public class MENU {
    //VARIABEL DAN ARRAY GLOBAL
    static String ts, mn, na, al, np, jenis, mod, pj, pb, cb, ale, sm, hp, st, ks, ket, ket2, ket3, ket4, ket5, ket6, ket7, nr, ulang = "y", hasil = "", rekap="", edit, dh, tg;
    static int nohp, x = -1, no = 0, h, nh, x1, x2, hal, jd, sisa, g, z, p=0, s=0, m=0, bb=0, spt=0, bp=0, e=0, ll=0;
    static double nmo = 0f;
    static boolean salah = true, keluar = true, ruang = true, putar = true;
    static String nama[] = new String[20];
    static String alamat[] = new String[20];
    static String pemilik[] = new String[20];
    static String jenus[] = new String[20];
    static Double modal[] = new Double[20];
    static String penjualan[] = new String[20];
    static String pembelian[] = new String[20];
    static String cabang[] = new String[20];
    static String email[] = new String[20];
    static String sosmed[] = new String[20];
    static String nomor[] = new String[20];
    static String status[] = new String[20];
    static String kerjasama[] = new String[20];

     //===================================================================================================================================================================
    static void info() //INFORMASI
    {
        ts = JOptionPane.showInputDialog("TEMPAT SURVEI");
        tg = JOptionPane.showInputDialog("TANGGAL SURVEI");
    }
    //===================================================================================================================================================================
    static void input() //INPUT DATA
    {
        do {
            if (x == 20) {
                JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
            } else {
                do {
                    x = x + 1;
                    no = no + 1;
                    na = JOptionPane.showInputDialog("NAMA TOKO");
                    nama[x] = na;
                    al = JOptionPane.showInputDialog("ALAMAT");
                    alamat[x] = al;
                    np = JOptionPane.showInputDialog("NAMA PEMILIK");
                    pemilik[x] = np;
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
                    } while (!("1".equals(jenis) || "2".equals(jenis) || "3".equals(jenis) || "4".equals(jenis) || "5".equals(jenis) || "6".equals(jenis) || "7".equals(jenis) || "8".equals(jenis)));
                    jenus[x] = jenis;
                    do {
                        try {
                            mod = JOptionPane.showInputDialog("MODAL");
                            nmo = Double.parseDouble(mod);
                            salah = false;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                            salah = true;
                        }
                    } while (salah);
                    modal[x] = nmo;
                    do {
                        pj = JOptionPane.showInputDialog("PENJUALAN \n"
                                + "D. DALAM NEGERI \n"
                                + "L. LUAR NEGERI \n"
                                + "S. DALAM DAN LUAR NEGERI \n");
                    } while (!("D".equals(pj) || "L".equals(pj) || "S".equals(pj) || "d".equals(pj) || "l".equals(pj) || "s".equals(pj)));
                    penjualan[x] = pj;

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
                    pembelian[x] = pb;

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
                    cabang[x] = cb;

                    if ("T".equals(cb) || "t".equals(cb)) {
                        ket4 = "TIDAK ADA";
                    } else {
                        ket4 = "ADA";
                    }

                    ale = JOptionPane.showInputDialog("ALAMAT EMAIL");
                    email[x] = ale;
                    do {
                        sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"
                                + "1. FB  \n2. WA  \n3. IG  \n4. TELEGRAM  \n5. DLL");
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
                    sosmed[x] = sm;
                    do {
                        try {
                            hp = JOptionPane.showInputDialog("NO TELPON / HP");
                            salah = false;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "MOHON INPUT ANGKA");
                            salah = true;
                        }
                    } while (salah);
                    nomor[x] = hp;
                    do {
                        st = JOptionPane.showInputDialog("STATUS PEMILIK(NIKAH/BELUM) \n"
                                + "[N/B]");
                    } while (!("N".equals(st) || "B".equals(st) || "n".equals(st) || "b".equals(st)));
                    status[x] = st;

                    if ("N".equals(st) || "n".equals(st)) {
                        ket6 = "NIKAH";
                    } else {
                        ket6 = "BELUM";
                    }

                    do {
                        ks = JOptionPane.showInputDialog("KERJASAMA DENGAN PERUSAHAAN/ORANGLAIN \n"
                                + "[Y/T]");
                    } while (!("Y".equals(ks) || "T".equals(ks) || "y".equals(ks) || "t".equals(ks)));
                    kerjasama[x] = ks;
                    if ("Y".equals(ks) || "y".equals(ks)) {
                        ket7 = "ADA KERJASAMA";
                    } else {
                        ket7 = "TIDAK ADA KERJASAMA";
                    }
                    hasil += "                                              DATA PEDAGANG           \n";
                    hasil += "==========================================================\n";
                    hasil += "NAMA TOKO = " + nama[x] + "\n";
                    hasil += "ALAMAT    = " + alamat[x] + "\n";
                    hasil += "NAMA PEMILIK  = " + pemilik[x] + "\n";
                    hasil += "JENIS USAHA   = " + ket + "\n";
                    hasil += "MODAL = " + modal[x] + "\n";
                    hasil += "PENJUALAN = " + ket2 + "\n";
                    hasil += "PEMBELI   = " + ket3 + "\n";
                    hasil += "CABANG    = " + ket4 + "\n";
                    hasil += "ALAMAT EMAIL  = " + email[x] + "\n";
                    hasil += "SOSIAL MEDIA  = " + ket5 + "\n";
                    hasil += "NO TELPON / HP    = " + nomor[x] + "\n";
                    hasil += "STATUS PEMILIK [NIKAH(N)/BELUM(B)]    = " + ket6 + "\n";
                    hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN   = " + ket7 + "\n";

                    JOptionPane.showMessageDialog(null, hasil, "LAPORAN DATA PEDAGANG NO " + no, JOptionPane.INFORMATION_MESSAGE);
                    hasil = "";
                    do {
                        ulang = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");

                        if (x == 19) {
                            JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
                            ulang = "T";
                        }
                    } while (!("Y".equals(ulang) | "y".equals(ulang) | "t".equals(ulang) | "T".equals(ulang)));
                } while ("Y".equals(ulang) || "y".equals(ulang));
            }
            keluar = false;
        } while (keluar);
    }

    //===================================================================================================================================================================
    static void edit() //2. EDIT DATA
    {
        do {
            if (x == -1) {
                JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
                ulang = "t";
            } else {
                do {
                    try {
                        do {
                            ruang = true;
                            nr = JOptionPane.showInputDialog("NOMOR RUANG [1 - " + (x + 1) + "]");
                            h = Integer.parseInt(nr);
                            if (h >= 1 & (h <= x + 1)) {
                                ruang = false;
                            }
                        } while (ruang);
                        salah = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                        salah = true;
                    }
                } while (salah);
                hasil += "NAMA TOKO = " + nama[h - 1] + "\n";
                hasil += "ALAMAT = " + alamat[h - 1] + "\n";
                hasil += "NAMA PEMILIK = " + pemilik[h - 1] + "\n";
                hasil += "JENIS USAHA = " + ket + "\n";
                hasil += "MODAL = " + modal[h - 1] + "\n";
                hasil += "PENJUALAN = " + ket2 + "\n";
                hasil += "PEMBELI = " + ket3 + "\n";
                hasil += "CABANG = " + ket4 + "\n";
                hasil += "ALAMAT EMAIL = " + email[h - 1] + "\n";
                hasil += "SOSIAL MEDIA = " + ket5 + "\n";
                hasil += "NO TELPON / HP = " + nomor[h - 1] + "\n";
                hasil += "STATUS PEMILIK [NIKAH(N)/BELUM(B)] = " + ket6 + "\n";
                hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN = " + ket7 + "\n";

                JOptionPane.showMessageDialog(null, hasil, "LAPORAN DATA PEDAGANG NO " +h+ " YANG AKAN DIEDIT", JOptionPane.INFORMATION_MESSAGE);
                hasil = "";

                edit = JOptionPane.showInputDialog("DATA YANG AKAN DIEDIT \n"
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
                    case "1": {
                        na = JOptionPane.showInputDialog("NAMA TOKO");
                        nama[h - 1] = na;
                        break;
                    }
                    case "2": {
                        al = JOptionPane.showInputDialog("ALAMAT");
                        alamat[h - 1] = al;
                        break;
                    }
                    case "3": {
                        np = JOptionPane.showInputDialog("NAMA PEMILIK");
                        pemilik[h - 1] = np;
                        break;
                    }
                    case "4": {
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
                        jenus[h - 1] = jenis;
                        break;
                    }
                    case "5": {
                        do {
                            try {
                                mod = JOptionPane.showInputDialog("MODAL");
                                nmo = Double.parseDouble(mod);
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                                salah = true;
                            }
                        } while (salah);
                        modal[h - 1] = nmo;
                        break;
                    }
                    case "6": {
                        do {
                            pj = JOptionPane.showInputDialog("PENJUALAN \n"
                                    + "D. DALAM NEGERI \n"
                                    + "L. LUAR NEGERI \n"
                                    + "S. DALAM DAN LUAR NEGERI \n");
                        } while (!("D".equals(pj) || "L".equals(pj) || "S".equals(pj) || "d".equals(pj) || "l".equals(pj) || "s".equals(pj)));
                        penjualan[h - 1] = pj;

                        if ("D".equals(pj) || "d".equals(pj)) {
                            ket2 = "DALAM NEGERI";
                        } else if ("L".equals(pj) || "l".equals(pj)) {
                            ket2 = "LUAR NEGERI";
                        } else {
                            ket2 = "DALAM DAN LUAR NEGERI";
                        }

                        break;
                    }
                    case "7": {
                        do {
                            pb = JOptionPane.showInputDialog("PEMBELI \n"
                                    + "D. DOMESTIK \n"
                                    + "L. LUAR \n"
                                    + "C. CAMPURAN \n");
                        } while (!("D".equals(pb) || "L".equals(pb) || "C".equals(pb) || "d".equals(pb) || "l".equals(pb) || "c".equals(pb)));
                        pembelian[h - 1] = pb;

                        if ("D".equals(pb) || "d".equals(pb)) {
                            ket3 = "DOMESTIK";
                        } else if ("L".equals(pb) || "l".equals(pb)) {
                            ket3 = "LUAR";
                        } else {
                            ket3 = "CAMPURAN";
                        }
                        break;
                    }
                    case "8": {
                        do {
                            cb = JOptionPane.showInputDialog("CABANG \n"
                                    + "T. TIDAK ADA  A. ADA\n");
                        } while (!("T".equals(cb) || "A".equals(cb) || "t".equals(cb) || "a".equals(cb)));
                        cabang[h - 1] = cb;

                        if ("T".equals(cb) || "t".equals(cb)) {
                            ket4 = "TIDAK ADA";
                        } else {
                            ket4 = "ADA";
                        }
                        break;
                    }
                    case "9": {
                        ale = JOptionPane.showInputDialog("ALAMAT EMAIL");
                        email[h - 1] = ale;
                        break;
                    }
                    case "10": {
                        do {
                            sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"
                                    + "1. FB  2. WA  3. IG  4. TELEGRAM  5. DLL");
                            switch (sm) {
                                case "1": {
                                    ket5 = "FB";
                                    break;
                                }
                                case "2": {
                                    ket5 = "WA";
                                    break;
                                }
                                case "3": {
                                    ket5 = "IG";
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
                        sosmed[h - 1] = sm;
                        break;
                    }
                    case "11": {
                        do {
                            try {
                                hp = JOptionPane.showInputDialog("NO TELPON / HP");
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "MOHON INPUT ANGKA");
                                salah = true;
                            }
                        } while (salah);
                        nomor[h - 1] = hp;
                        break;
                    }
                    case "12": {
                        do {
                            st = JOptionPane.showInputDialog("STATUS PEMILIK(NIKAH/BELUM) \n"
                                    + "[N/B]");
                        } while (!("N".equals(st) || "B".equals(st) || "n".equals(st) || "b".equals(st)));
                        status[h - 1] = st;

                        if ("N".equals(st) || "n".equals(st)) {
                            ket6 = "NIKAH";
                        } else {
                            ket6 = "BELUM";
                        }
                        break;
                    }
                    case "13": {
                        do {
                            ks = JOptionPane.showInputDialog("KERJASAMA DENGAN PERUSAHAAN/ORANGLAIN \n"
                                    + "[Y/T]");
                        } while (!("Y".equals(ks) || "T".equals(ks) || "y".equals(ks) || "t".equals(ks)));
                        kerjasama[h - 1] = ks;
                        if ("Y".equals(ks) || "y".equals(ks)) {
                            ket7 = "ADA KERJASAMA";
                        } else {
                            ket7 = "TIDAK ADA KERJASAMA";
                        }
                        break;
                    }
                    case "14": {
                        na = JOptionPane.showInputDialog("NAMA TOKO");
                        nama[h - 1] = na;
                        al = JOptionPane.showInputDialog("ALAMAT");
                        alamat[h - 1] = al;
                        np = JOptionPane.showInputDialog("NAMA PEMILIK");
                        pemilik[h - 1] = np;
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
                        jenus[h - 1] = jenis;
                        do {
                            try {
                                mod = JOptionPane.showInputDialog("MODAL");
                                nmo = Double.parseDouble(mod);
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                                salah = true;
                            }
                        } while (salah);
                        modal[h - 1] = nmo;
                        do {
                            pj = JOptionPane.showInputDialog("PENJUALAN \n"
                                    + "D. DALAM NEGERI \n"
                                    + "L. LUAR NEGERI \n"
                                    + "S. DALAM DAN LUAR NEGERI \n");
                        } while (!("D".equals(pj) || "L".equals(pj) || "S".equals(pj) || "d".equals(pj) || "l".equals(pj) || "s".equals(pj)));
                        penjualan[h - 1] = pj;

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
                        pembelian[h - 1] = pb;

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
                        cabang[h - 1] = cb;

                        if ("T".equals(cb) || "t".equals(cb)) {
                            ket4 = "TIDAK ADA";
                        } else {
                            ket4 = "ADA";
                        }

                        ale = JOptionPane.showInputDialog("ALAMAT EMAIL");
                        email[h - 1] = ale;
                        do {
                            sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"
                                    + "1. FB  2. WA  3. IG  4. TELEGRAM  5. DLL");
                            switch (sm) {
                                case "1": {
                                    ket5 = "FB";
                                    break;
                                }
                                case "2": {
                                    ket5 = "WA";
                                    break;
                                }
                                case "3": {
                                    ket5 = "IG";
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
                        sosmed[h - 1] = sm;
                        do {
                            try {
                                hp = JOptionPane.showInputDialog("NO TELPON / HP");
                                salah = false;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "MOHON INPUT ANGKA");
                                salah = true;
                            }
                        } while (salah);
                        nomor[h - 1] = hp;
                        do {
                            st = JOptionPane.showInputDialog("STATUS PEMILIK(NIKAH/BELUM) \n"
                                    + "[N/B]");
                        } while (!("N".equals(st) || "B".equals(st) || "n".equals(st) || "b".equals(st)));
                        status[h - 1] = st;

                        if ("N".equals(st) || "n".equals(st)) {
                            ket6 = "NIKAH";
                        } else {
                            ket6 = "BELUM";
                        }

                        do {
                            ks = JOptionPane.showInputDialog("KERJASAMA DENGAN PERUSAHAAN/ORANGLAIN \n"
                                    + "[Y/T]");
                        } while (!("Y".equals(ks) || "T".equals(ks) || "y".equals(ks) || "t".equals(ks)));
                        kerjasama[h - 1] = ks;
                        if ("Y".equals(ks) || "y".equals(ks)) {
                            ket7 = "ADA KERJASAMA";
                        } else {
                            ket7 = "TIDAK ADA KERJASAMA";
                        }
                        break;
                    }
                }
                hasil += "NAMA TOKO = " + nama[h - 1] + "\n";
                hasil += "ALAMAT = " + alamat[h - 1] + "\n";
                hasil += "NAMA PEMILIK = " + pemilik[h - 1] + "\n";
                hasil += "JENIS USAHA = " + ket + "\n";
                hasil += "MODAL = " + modal[h - 1] + "\n";
                hasil += "PENJUALAN = " + ket2 + "\n";
                hasil += "PEMBELI = " + ket3 + "\n";
                hasil += "CABANG = " + ket4 + "\n";
                hasil += "ALAMAT EMAIL = " + email[h - 1] + "\n";
                hasil += "SOSIAL MEDIA = " + ket5 + "\n";
                hasil += "NO TELPON / HP = " + nomor[h - 1] + "\n";
                hasil += "STATUS PEMILIK [NIKAH(N)/BELUM(B)] = " + ket6 + "\n";
                hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN = " + ket7 + "\n";

                JOptionPane.showMessageDialog(null, hasil, "LAPORAN DATA PEDAGANG NO " + h, JOptionPane.INFORMATION_MESSAGE);
                hasil = "";

                do {
                    ulang = JOptionPane.showInputDialog("EDIT DATA LAGI [Y/T]");
                } while (!("Y".equals(ulang) | "y".equals(ulang) | "t".equals(ulang) | "T".equals(ulang)));
            }
        } while ("Y".equals(ulang) || "y".equals(ulang));
    }
    
    //===================================================================================================================================================================
    static void hapus() //3. HAPUS DATA
    {
         do {
            if (x == -1) {
                JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
                ulang = "t";
            } else {
         do {
                    try {
                        dh = JOptionPane.showInputDialog(" DATA YANG AKAN DIHAPUS [1 - " +(x + 1) + "]");
                        nh = Integer.parseInt(dh);
                        putar = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, " DATA SALAH, ULANGI");
                        putar = true;
                    }
                } while (putar || (!(nh >= 1 && nh <= (x + 1))));
         
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
                hasil += "STATUS PEMILIK [NIKAH(N)/BELUM(B)] = " + ket6 + "\n";
                hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN = " + ket7 + "\n";

                JOptionPane.showMessageDialog(null, hasil, "LAPORAN DATA PEDAGANG NO " +nh+" YANG AKAN DIHAPUS", JOptionPane.INFORMATION_MESSAGE);
                hasil ="";
                if (nh >= 1 && nh < x + 1) {
                    for (int n = nh; n <= x; n = n + 1) {
                        nama[n-1] = nama[n];
                        alamat[n-1] = alamat[n];
                        pemilik[n-1] = pemilik[n];
                        modal[n-1] = modal[n];
                        email[n-1] = email[n];
                        nomor[n-1] = nomor[n];
                    }
                }            
                do {
                    
                    ulang = JOptionPane.showInputDialog("HAPUS DATA LAGI [Y/T]");
                    x = x - 1;
                    if (x < 0) {
                    JOptionPane.showMessageDialog(null, "DATA HABIS");
                }
                } while (!("Y".equals(ulang) | "y".equals(ulang) | "t".equals(ulang) | "T".equals(ulang)));
            }
        } while ("Y".equals(ulang) || "y".equals(ulang));     
    }
    
    //===================================================================================================================================================================
    static void rekapdata() //4. LAPORAN DATA PEDAGANG
    {
         if (x == -1) {
                JOptionPane.showMessageDialog(null, "TIDAK ADA DATA");
                ulang = "t";
            } else {
        sisa = (x+1) % 4;
        if(sisa == 0)
        {
            hal = (x+1)/4;
        }
        else
        {
            hal = ((x+1)/4)+1;
        }  
        if(hal==1)
        {
        x1 = 1;
        x2 = (x+1);
        }
        else
        {
            x1=1;
            x2=4;
        }       
        z = 0; 
        for (int h=1; h <= hal; h = h +1)
        {
            
            g = 0;
            p=0; s=0; m=0; bb=0; spt=0;bp=0; e=0; ll=0;
            rekap += "TANGGAL : "+tg+"                                        HAL : "+h+"\n";
            rekap += "========================================================== \n";
            rekap += " NO   NAMA TOKO       ALAMAT       NAMA PEMILIK      JENIS USAHA \n";
            rekap += "========================================================== \n";
            if (h == hal)
                    {
                        x2 = (x+1);
                    }
                    for (int d=x1; d <= x2; d=d+1)
                    {
                        g = g + 1;
                        z = z + 1;
                        switch (jenus[d-1]) {
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
            rekap +=" "+z+"   "+nama[d-1]+"       "+alamat[d-1]+"       "+pemilik[d-1]+"       "+ket+"\n"; 
        }
            rekap += "========================================================== \n";
            rekap += " PAKAIAN : "+p+"          SEPATU/TAS : "+spt+"\n";
            rekap += " SARUNG : "+s+"           BAHAN POKOK : "+bp+"\n";
            rekap += " MAKANAN : "+m+"          ELEKTRONIK : "+e+"\n";
            rekap += " BARANG BEKAS : "+bb+"    LAIN - LAIN : "+ll+"\n";
            
            JOptionPane.showMessageDialog(null, rekap, "REKAP LAPORAN DATA PEDAGANG PERHALAMAN",JOptionPane.INFORMATION_MESSAGE);
            rekap ="";
            x1 = x1 +4;
            x2 = x2 +4;
       }
    }
}
}
