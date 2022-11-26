package ders31_Inheritance;

public class GCorolla extends FToyota {

    String model="Corolla";
    String üretimYeri="Türkiye";
GCorolla(){
    super();
    System.out.println("Corolla Constructor");
}

    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka);
/*
Bir child klass ta obje olusturuldugunda obje sadece child a ait özellikleri degil
tüm parentlerinda özellklelrinbi tasir
bir objenin bir class in özelliklerini tasimasi icin o class in constructorun nun
calismasi gerekir
Yani parentlerin constructorlari da ototmatoikj oarak calisir
 extends keyword kullanilan bir class in ilk satrinda
  biz görmesekte bir super constructor call  vardir
 */
/* this(); bu class daki parametresiz constructor a git ve calistir

super(); parent teki parametresiz cons a git ve calistir


 */
    }





}
