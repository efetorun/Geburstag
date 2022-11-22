package ders24_constructors;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1= new Araba();

        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println(arb1);
        Araba arb2=new Araba();
        System.out.println(arb2);
        Araba arb3=new Araba("Porsche","Panamera");
        System.out.println(arb3);

   Araba arb4=new Araba("Hyundai","i30",5000);
        System.out.println(arb4);
  Araba arb5=new Araba("Porsche","Cayanne","Benzin",1990,12000);
        System.out.println(arb5);

    }
}
