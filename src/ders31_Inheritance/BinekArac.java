package ders31_Inheritance;

public class BinekArac extends Arac{

    protected String marka="Binek araclarin markasi vardir";
    protected String model="Binek araclarin modeli vardir";
    protected int yil=1990;

    protected void hiz(){
        System.out.println("binek araclarin hizi modeline göre degisir");
    }
    protected void teker(){
        System.out.println("Binek ararclarin 4 tetkeri olur");
    }
}
