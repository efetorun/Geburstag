package ders47_MapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMaps {
    public static void main(String[] args) {


        TreeMap<String,Integer> mp1=new TreeMap<>();
        mp1.put("A",5);
        mp1.put("B",6);
        mp1.put("C",8);

        System.out.println(mp1);

        System.out.println(mp1.higherKey("B"));//C

        System.out.println(mp1.higherEntry("k "));


    }
}
