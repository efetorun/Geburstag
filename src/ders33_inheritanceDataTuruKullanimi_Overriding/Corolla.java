package ders33_inheritanceDataTuruKullanimi_Overriding;

public class Corolla extends BToyota {
String model="Corolla";
String uretimYeri="Türkiye";
int yil=2023;

    public static void main(String[] args) {

        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model);
        System.out.println(corolla1.marka);
        System.out.println(corolla1.yil);
        System.out.println(corolla1.uretimYeri);
        System.out.println(corolla1.motor);
        System.out.println(corolla1.plaka);
        System.out.println(corolla1.yakit);
        System.out.println("**************");
        BToyota corolla2=new Corolla();
        System.out.println(corolla2.model);
        System.out.println(corolla2.marka);
        System.out.println(corolla2.yil);
       // System.out.println(corolla2.uretimYeri);
        System.out.println(corolla2.motor);
        System.out.println(corolla2.plaka);
        System.out.println(corolla2.yakit);
        System.out.println("**************");
        Araba corolla3=new Corolla();
        /*System.out.println(corolla3.model);
        System.out.println(corolla3.marka);
        System.out.println(corolla3.yil);
        System.out.println(corolla3.uretimYeri);*/
        System.out.println(corolla3.motor);
        System.out.println(corolla3.plaka);
        System.out.println(corolla3.yakit);



    }
}
