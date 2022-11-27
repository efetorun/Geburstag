package ders35_Exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutofBpoundsException {
    public static void main(String[] args) {

        int[]arr = {3,4,6,2,4,7,8,9,6,2,4,5};

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir index giriniz");
        int index= scan.nextInt();

        System.out.println(arr[index]);

    }





}
