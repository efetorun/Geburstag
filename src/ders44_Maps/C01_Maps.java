package ders44_Maps;

import java.util.HashMap;
import java.util.Map;

import static ders44_Maps.MapDepo.*;

public class C01_Maps {
    public static void main(String[] args) {

       Map <Integer,String> ogrenciMap= ornekMapOlustur();

        System.out.println(ogrenciMap);
//{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-H-TM, 104=Ayse-Can-10-H-MF, 105=Ayse-Cem-11-M-TM, 106=Fatma-Han-10-K-Soz}
        System.out.println(ogrenciMap.get(101));




    }
}
