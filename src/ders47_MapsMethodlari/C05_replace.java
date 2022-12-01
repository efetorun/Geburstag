package ders47_MapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C05_replace {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",6);
        mp1.put("C",8);

        mp1.replace("C",10);
        System.out.println(mp1);//{A=5, B=6, C=10}

        mp1.replace("B",6,12);
        System.out.println(mp1);//{A=5, B=12, C=10}



    }
}
