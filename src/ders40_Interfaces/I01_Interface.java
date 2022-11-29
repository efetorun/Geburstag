package ders40_Interfaces;

public interface I01_Interface {

    String ISIM = "Musatafa";

    /*
    Interface ler ozel yaopi oldugu icin
    yazilsada yazilmasada variabler
    public static ve final dir
     */
    static int SAYI = 20;//static karardi cunku gereksiz
    public static boolean guzelMi = true;

    //VARible isimleri büyük yazilabilir
void method1();
abstract int method2();
public abstract int method3();
//public ve abstract siyahlasti cunku gereksiz zaten
    //interface de methodlar abstract ve public
    //olmak zorundadir

}
