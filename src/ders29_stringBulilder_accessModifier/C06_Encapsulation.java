package ders29_stringBulilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    public static void main(String[] args) {
        /*
        büyük projelerde datayi görme ve degistirme yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir

         */
        List<Integer> sayilar= new ArrayList<>();
         sayilar.add(2);
         sayilar.add(3);
   //sayilar.get(1)=10; okumaya izin verir ama deger atamaya yani yazmaya izin vermez
        sayilar.set(1,5);//1. indexteki sayiyi 5 ile degistirdi ama 1. indexteki sayiyi göstermedi
        //yani atamya izin var okumaya izin yok
        System.out.println(sayilar);


    }
}
