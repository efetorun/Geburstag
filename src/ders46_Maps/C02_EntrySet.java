package ders46_Maps;

import ders44_Maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

      //ogrenci mapinde sirali olarak
      // tüm ögrencilerin
        //bölüm sinif sube isim soyisim ve numaralarinin yazdirin

        Map<Integer,String> ogrenciMapi= MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");


        Set<String> siraliOgrenciListesi=MapDepo.siraliOgrenciListesiOlusutr(ogrenciMapi);
        System.out.println(siraliOgrenciListesi);


    }
}
