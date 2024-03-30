function imsSumbar() {
    const hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"];
    const greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""];
    
  const imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];

    console.log("");
    console.log("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA BARAT (PADANG) DAN SEKITARNYA");
    console.log("-----------------------------------------------------------------------------------------------------------");
    console.log("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    console.log("-----------------------------------------------------------------------------------------------------------");
  
    for (let i = 0; i < 9; i++) {
      console.log(`| ${i+1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
    for (let i = 9; i < 30; i++) {
      console.log(`| ${i+1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
}

function imsSumsel() {
  const hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"];
  const greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""];
  
  const imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];

    console.log("");
    console.log("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA SELATAN (PALEMBANG) DAN SEKITARNYA");
    console.log("-----------------------------------------------------------------------------------------------------------");
    console.log("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    console.log("-----------------------------------------------------------------------------------------------------------");
  
    for (let i = 0; i < 9; i++) {
      console.log(`| ${i+1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
    for (let i = 9; i < 30; i++) {
      console.log(`| ${i+1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
}

function imsBanten() {
  const hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"];
  const greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""];
  
  const imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];

    console.log("");
    console.log("JADWAL IMSAKIYAH UNTUK WILAYAH BANTEN (SERANG) DAN SEKITARNYA");
    console.log("-----------------------------------------------------------------------------------------------------------");
    console.log("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    console.log("-----------------------------------------------------------------------------------------------------------");
  
    for (let i = 0; i < 9; i++) {
      console.log(`| ${i+1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
    for (let i = 9; i < 30; i++) {
      console.log(`| ${i+1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
}

function imsJakarta() {
  const hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"];
  const greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""];
  
  const imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];

    console.log("");
    console.log("JADWAL IMSAKIYAH UNTUK WILAYAH DKI JAKARTA DAN SEKITARNYA");
    console.log("-----------------------------------------------------------------------------------------------------------");
    console.log("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    console.log("-----------------------------------------------------------------------------------------------------------");
  
    for (let i = 0; i < 9; i++) {
      console.log(`| ${i+1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
    for (let i = 9; i < 30; i++) {
      console.log(`| ${i+1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
}

function imsJabar() {
  const hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"];
  const greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""];
  
  const imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];
  const isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""];

    console.log("");
    console.log("JADWAL IMSAKIYAH UNTUK WILAYAH JAWA BARAT (BANDUNG) DAN SEKITARNYA");
    console.log("-----------------------------------------------------------------------------------------------------------");
    console.log("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |");
    console.log("-----------------------------------------------------------------------------------------------------------");
  
    for (let i = 0; i < 9; i++) {
      console.log(`| ${i+1}  | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]}  | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
    for (let i = 9; i < 30; i++) {
      console.log(`| ${i+1} | ${hijri[i]} / ${greg[i]} | ${imsak[i]} | ${subuh[i]} | ${terbit[i]} | ${dhuha[i]} | ${dzuhur[i]}  | ${ashar[i]} | ${magrib[i]} | ${isya[i]} |`);
      console.log("-----------------------------------------------------------------------------------------------------------");
    }
}

  
function main() {
    const nama = [];
    const status = [];
    const nilai = [];
  
    console.log("========================================");
    console.log("PROGRAM JADWAL IMSAKIYAH RAMADHAN 1444 H");
    console.log("========================================");
    console.log("1. Sumatra Barat (Kota Padang)");
    console.log("2. Sumatra Selatan (Kota Palembang)");
    console.log("3. Banten (Kabupaten Serang)");
    console.log("4. DKI Jakarta (Kota Jakarta)");
    console.log("5. Jawa Barat (Kota Bandung)");
    console.log("========================================");
    console.log("");
  
    const prompt = require("prompt-sync")();
    const prov = prompt("Masukan Nomor Provinsi : ");
  
    if (prov === "1") {
      imsSumbar();
    } else if (prov === "2") {
      imsSumsel();
    } else if (prov === "3") {
      imsBanten();
    } else if (prov === "4") {
      imsJakarta();
    } else if (prov === "5") {
      imsJabar();
    } else {
      console.log("Invalid");
    }
}
  
main();
