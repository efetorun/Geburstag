package ders24_constructors;

public class Araba {
    String marka="Marka belirtilmedi";
    String model="Model Belirtilmedi";
    String yakit;

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    int yil;
    int fiyat;


    public Araba(){

    }
    public Araba (String mrk,String mdl){
        marka=mrk;
        model=mdl;



    }


    @Override
    public String toString() {
        return "Araba Ozellileri" +
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyakit=" + yakit +
                "\nyil="    + yil +
                "\nfiyat="  + fiyat ;
    }
}
