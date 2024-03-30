#include <stdio.h>
#include <conio.h>
#include <string.h>

void imsSumbar(){
    char* hijri[30] = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    char* greg[30] = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

  char* imsak[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* subuh[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* terbit[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dhuha[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dzuhur[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* ashar[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* magrib[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* isya[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

  printf("\n");
  printf("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA BARAT (PADANG) DAN SEKITARNYA\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");
  printf("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");

  for (int i=0; i<9;i++) {
    printf("| %d  | %s / %s | %s | %s | %s  | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
  for (int i=9; i<30;i++) {
    printf("| %d | %s / %s | %s | %s | %s | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
}

void imsSumsel(){
    char* hijri[30] = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    char* greg[30] = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

  char* imsak[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* subuh[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* terbit[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dhuha[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dzuhur[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* ashar[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* magrib[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* isya[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

  printf("\n");
  printf("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA SELATAN (PALEMBANG) DAN SEKITARNYA\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");
  printf("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");

  for (int i=0; i<9;i++) {
    printf("| %d  | %s / %s | %s | %s | %s  | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
  for (int i=9; i<30;i++) {
    printf("| %d | %s / %s | %s | %s | %s | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
}

void imsBanten(){
    char* hijri[30] = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    char* greg[30] = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

  char* imsak[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* subuh[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* terbit[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dhuha[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dzuhur[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* ashar[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* magrib[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* isya[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

  printf("\n");
  printf("JADWAL IMSAKIYAH UNTUK WILAYAH BANTEN (SERANG) DAN SEKITARNYA\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");
  printf("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");

  for (int i=0; i<9;i++) {
    printf("| %d  | %s / %s | %s | %s | %s  | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
  for (int i=9; i<30;i++) {
    printf("| %d | %s / %s | %s | %s | %s | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
}

void imsJakarta(){
    char* hijri[30] = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    char* greg[30] = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

  char* imsak[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* subuh[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* terbit[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dhuha[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dzuhur[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* ashar[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* magrib[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* isya[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

  printf("\n");
  printf("JADWAL IMSAKIYAH UNTUK WILAYAH DKI JAKARTA DAN SEKITARNYA\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");
  printf("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");

  for (int i=0; i<9;i++) {
    printf("| %d  | %s / %s | %s | %s | %s  | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
  for (int i=9; i<30;i++) {
    printf("| %d | %s / %s | %s | %s | %s | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
}

void imsJabar(){
    char* hijri[30] = {"1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"};
    char* greg[30] = {"12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""};

  char* imsak[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* subuh[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* terbit[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dhuha[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* dzuhur[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* ashar[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* magrib[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
  char* isya[30] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

  printf("\n");
  printf("JADWAL IMSAKIYAH UNTUK WILAYAH JAWA BARAT (BANDUNG) DAN SEKITARNYA\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");
  printf("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |\n");
  printf("-----------------------------------------------------------------------------------------------------------\n");

  for (int i=0; i<9;i++) {
    printf("| %d  | %s / %s | %s | %s | %s  | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
  for (int i=9; i<30;i++) {
    printf("| %d | %s / %s | %s | %s | %s | %s | %s | %s | %s | %s |\n", i+1, hijri[i], greg[i], imsak[i], subuh[i], terbit[i], dhuha[i], dzuhur[i], ashar[i], magrib[i], isya[i]);
    printf("-----------------------------------------------------------------------------------------------------------\n");
  }
}

int main(){
  int prov;

  printf("========================================\n");
  printf("PROGRAM JADWAL IMSAKIYAH RAMADHAN 1444 H\n");
  printf("========================================\n");
  printf("1. Sumatra Barat (Kota Padang)\n");
  printf("2. Sumatra Selatan (Kota Palembang)\n");
  printf("3. Banten (Kabupaten Serang)\n");
  printf("4. DKI Jakarta (Kota Jakarta)\n");
  printf("5. Jawa Barat (Kota Bandung)\n");
  printf("\n");

  printf("Masukan Nomor Provinsi : ");
  scanf("%d", &prov);
  printf("\n");

  if (prov == 1){
    imsSumbar();
  }
  else if (prov == 2){
    imsSumsel();
  }
  else if (prov == 3){
    imsBanten();
  }
  else if (prov == 4){
    imsJakarta();
  }
  else if (prov == 5){
    imsJabar();
  }
  else {
    printf("Invalid\n");
  }

  getch();
}