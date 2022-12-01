package ders44_Maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();
        ogrenciMap.put(105,"Efe-Torun-11-K-MF");
        ogrenciMap.put(108,"Gamze-Torun-11-H-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.get(108));//Gamze-Torun-11-H-MF
        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap,108));//Gamze Torun
        MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,105,"D");
        System.out.println(ogrenciMap.get(105));//Efe-Torun-11-D-MF

    }
}
