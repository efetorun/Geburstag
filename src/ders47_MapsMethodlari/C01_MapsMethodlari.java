package ders47_MapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_MapsMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",6);
        mp1.put("C",8);

        System.out.println(mp1.putIfAbsent("D", 9));
        System.out.println(mp1);//{A=5, B=6, C=8, D=9} D=) u ekledi ve bize null döndürdü
        //d=9 u tekrar degistirmek istersek degistirmez cünkü zaten var ve degeri 9 der
    }
}
