import 'dart:io';

void imsSumbar() {
  List<String> hijri = [
    "1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H",
    "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H",
    "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H",
    "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H"];

  List<String> greg = [
    "12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024",
    "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024",
    "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024",
    "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024"];

  List<String> imsak = ["05:00", "05:00", "05:00", "05:00", "05:00", "04:59", "04:59", "04:59", "04:59", "04:59", "04:58", "04:58", "04:57", "04:57", "04:57", "04:57", "04:56", "04:56", "04:56", "04:55", "04:55", "04:55", "04:54", "04:54", "04:54", "04:53", "04:53", "04:53", "04:52"];
  List<String> subuh = ["05:10", "05:10", "05:10", "05:10", "05:10", "05:09", "05:09", "05:09", "05:09", "05:09", "05:08", "05:08", "05:07", "05:07", "05:07", "05:07", "05:06", "05:06", "05:06", "05:05", "05:05", "05:05", "05:04", "05:04", "05:04", "05:03", "05:03", "05:03", "05:02"];
  List<String> terbit = ["06:22", "06:21", "06:21", "06:21", "06:21", "06:20", "06:20", "06:20", "06:20", "06:20", "06:19", "06:19", "06:18", "06:18", "06:18", "06:18", "06:17", "06:17", "06:17", "06:16", "06:16", "06:16", "06:16", "06:15", "06:15", "06:15", "06:15", "06:14", "06:14"];
  List<String> dhuha = ["06:49", "06:48", "06:48", "06:48", "06:48", "06:47", "06:47", "06:47", "06:47", "06:46", "06:46", "06:46", "06:45", "06:45", "06:45", "06:45", "06:44", "06:44", "06:44", "06:44", "06:43", "06:43", "06:43", "06:42", "06:42", "06:42", "06:42", "06:42", "06:41"];
  List<String> dzuhur = ["12:32", "12:31", "12:31", "12:31", "12:31", "12:30", "12:30", "12:30", "12:29", "12:29", "12:29", "12:29", "12:28", "12:28", "12:28", "12:27", "12:27", "12:27", "12:26", "12:26", "12:26", "12:26", "12:25", "12:25", "12:25", "12:24", "12:24", "12:24", "12:24"];
  List<String> ashar = ["15:35", "15:34", "15:33", "15:32", "15:31", "15:30", "15:29", "15:30", "15:30", "15:31", "15:31", "15:31", "15:32", "15:32", "15:32", "15:33", "15:33", "15:33", "15:34", "15:34", "15:34", "15:35", "15:35", "15:35", "15:35", "15:35", "15:36", "15:36", "15:36"];
  List<String> magrib = ["18:35", "18:35", "18:34", "18:34", "18:34", "18:33", "18:33", "18:33", "18:32", "18:32", "18:32", "18:31", "18:31", "18:31", "18:30", "18:30", "18:30", "18:29", "18:29", "18:29", "18:28", "18:28", "18:28", "18:28", "18:27", "18:27", "18:27", "18:26", "18:26"];
  List<String> isya = ["19:43", "19:43", "19:42", "19:42", "19:42", "19:41", "19:41", "19:41", "19:40", "19:40", "19:40", "19:39", "19:39", "19:39", "19:38", "19:38", "19:38", "19:38", "19:37", "19:37", "19:37", "19:36", "19:36", "19:36", "19:36", "19:35", "19:35", "19:35", "19:35"];

  print();
  print("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA BARAT (PADANG) DAN SEKITARNYA");
  print("-----------------------------------------------------------------------------------------------------------");
  print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
  print("-----------------------------------------------------------------------------------------------------------");

  for (int i = 0; i < 9; i++) {
    print("| ${i + 1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }

  for (int i = 9; i < 29; i++) {
    print("| ${i + 1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }
}

void imsSumsel() {
  List<String> hijri = [
    "1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H",
    "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H",
    "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H",
    "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H"];

  List<String> greg = [
    "12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024",
    "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024",
    "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024",
    "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024"];

  List<String> imsak = ["04:42", "04:42", "04:42", "04:42", "04:42", "04:41", "04:41", "04:41", "04:41", "04:41", "04:41", "04:40", "04:40", "04:40", "04:39", "04:39", "04:39", "04:39", "04:38", "04:38", "04:38", "04:38", "04:37", "04:37", "04:37", "04:37", "04:36", "04:36", "04:36"];
  List<String> subuh = ["04:52", "04:52", "04:52", "04:52", "04:52", "04:51", "04:51", "04:51", "04:51", "04:51", "04:51", "04:50", "04:50", "04:50", "04:49", "04:49", "04:49", "04:49", "04:48", "04:48", "04:48", "04:48", "04:47", "04:47", "04:47", "04:47", "04:46", "04:46", "04:46"];
  List<String> terbit = ["06:04", "06:03", "06:03", "06:03", "06:03", "06:03", "06:02", "06:02", "06:02", "06:02", "06:02", "06:01", "06:01", "06:01", "06:01", "06:00", "06:00", "06:00", "06:00", "05:59", "05:59", "05:59", "05:59", "05:59", "05:58", "05:58", "05:58", "05:58", "05:58"];
  List<String> dhuha = ["06:31", "06:30", "06:30", "06:30", "06:30", "06:30", "06:29", "06:29", "06:29", "06:29", "06:28", "06:28", "06:28", "06:28", "06:28", "06:27", "06:27", "06:27", "06:27", "06:27", "06:26", "06:26", "06:26", "06:26", "06:26", "06:25", "06:25", "06:25", "06:25"];
  List<String> dzuhur = ["12:14", "12:14", "12:14", "12:13", "12:13", "12:13", "12:12", "12:12", "12:12", "12:12", "12:12", "12:11", "12:11", "12:10", "12:10", "12:10", "12:09", "12:09", "12:09", "12:09", "12:08", "12:08", "12:08", "12:07", "12:07", "12:07", "12:07", "12:06", "12:06"];
  List<String> ashar = ["15:14", "15:13", "15:14", "15:14", "15:15", "15:15", "15:16", "15:16", "15:16", "15:17", "15:17", "15:17", "15:17", "15:18", "15:18", "15:18", "15:18", "15:19", "15:19", "15:19", "15:19", "15:19", "15:20", "15:20", "15:20", "15:20", "15:20", "15:20", "15:20"];
  List<String> magrib = ["18:18", "18:17", "18:17", "18:17", "18:16", "18:16", "18:16", "18:15", "18:15", "18:15", "18:14", "18:14", "18:13", "18:13", "18:12", "18:12", "18:12", "18:11", "18:11", "18:11", "18:10", "18:10", "18:09", "18:09", "18:09", "18:08", "18:08", "18:08", "18:07"];
  List<String> isya = ["19:26", "19:26", "19:25", "19:25", "19:24", "19:24", "19:24", "19:23", "19:23", "19:23", "19:22", "19:22", "19:21", "19:21", "19:21", "19:20", "19:20", "19:19", "19:19", "19:19", "19:18", "19:18", "19:18", "19:17", "19:17", "19:17", "19:17", "19:16", "19:16"];

  print();
  print("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA SELATAN (PALEMBANG) DAN SEKITARNYA");
  print("-----------------------------------------------------------------------------------------------------------");
  print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
  print("-----------------------------------------------------------------------------------------------------------");

  for (int i = 0; i < 9; i++) {
    print("| ${i + 1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }

  for (int i = 9; i < 29; i++) {
    print("| ${i + 1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }
}

void imsBanten() {
  List<String> hijri = [
    "1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H",
    "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H",
    "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H",
    "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H"];

  List<String> greg = [
    "12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024",
    "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024",
    "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024",
    "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024"];

  List<String> imsak = [];
  List<String> subuh = [];
  List<String> terbit = [];
  List<String> dhuha = [];
  List<String> dzuhur = [];
  List<String> ashar = [];
  List<String> magrib = [];
  List<String> isya = [];

  print();
  print("JADWAL IMSAKIYAH UNTUK WILAYAH BANTEN (SERANG) DAN SEKITARNYA");
  print("-----------------------------------------------------------------------------------------------------------");
  print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
  print("-----------------------------------------------------------------------------------------------------------");

  for (int i = 0; i < 9; i++) {
    print("| ${i + 1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }

  for (int i = 9; i < 29; i++) {
    print("| ${i + 1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }
}

void imsJakarta() {
  List<String> hijri = [
    "1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H",
    "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H",
    "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H",
    "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H"];

  List<String> greg = [
    "12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024",
    "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024",
    "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024",
    "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024"];

  List<String> imsak = [];
  List<String> subuh = [];
  List<String> terbit = [];
  List<String> dhuha = [];
  List<String> dzuhur = [];
  List<String> ashar = [];
  List<String> magrib = [];
  List<String> isya = [];

  print();
  print("JADWAL IMSAKIYAH UNTUK WILAYAH DKI JAKARTA DAN SEKITARNYA");
  print("-----------------------------------------------------------------------------------------------------------");
  print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
  print("-----------------------------------------------------------------------------------------------------------");

  for (int i = 0; i < 9; i++) {
    print("| ${i + 1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }

  for (int i = 9; i < 29; i++) {
    print("| ${i + 1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }
}

void imsJabar() {
  List<String> hijri = [
    "1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H",
    "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
    "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H",
    "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
    "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H",
    "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H"];

  List<String> greg = [
    "12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024",
    "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
    "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024",
    "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
    "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024",
    "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024"];

  List<String> imsak = [];
  List<String> subuh = [];
  List<String> terbit = [];
  List<String> dhuha = [];
  List<String> dzuhur = [];
  List<String> ashar = [];
  List<String> magrib = [];
  List<String> isya = [];

  print();
  print("JADWAL IMSAKIYAH UNTUK WILAYAH JAWA BARAT (BANDUNG) DAN SEKITARNYA");
  print("-----------------------------------------------------------------------------------------------------------");
  print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
  print("-----------------------------------------------------------------------------------------------------------");

  for (int i = 0; i < 9; i++) {
    print("| ${i + 1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }

  for (int i = 9; i < 29; i++) {
    print("| ${i + 1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |");
    print("-----------------------------------------------------------------------------------------------------------");
  }
}

void main() {
  print("========================================");
  print("PROGRAM JADWAL IMSAKIYAH RAMADHAN 1445 H");
  print("========================================");
  print("1. Sumatra Barat (Kota Padang)");
  print("2. Sumatra Selatan (Kota Palembang)");
  print("3. Banten (Kabupaten Serang)");
  print("4. DKI Jakarta (Kota Jakarta)");
  print("5. Jawa Barat (Kota Bandung)");
  print("========================================\n");
  int prov = int.parse(stdin.readLineSync()!);

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
    print("Invalid");
  }
}
