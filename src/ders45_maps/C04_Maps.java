package ders45_maps;

import ders44_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {


        //ogrenci map inde numarasi verilen sayilarin arasinda(sinirlar dahil)olanlarin
        //isim soyisim ve bölümlerini list olarak bize döndüren bir method olusturun

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();

        int basNo=102;
        int bitNo=103;

        List<String> isimListesi=MapDepo.numaraDeegerineGoreLIsteOlustur(ogrenciMap,basNo,bitNo);
        System.out.println(isimListesi);//[Ali Cem TM, Ayse Can MF, Ayse Cem TM, Fatma Han Soz]




    }


}
