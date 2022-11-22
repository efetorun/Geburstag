package ders27_DateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class C05_HangiGunDogdun {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dogum Yilinizi Giriniz : ");
        int dYili= scan.nextInt();
        System.out.println("Lütfen dogum Ayinizi Giriniz : ");
        int dAyi= scan.nextInt();
        System.out.println("Lütfen dogum Gününüzü Giriniz : ");
        int dGunu= scan.nextInt();
        System.out.println("Dogdugunuz gün : ");
        System.out.println(tarih.withYear(dYili).withMonth(dAyi).withDayOfMonth(dGunu).getDayOfWeek());

    }
}
