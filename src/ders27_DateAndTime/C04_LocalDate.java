package ders27_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.minusDays(100));//2022-08-14
        System.out.println(tarih.minusWeeks(5));//2022-10-18
        System.out.println(tarih.plusDays(15));

        System.out.println(tarih.getMonthValue());//11
        System.out.println(tarih.getMonth());//NOVEMBER
        System.out.println(tarih.isLeapYear());//false
        System.out.println(tarih.withYear(2024).isLeapYear());//true
        System.out.println(tarih.withYear(2019).withMonth(8).withDayOfMonth(24).getDayOfWeek());



    }
}
