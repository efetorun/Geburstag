package ders35_Exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {
//kullanicidan bir tamsayi alin
        //sayinin karesini yazdiein
        //kullanici ondalikli sayi gireerse kullniciya
        //ayri yazisi yazdiripi tekrar sayi isteyin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println(girilenSayi*girilenSayi);


    }
}
