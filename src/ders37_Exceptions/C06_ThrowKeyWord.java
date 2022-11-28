package ders37_Exceptions;

import java.util.Scanner;

public class C06_ThrowKeyWord {
/*
Kullanicidan yasini isteyin
eger 0 veya negatif bir sayi girerse
//uyari olsrsk illegalArgumentException uyarisini verin
ancak kodum uz normalk calismaya devam etsin
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz : ");
        int kullanici = scan.nextInt();


        if (kullanici == 0 || 0 > kullanici) {
            //    System.out.println("Hatali bir giris yaptiniz!!!");
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
e.printStackTrace();
                System.out.println("yas sifir veya negatif olamaz");
            }

        }


    }
}