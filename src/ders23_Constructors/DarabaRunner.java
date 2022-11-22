package ders23_Constructors;

public class DarabaRunner {
    public static void main(String[] args) {

        Daraba arb1= new Daraba();
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.yil);

        arb1.marka="Tofas";
        arb1.model="Kartal";
        arb1.fiyat=50000;
        arb1.yakit="Benzin";
        arb1.maxHiz(arb1.yakit);

        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);

    Daraba arb2=new Daraba();
        System.out.println( "\nMarka : " + arb2.marka+
                            "\nModel : " + arb2.model+
                            "\nYakit : " + arb2.yakit+
                            "\nYil : " + arb2.yil+
                            "\nFiyat : " + arb2.fiyat);
Daraba arb3=new Daraba();
        System.out.println(arb3);
        System.out.println(arb1);
   Daraba arb4=new Daraba();
        System.out.println(arb4);
    }
}
