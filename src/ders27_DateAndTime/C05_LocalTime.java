package ders27_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {


        LocalTime saat= LocalTime.now();

        System.out.println(saat);

        LocalTime saat2=LocalTime.of(19,10,20);
        System.out.println(saat.compareTo(saat2));

        System.out.println(saat.withNano(65656));


    }
}
