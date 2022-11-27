package ders35_Exceptions;

public class C02_AritmatikException {
    public static void main(String[] args) {
        //verilen iki sayiyi birbirine bölüp

        //sonucun tam sayi kismini birbirine yazdirin

   int sayi1=20;
   int sayi2=0;


        try {
            System.out.println(sayi1/sayi2);
            System.out.println("bakalim bu satir calisacak mi?");
        } catch (Exception e) {
            System.out.println("sayi 0 a bölünemez");

        }
   /*
   bazi exceptionlar if else ile handle edilebilir
   ama t+m exceptionlar icin bu yeterli olmaz
    */




    }
}
