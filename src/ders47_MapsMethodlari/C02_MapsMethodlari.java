package ders47_MapsMethodlari;

import ders44_Maps.MapDepo;

import java.util.Map;

public class C02_MapsMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap);
        ogrenciMap.containsKey(5);//true


    }
}
