package ders43_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_SEt {
    public static void main(String[] args) {
        //verilen bir Array in tekrar eden elemntlerini silip
        //her lementtin 1 kere kulalanildigi bir array haline getirin

        int [] arr={2,3,6,5,4,1,8,9,7,2,2,5,6,4,7,4,8,7,9,1,23,4};

        Set<Integer> geciciSet=new HashSet<>();

        for (Integer each: arr
             ) {
            geciciSet.add(each);
        }
    int[] geciciArr=new int[geciciSet.size()];//yeni ve bos bir Array var
         // Set deki benzersiz hale getirilöen elementlöeri gecic Array e tasiyalim

        int index=0;
        for (Integer each:geciciSet
             ) {
            geciciArr[index]=each;
            index++;
        }

    //tekarasiz degerleri gecici arr e tasidik
        // simdi kendi array imize gecici arr degerini atayalim

        arr=geciciArr;

        System.out.println(Arrays.toString(arr));

    }
}
