<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Jadwal Imsakiyah Ramadhan 1445 H</title>
    <style>
      table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 1250px;
      }
      td {
        border: 1px solid #000000;
        text-align: left;
        padding: 8px;
        width: 30%;
      }

      th {
        border: 1px solid #000000;
        text-align: left;
        padding: 8px;
      }

      table,
      td,
      th {
        text-align: center;
      }

      #no {
        width: 50px;
      }

      #hijri,
      #greg {
        width: 200px;
      }

      #imsak,
      #subuh,
      #terbit,
      #dhuha,
      #zuhur,
      #ashar,
      #magrib,
      #isya {
        width: 100px;
      }
    </style>
  </head>
  <body>
      <?php
      function imsSumbar(){
        $hijri = array("1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
        "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
        "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H");

        $greg = array("12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
        "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
        "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024");
        
        $imsak = array("05:00", "05:00", "05:00", "05:00", "05:00", "04:59", "04:59", "04:59", "04:59", "04:59", "04:58", "04:58", "04:57", "04:57", "04:57", "04:57", "04:56", "04:56", "04:56", "04:55", "04:55", "04:55", "04:54", "04:54", "04:54", "04:53", "04:53", "04:53", "04:52");
        $subuh = array("05:10", "05:10", "05:10", "05:10", "05:10", "05:09", "05:09", "05:09", "05:09", "05:09", "05:08", "05:08", "05:07", "05:07", "05:07", "05:07", "05:06", "05:06", "05:06", "05:05", "05:05", "05:05", "05:04", "05:04", "05:04", "05:03", "05:03", "05:03", "05:02");
        $terbit = array();
        $dhuha = array();
        $dzuhur = array();
        $ashar = array();
        $magrib = array();
        $isya = array();
      
        echo '<tr>';
        echo '<th id="no">No.</th>';
        echo '<th id="hijri">Tanggal Hijriah</th>';
        echo '<th id="greg">Tanggal Masehi</th>';
        echo '<th id="imsak">Imsak</th>';
        echo '<th id="subuh">Subuh</th>';
        echo '<th id="terbit">Terbit</th>';
        echo '<th id="dhuha">Dhuha</th>';
        echo '<th id="zuhur">Zuhur</th>';
        echo '<th id="ashar">Ashar</th>';
        echo '<th id="magrib">Magrib</th>';
        echo '<th id="isya">Isya</th>';
        echo '</tr>';
        for ($i=0; $i<30; $i++) {
          echo '<tr>';
          echo '<td id="no">'. ($i+1) .'</td>';
          echo '<td id="hijri">'. $hijri[$i] .'</td>';
          echo '<td id="greg">'. $greg[$i] .'</td>';
          echo '<td id="imsak">'. $imsak[$i] .'</td>';
          echo '<td id="subuh">'. $subuh[$i] .'</td>';
          echo '<td id="terbit">'. $terbit[$i] .'</td>';
          echo '<td id="dhuha">'. $dhuha[$i] .'</td>';
          echo '<td id="zuhur">'. $dzuhur[$i] .'</td>';
          echo '<td id="ashar">'. $ashar[$i] .'</td>';
          echo '<td id="magrib">'. $magrib[$i] .'</td>';
          echo '<td id="isya">'. $isya[$i] .'</td>';
          echo '</tr>';
        }
      }

      function imsSumsel(){
        $hijri = array("1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
        "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
        "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H");

        $greg = array("12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
        "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
        "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024");
        
        $imsak = array("04:42", "04:42", "04:42", "04:42", "04:42", "04:41", "04:41", "04:41", "04:41", "04:41", "04:41", "04:40", "04:40", "04:40", "04:39", "04:39", "04:39", "04:39", "04:38", "04:38", "04:38", "04:38", "04:37", "04:37", "04:37", "04:37", "04:36", "04:36", "04:36");
        $subuh = array("04:52", "04:52", "04:52", "04:52", "04:52", "04:51", "04:51", "04:51", "04:51", "04:51", "04:51", "04:50", "04:50", "04:50", "04:49", "04:49", "04:49", "04:49", "04:48", "04:48", "04:48", "04:48", "04:47", "04:47", "04:47", "04:47", "04:46", "04:46", "04:46");
        $terbit = array();
        $dhuha = array();
        $dzuhur = array();
        $ashar = array();
        $magrib = array();
        $isya = array();
      
        echo '<tr>';
        echo '<th id="no">No.</th>';
        echo '<th id="hijri">Tanggal Hijriah</th>';
        echo '<th id="greg">Tanggal Masehi</th>';
        echo '<th id="imsak">Imsak</th>';
        echo '<th id="subuh">Subuh</th>';
        echo '<th id="terbit">Terbit</th>';
        echo '<th id="dhuha">Dhuha</th>';
        echo '<th id="zuhur">Zuhur</th>';
        echo '<th id="ashar">Ashar</th>';
        echo '<th id="magrib">Magrib</th>';
        echo '<th id="isya">Isya</th>';
        echo '</tr>';
        for ($i=0; $i<30; $i++) {
          echo '<tr>';
          echo '<td id="no">'. ($i+1) .'</td>';
          echo '<td id="hijri">'. $hijri[$i] .'</td>';
          echo '<td id="greg">'. $greg[$i] .'</td>';
          echo '<td id="imsak">'. $imsak[$i] .'</td>';
          echo '<td id="subuh">'. $subuh[$i] .'</td>';
          echo '<td id="terbit">'. $terbit[$i] .'</td>';
          echo '<td id="dhuha">'. $dhuha[$i] .'</td>';
          echo '<td id="zuhur">'. $dzuhur[$i] .'</td>';
          echo '<td id="ashar">'. $ashar[$i] .'</td>';
          echo '<td id="magrib">'. $magrib[$i] .'</td>';
          echo '<td id="isya">'. $isya[$i] .'</td>';
          echo '</tr>';
        }
      }

      function imsBanten(){
        $hijri = array("1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
        "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
        "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H");

        $greg = array("12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
        "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
        "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024");
        
        $imsak = array();
        $subuh = array();
        $terbit = array();
        $dhuha = array();
        $dzuhur = array();
        $ashar = array();
        $magrib = array();
        $isya = array();
      
        echo '<tr>';
        echo '<th id="no">No.</th>';
        echo '<th id="hijri">Tanggal Hijriah</th>';
        echo '<th id="greg">Tanggal Masehi</th>';
        echo '<th id="imsak">Imsak</th>';
        echo '<th id="subuh">Subuh</th>';
        echo '<th id="terbit">Terbit</th>';
        echo '<th id="dhuha">Dhuha</th>';
        echo '<th id="zuhur">Zuhur</th>';
        echo '<th id="ashar">Ashar</th>';
        echo '<th id="magrib">Magrib</th>';
        echo '<th id="isya">Isya</th>';
        echo '</tr>';
        for ($i=0; $i<30; $i++) {
          echo '<tr>';
          echo '<td id="no">'. ($i+1) .'</td>';
          echo '<td id="hijri">'. $hijri[$i] .'</td>';
          echo '<td id="greg">'. $greg[$i] .'</td>';
          echo '<td id="imsak">'. $imsak[$i] .'</td>';
          echo '<td id="subuh">'. $subuh[$i] .'</td>';
          echo '<td id="terbit">'. $terbit[$i] .'</td>';
          echo '<td id="dhuha">'. $dhuha[$i] .'</td>';
          echo '<td id="zuhur">'. $dzuhur[$i] .'</td>';
          echo '<td id="ashar">'. $ashar[$i] .'</td>';
          echo '<td id="magrib">'. $magrib[$i] .'</td>';
          echo '<td id="isya">'. $isya[$i] .'</td>';
          echo '</tr>';
        }
      }

      function imsJakarta(){
        $hijri = array("1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
        "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
        "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H");

        $greg = array("12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
        "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
        "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024");
        
        $imsak = array();
        $subuh = array();
        $terbit = array();
        $dhuha = array();
        $dzuhur = array();
        $ashar = array();
        $magrib = array();
        $isya = array();
      
        echo '<tr>';
        echo '<th id="no">No.</th>';
        echo '<th id="hijri">Tanggal Hijriah</th>';
        echo '<th id="greg">Tanggal Masehi</th>';
        echo '<th id="imsak">Imsak</th>';
        echo '<th id="subuh">Subuh</th>';
        echo '<th id="terbit">Terbit</th>';
        echo '<th id="dhuha">Dhuha</th>';
        echo '<th id="zuhur">Zuhur</th>';
        echo '<th id="ashar">Ashar</th>';
        echo '<th id="magrib">Magrib</th>';
        echo '<th id="isya">Isya</th>';
        echo '</tr>';
        for ($i=0; $i<30; $i++) {
          echo '<tr>';
          echo '<td id="no">'. ($i+1) .'</td>';
          echo '<td id="hijri">'. $hijri[$i] .'</td>';
          echo '<td id="greg">'. $greg[$i] .'</td>';
          echo '<td id="imsak">'. $imsak[$i] .'</td>';
          echo '<td id="subuh">'. $subuh[$i] .'</td>';
          echo '<td id="terbit">'. $terbit[$i] .'</td>';
          echo '<td id="dhuha">'. $dhuha[$i] .'</td>';
          echo '<td id="zuhur">'. $dzuhur[$i] .'</td>';
          echo '<td id="ashar">'. $ashar[$i] .'</td>';
          echo '<td id="magrib">'. $magrib[$i] .'</td>';
          echo '<td id="isya">'. $isya[$i] .'</td>';
          echo '</tr>';
        }
      }

      function imsJabar(){
        $hijri = array("1 Ramadan 1445 H", "2 Ramadan 1445 H", "3 Ramadan 1445 H", "4 Ramadan 1445 H", "5 Ramadan 1445 H", "6 Ramadan 1445 H", "7 Ramadan 1445 H", "8 Ramadan 1445 H", "9 Ramadan 1445 H", "10 Ramadan 1445 H",
        "11 Ramadan 1445 H", "12 Ramadan 1445 H", "13 Ramadan 1445 H", "14 Ramadan 1445 H", "15 Ramadan 1445 H", "16 Ramadan 1445 H", "17 Ramadan 1445 H", "18 Ramadan 1445 H", "19 Ramadan 1445 H", "20 Ramadan 1445 H",
        "21 Ramadan 1445 H", "22 Ramadan 1445 H", "23 Ramadan 1445 H", "24 Ramadan 1445 H", "25 Ramadan 1445 H", "26 Ramadan 1445 H", "27 Ramadan 1445 H", "28 Ramadan 1445 H", "29 Ramadan 1445 H");

        $greg = array("12 Maret 2024", "13 Maret 2024", "14 Maret 2024", "15 Maret 2024", "16 Maret 2024", "17 Maret 2024", "18 Maret 2024", "19 Maret 2024", "20 Maret 2024", "21 Maret 2024",
        "22 Maret 2024", "23 Maret 2024", "24 Maret 2024", "25 Maret 2024", "26 Maret 2024", "27 Maret 2024", "28 Maret 2024", "29 Maret 2024", "30 Maret 2024", "31 Maret 2024",
        "1 April 2024", "2 April 2024", "3 April 2024", "4 April 2024", "5 April 2024", "6 April 2024", "7 April 2024", "8 April 2024", "9 April 2024");
        
        $imsak = array();
        $subuh = array();
        $terbit = array();
        $dhuha = array();
        $dzuhur = array();
        $ashar = array();
        $magrib = array();
        $isya = array();
      
        echo '<tr>';
        echo '<th id="no">No.</th>';
        echo '<th id="hijri">Tanggal Hijriah</th>';
        echo '<th id="greg">Tanggal Masehi</th>';
        echo '<th id="imsak">Imsak</th>';
        echo '<th id="subuh">Subuh</th>';
        echo '<th id="terbit">Terbit</th>';
        echo '<th id="dhuha">Dhuha</th>';
        echo '<th id="zuhur">Zuhur</th>';
        echo '<th id="ashar">Ashar</th>';
        echo '<th id="magrib">Magrib</th>';
        echo '<th id="isya">Isya</th>';
        echo '</tr>';
        for ($i=0; $i<30; $i++) {
          echo '<tr>';
          echo '<td id="no">'. ($i+1) .'</td>';
          echo '<td id="hijri">'. $hijri[$i] .'</td>';
          echo '<td id="greg">'. $greg[$i] .'</td>';
          echo '<td id="imsak">'. $imsak[$i] .'</td>';
          echo '<td id="subuh">'. $subuh[$i] .'</td>';
          echo '<td id="terbit">'. $terbit[$i] .'</td>';
          echo '<td id="dhuha">'. $dhuha[$i] .'</td>';
          echo '<td id="zuhur">'. $dzuhur[$i] .'</td>';
          echo '<td id="ashar">'. $ashar[$i] .'</td>';
          echo '<td id="magrib">'. $magrib[$i] .'</td>';
          echo '<td id="isya">'. $isya[$i] .'</td>';
          echo '</tr>';
        }
      }
    ?>

    <h1>Jadwal Imsakiyah Ramadhan 1444 H</h1>
    <h2>Untuk Wilayah Sumatera Barat (Padang) dan Sekitarnya</h2>
    <table>
      <?php imsSumbar()?>
    </table>
    <br />
    <h2>Untuk Wilayah Sumatera Selatan (Palembang) dan Sekitarnya</h2>
    <table>
      <?php imsSumsel()?>
    </table>
    <br />
    <h2>Untuk Wilayah Banten (Serang) dan Sekitarnya</h2>
    <table>
      <?php imsBanten()?>
    </table>
    <br />
    <h2>Untuk Wilayah DKI Jakarta dan Sekitarnya</h2>
    <table>
      <?php imsJakarta()?>
    </table>
    <br />
    <h2>Untuk Wilayah Jawa Barat (Bandung) dan Sekitarnya</h2>
    <table>
      <?php imsJabar()?>
    </table>
  </body>
</html>
