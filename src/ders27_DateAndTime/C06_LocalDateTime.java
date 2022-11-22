package ders27_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();

        System.out.println(zaman);//2022-11-22T23:52:38.347745500

        System.out.println(zaman.getDayOfYear());//326




    }
}
