function imsSumbar() {
  const hijri = ["1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
    "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
    "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"];
  const greg = ["19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
    "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
    "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"];
    
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
  const hijri = ["1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
    "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
    "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"];
  const greg = ["19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
    "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
    "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"];
  
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
  const hijri = ["1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
    "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
    "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"];
  const greg = ["19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
    "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
    "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"];
  
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
  const hijri = ["1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
    "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
    "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"];
  const greg = ["19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
    "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
    "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"];
  
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
  const hijri = ["1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
    "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
    "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H"];
  const greg = ["19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
    "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
    "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026"];
  
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
    console.log("PROGRAM JADWAL IMSAKIYAH RAMADHAN 1447 H");
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
