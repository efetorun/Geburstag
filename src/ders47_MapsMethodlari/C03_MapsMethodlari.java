package ders47_MapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_MapsMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",6);
        mp1.put("C",8);

        //C key olarak varsa degerini 3 artir

        if(mp1.containsKey("C")){
            mp1.put("C",mp1.get("C")+3);

        }
        System.out.println(mp1);
//B key olarak varsda degerini 2 ile carp

        mp1.computeIfPresent("B",(k,v)-> 2*v);
        System.out.println(mp1);//{A=5, B=12, C=11}
        // a varsa degerini 5 azaltin
        mp1.computeIfPresent("A",(k,v)->v-5);
        System.out.println(mp1);//{A=0, B=12, C=11}

    // eyoksa degeri 8 olarak ekle

        System.out.println(mp1.computeIfAbsent("E", v -> 8));//8

        // e nin degerini 4 artir

        System.out.println(mp1.compute("E", (k, v) -> v + 4));//12

    }
}
