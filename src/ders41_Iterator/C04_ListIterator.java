package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //Iterator kullanarak listen in elementlerini sondan basa dogrtu yazdirin
        ListIterator lit= sayilar.listIterator();
        //önce Tierator u sona götürün
  while (lit.hasNext()){
      lit.next();
  }
while (lit.hasPrevious()){
    System.out.println(lit.previous()+" ");
}
//iterator kullanarak listenin tum elementlerini 5 artirin

        System.out.println("");
        System.out.println(lit.nextIndex());//0 inci index in önünde

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5);

        }
        System.out.println(sayilar);//[15, 25, 35, 45] listimiz index kullanmadan kalici olarak degisti

        // Iterator kullanarak 40 dan kücük olan elementleri silin

        while (lit.hasPrevious()){
            if((Integer)lit.previous()<40){
                lit.remove();
            }
        }
        System.out.println(sayilar);//[45]

    }
}
