import java.util.*;

public class ImsakiyahRamadhan1445H {
    static void imsSumbar() {
    String[] hijri = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    String[] greg = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

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
    String[] hijri = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    String[] greg = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

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
    String[] hijri = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    String[] greg = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

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
    String[] hijri = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    String[] greg = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

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
    String[] hijri = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    String[] greg = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

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
        System.out.println("PROGRAM JADWAL IMSAKIYAH RAMADHAN 1444 H");
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