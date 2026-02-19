<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Jadwal Imsakiyah Ramadhan 1447 H</title>
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
      $hijri = array("1 Ramadan 1447 H","2 Ramadan 1447 H","3 Ramadan 1447 H","4 Ramadan 1447 H","5 Ramadan 1447 H","6 Ramadan 1447 H","7 Ramadan 1447 H","8 Ramadan 1447 H","9 Ramadan 1447 H","10 Ramadan 1447 H",
      "11 Ramadan 1447 H","12 Ramadan 1447 H","13 Ramadan 1447 H","14 Ramadan 1447 H","15 Ramadan 1447 H","16 Ramadan 1447 H","17 Ramadan 1447 H","18 Ramadan 1447 H","19 Ramadan 1447 H","20 Ramadan 1447 H",
      "21 Ramadan 1447 H","22 Ramadan 1447 H","23 Ramadan 1447 H","24 Ramadan 1447 H","25 Ramadan 1447 H","26 Ramadan 1447 H","27 Ramadan 1447 H","28 Ramadan 1447 H","29 Ramadan 1447 H","30 Ramadan 1447 H");

      $greg = array("19 Februari 2026","20 Februari 2026","21 Februari 2026","22 Februari 2026","23 Februari 2026","24 Februari 2026","25 Februari 2026","26 Februari 2026","27 Februari 2026","28 Februari 2026",
      "1 Maret 2026","2 Maret 2026","3 Maret 2026","4 Maret 2026","5 Maret 2026","6 Maret 2026","7 Maret 2026","8 Maret 2026","9 Maret 2026","10 Maret 2026",
      "11 Maret 2026","12 Maret 2026","13 Maret 2026","14 Maret 2026","15 Maret 2026","16 Maret 2026","17 Maret 2026","18 Maret 2026","19 Maret 2026","20 Maret 2026");

      function imsSumbar(){
        global $hijri, $greg;
        
        $imsak = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $subuh = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $terbit = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dhuha = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dzuhur = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $ashar = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $magrib = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $isya = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
      
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
        for ($i=0; $i<count($hijri); $i++) {
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
        global $hijri, $greg;
        
        $imsak = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $subuh = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $terbit = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dhuha = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dzuhur = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $ashar = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $magrib = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $isya = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
      
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
        for ($i=0; $i<count($hijri); $i++) {
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
        global $hijri, $greg;
        
        $imsak = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $subuh = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $terbit = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dhuha = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dzuhur = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $ashar = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $magrib = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $isya = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
      
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
        for ($i=0; $i<count($hijri); $i++) {
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
        global $hijri, $greg;
        
        $imsak = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $subuh = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $terbit = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dhuha = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dzuhur = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $ashar = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $magrib = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $isya = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
      
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
        for ($i=0; $i<count($hijri); $i++) {
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
        global $hijri, $greg;
        
        $imsak = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $subuh = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $terbit = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dhuha = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $dzuhur = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $ashar = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $magrib = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        $isya = array("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
      
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
        for ($i=0; $i<count($hijri); $i++) {
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

    <h1>Jadwal Imsakiyah Ramadhan 1447 H</h1>
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
