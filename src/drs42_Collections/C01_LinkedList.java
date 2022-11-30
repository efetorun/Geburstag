package drs42_Collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<>();
        ll1.add("gamze");
        ll1.add("san");
        //Linked 'List 3 tane interface i implements etmistir
        //List Queue Deque interfaceleri
        //Dolayisiyla bu interface lerden sonra gelen ilk concrete class oldugundan
        //Bu 3 Interface deki tüm Abstract methodlari override etmistir


        List<String> ll2  =new LinkedList<>();

        ll2.add("efe");//[efe]
        System.out.println(ll2);
        ll2.add("Torun");
        System.out.println(ll2);//[efe, Torun]
        ll2.add(1,"Can");
        System.out.println(ll2);////[efe, Can, Torun] 1 inci index e can i ekledim

   ll2.addAll(1,ll1);
        System.out.println(ll2);//[efe, gamze, Can, Torun] ll1 i ll2 ye 1.index ten baslayarak ekledik
ll2.set(2,"Furkan");// 2 inci index teki can elementini silip furkan elemntini koyduk
        System.out.println(ll2);//[efe, gamze, Furkan, Torun]
        System.out.println(ll2.get(1));//gamze 1 inici elementi getirdik
        System.out.println(ll2.retainAll(ll1));//true
        System.out.println(ll1);//[gamze] ll1 deki gamze elemntini tutup digerlerini sildi
        ll1.addAll(0,ll2);
        System.out.println(ll1);//[gamze, gamze]
        System.out.println(ll2.subList(0, 1));//[gamze] 0 dahil 1 haric indexteki elemnti getirir



    }
}
