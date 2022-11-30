package ders43_Collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>();

        set1.add(12);
        set1.add(15);
        System.out.println(set1);//[12, 15]

        Set<Integer> siraliSet= new TreeSet<>();
        siraliSet.add(34);
        siraliSet.add(23);
        siraliSet.addAll(set1);
        System.out.println(siraliSet);//[12, 15, 23, 34]
//Bir Hash set ve tree set olusturalim
       // ikisinede random 1000 tane sayi ekleyip
         //       islem sürelerini siralayalim

        Random rnd=new Random();
        int sayi;

        LocalTime ltBaslama=LocalTime.now();
        for (int i = 0; i < 1000; i++) {
        sayi=rnd.nextInt(1000000);
        set1.add(sayi);
        }
        LocalTime ltBitis=LocalTime.now();

        LocalTime ltBaslamaSirali=LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            sayi=rnd.nextInt(1000000);
            siraliSet.add(sayi);
        }LocalTime ltBitisSirali=LocalTime.now();
        System.out.println(ltBaslama.getNano()+" "+ltBitis.getNano());
        System.out.println(ltBaslamaSirali.getNano()+" "+ltBitisSirali.getNano());

    }
}
