package ders37_Exceptions;

public class C03_ThrowKeyWord {
    public static void main(String[] args) {

        int sayi=1;
        System.out.println(sayi);
        try {
            sayi=2;
            System.out.println(sayi);
            if (sayi==2){
                throw new RuntimeException();
            }
            sayi=3;
            System.out.println(sayi);
            sayi=4;
            System.out.println(sayi);
            sayi=5;
            System.out.println(sayi);
        } catch (RuntimeException e) {

        }

        sayi=6;
        System.out.println(sayi);



    }



}
