def imsSumbar():
    hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"]
    greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""]

    imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]

    print()
    print("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA BARAT (PADANG) DAN SEKITARNYA")
    print("-----------------------------------------------------------------------------------------------------------")
    print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |")
    print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9):
        print(f"| {i+1}  | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]}  | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9, 30):
        print(f"| {i+1} | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]} | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

def imsSumsel():
    hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"]
    greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""]

    imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]

    print()
    print("JADWAL IMSAKIYAH UNTUK WILAYAH SUMATERA SELATAN (PALEMBANG) DAN SEKITARNYA")
    print("-----------------------------------------------------------------------------------------------------------")
    print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |")
    print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9):
        print(f"| {i+1}  | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]}  | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9, 30):
        print(f"| {i+1} | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]} | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

def imsBanten():
    hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"]
    greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""]

    imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]

    print()
    print("JADWAL IMSAKIYAH UNTUK WILAYAH BANTEN (SERANG) DAN SEKITARNYA")
    print("-----------------------------------------------------------------------------------------------------------")
    print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |")
    print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9):
        print(f"| {i+1}  | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]}  | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9, 30):
        print(f"| {i+1} | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]} | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

def imsJakarta():
    hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"]
    greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""]

    imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]

    print()
    print("JADWAL IMSAKIYAH UNTUK WILAYAH DKI JAKARTA DAN SEKITARNYA")
    print("-----------------------------------------------------------------------------------------------------------")
    print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |")
    print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9):
        print(f"| {i+1}  | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]}  | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9, 30):
        print(f"| {i+1} | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]} | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

def imsJabar():
    hijri = ["1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
  "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
  "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H", "30 Ramadan 1445 H"]
    greg = ["12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024", 
  "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024", 
  "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024", ""]

    imsak = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    subuh = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    terbit = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dhuha = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    dzuhur = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    ashar = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    magrib = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]
    isya = ["", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""]

    print()
    print("JADWAL IMSAKIYAH UNTUK WILAYAH JAWA BARAT (BANDUNG) DAN SEKITARNYA")
    print("-----------------------------------------------------------------------------------------------------------")
    print("| No |             Tanggal              | Imsak | Subuh | Terbit | Dhuha | Dzuhur | Ashar | Magrib | Isya |")
    print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9):
        print(f"| {i+1}  | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]}  | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")

    for i in range(9, 30):
        print(f"| {i+1} | {hijri[i]} / {greg[i]} | {imsak[i]} | {subuh[i]} | {terbit[i]} | {dhuha[i]} | {dzuhur[i]}  | {ashar[i]} | {magrib[i]} | {isya[i]} |")
        print("-----------------------------------------------------------------------------------------------------------")


def main():
    print("========================================")
    print("PROGRAM JADWAL IMSAKIYAH RAMADHAN 1445 H")
    print("========================================")
    print("1. Sumatra Barat (Kota Padang)")
    print("2. Sumatra Selatan (Kota Palembang)")
    print("3. Banten (Kabupaten Serang)")
    print("4. DKI Jakarta (Kota Jakarta)")
    print("5. Jawa Barat (Kota Bandung)")
    print("========================================")
    print()
    prov = int(input("Masukan Nomor Provinsi : "))

    if prov == 1:
        return imsSumbar()
    elif prov == 2:
        return imsSumsel()
    elif prov == 3:
        return imsBanten()
    elif prov == 4:
        return imsJakarta()
    elif prov == 5:
        return imsJabar()
    else:
        print("Invalid")

if __name__ == "__main__":
    main()