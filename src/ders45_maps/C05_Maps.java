package ders45_maps;

import ders44_Maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        //ogrenci map inden Numara isim ve soyisim degerlerini yazdiralim

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);



    }
}
