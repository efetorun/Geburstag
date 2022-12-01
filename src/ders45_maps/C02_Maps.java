package ders45_maps;

import ders44_Maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        //ögrenciler map inde subesi h olan ögrencilerin//isim syisism ve siniflarini yazdiralim

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);//{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-H-TM, 104=Ayse-Can-10-H-MF, 105=Ayse-Cem-11-M-TM, 106=Fatma-Han-10-K-Soz}
        Set<Integer> ogrenciKeySet=ogrenciMap.keySet();//Bir mapdeki keyleeri set olarak döndürür

        ogrenciMap.values();// bir map deki tüm value lkeri collection olarak döndürür

        Collection<String> OgrenciValueCollection=ogrenciMap.values();






    }
}
