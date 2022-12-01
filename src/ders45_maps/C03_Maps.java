package ders45_maps;

import ders44_Maps.MapDepo;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        ogrenciMap.put(107,"Hasan-Yan-12-H-MF");
        ogrenciMap.put(101,"Hasan-gayik-11-H-MT");
        String subeAdi="H";
        System.out.println(ogrenciMap);
        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap,subeAdi);






    }
}
