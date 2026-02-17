import java.util.*;

public class ImsakiyahRamadhan1447H {
    static void imsSumbar() {
    String[] hijri = {"1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
      "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
      "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"};
    String[] greg = {"19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
      "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
      "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"};

    String[] imsak = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] subuh = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] terbit = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dhuha = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dzuhur = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] ashar = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] magrib = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] isya = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    System.out.println();
    System.out.println("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA BARAT (PADANG) DAN SEKITARNYA");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.println("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    
    for (int i=0; i<9; i++) {
        System.out.println("| " + (i+1) + "  | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
    for (int i=9; i<30; i++) {
        System.out.println("| " + (i+1) + " | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}

static void imsSumsel() {
    String[] hijri = {"1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
      "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
      "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"};
    String[] greg = {"19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
      "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
      "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"};

    String[] imsak = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] subuh = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] terbit = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dhuha = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dzuhur = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] ashar = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] magrib = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] isya = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    System.out.println();
    System.out.println("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA SELATAN (PALEMBANG) DAN SEKITARNYA");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.println("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    System.out.println("-----------------------------------------------------------------------------------------------------------");

    for (int i=0; i<9; i++) {
        System.out.println("| " + (i+1) + "  | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
    for (int i=9; i<30; i++) {
        System.out.println("| " + (i+1) + " | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}

static void imsBanten() {
    String[] hijri = {"1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
      "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
      "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"};
    String[] greg = {"19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
      "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
      "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"};

    String[] imsak = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] subuh = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] terbit = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dhuha = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dzuhur = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] ashar = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] magrib = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] isya = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    System.out.println();
    System.out.println("JADWAL IMSAKIYAH UNTUK WILAYAH BANTEN (SERANG) DAN SEKITARNYA");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.println("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    System.out.println("-----------------------------------------------------------------------------------------------------------");

    for (int i=0; i<9; i++) {
        System.out.println("| " + (i+1) + "  | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
    for (int i=9; i<30; i++) {
        System.out.println("| " + (i+1) + " | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}

static void imsJakarta() {
    String[] hijri = {"1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
      "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
      "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"};
    String[] greg = {"19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
      "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
      "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"};

    String[] imsak = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] subuh = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] terbit = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dhuha = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dzuhur = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] ashar = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] magrib = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] isya = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    System.out.println();
    System.out.println("JADWAL IMSAKIYAH UNTUK WILAYAH DKI JAKARTA DAN SEKITARNYA");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.println("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    System.out.println("-----------------------------------------------------------------------------------------------------------");

    for (int i=0; i<9; i++) {
        System.out.println("| " + (i+1) + "  | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
    for (int i=9; i<30; i++) {
        System.out.println("| " + (i+1) + " | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}

static void imsJabar() {
    String[] hijri = {"1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
      "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
      "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"};
    String[] greg = {"19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
      "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
      "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"};

    String[] imsak = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] subuh = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] terbit = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dhuha = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] dzuhur = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] ashar = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] magrib = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] isya = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    
    System.out.println();
    System.out.println("JADWAL IMSAKIYAH UNTUK WILAYAH JAWA BARAT (BANDUNG) DAN SEKITARNYA");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.println("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    System.out.println("-----------------------------------------------------------------------------------------------------------");
    
    for (int i=0; i<9; i++) {
        System.out.println("| " + (i+1) + "  | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
    for (int i=9; i<30; i++) {
        System.out.println("| " + (i+1) + " | " + hijri[i] + " / " + greg[i] + " | " + imsak[i] + " | " + subuh[i] + " | " + terbit[i] + " | " + dhuha[i] + " | " + dzuhur[i] + " | " + ashar[i] + " | " + magrib[i] + " | " + isya[i] + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prov;
    
        System.out.println("========================================");
        System.out.println("PROGRAM JADWAL IMSAKIYAH RAMADHAN 1447 H");
        System.out.println("========================================");
        System.out.println("1. Sumatra Barat (Kota Padang)");
        System.out.println("2. Sumatra Selatan (Kota Palembang)");
        System.out.println("3. Banten (Kabupaten Serang)");
        System.out.println("4. DKI Jakarta (Kota Jakarta)");
        System.out.println("5. Jawa Barat (Kota Bandung)");
        System.out.println("========================================");
        System.out.println();
    
        System.out.print("Masukan Nomor Provinsi : ");
        prov = sc.nextInt();
        System.out.println();
    
        if (prov == 1) {
            imsSumbar();
        } else if (prov == 2) {
            imsSumsel();
        } else if (prov == 3) {
            imsBanten();
        } else if (prov == 4) {
            imsJakarta();
        } else if (prov == 5) {
            imsJabar();
        } else {
            System.out.println("Invalid");
        }
    
        sc.close();
    }
}