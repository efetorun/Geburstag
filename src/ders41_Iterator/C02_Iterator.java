package ders41_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator it1=sayilar.iterator();

      //Tüm elementleri Iteratör kullanarak yazdiralim

        System.out.println(it1.hasNext());//true yaniunda eleman var
        System.out.println(it1.next());//10
        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//20

        while (it1.hasNext()){
            System.out.println(it1.next());//3040

        }
    //Iteratör ü biz 30 a kadar itelemistik o yüzden 30 ve 40 i yazdirdi
        //tekrardaN ITERATOR OLUSTURMAMIZ LAZIM

        Iterator it2= sayilar.iterator();
        while (it2.hasNext()){
            System.out.print(it2.next()+" ");//10 20 30 40

        }
        //iterator kullanarak bu listeden 15 ile 35 arasindaki sayilari silin



    }
}
