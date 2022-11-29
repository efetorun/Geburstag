package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

//java collections icerisindeki bazi class lar index desteklemez
        //bu durumda index kullanmadan collection icerisindeki tüm elementlere ulasabilmek
        //ve onlari update edebilmek icin farkli ihtiyaclarimiz olur

        //LIst<> index yapisinin destekledigi icin boyle bir ihtiyacimiz olmaz
        //ancak bugunluk index kullanmadan List elementlerine ulasmaya
        //ve onlari update etmeye calisalim

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //index kullanmadan List in tüm elementlerini yazdirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+" ");
        }

    //index kullanmadan List in elementlerini bir artitrin
        //index kullanmadan 25 den büyük sayilari List den silin

        for (Integer each:sayilar
             ) {
            System.out.print(each+1+" ");//11 21 31 41
        }
        System.out.println(sayilar);//[10, 20, 30, 40]

    }
}
