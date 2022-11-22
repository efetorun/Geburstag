package ders23_Constructors;

public class Daraba {
String marka="Marka belirtilmedi";
String model="Model Belirtilmedi";
String yakit;
int yil;
int fiyat;


    @Override
    public String toString() {
        return "Araba Özellileri" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    public  int maxHiz(String yakit){
    int maxHiz=120;
    if(yakit.equalsIgnoreCase("dizel")){
        maxHiz=200;
    } else if (yakit.equalsIgnoreCase("benzin")) {
        maxHiz=230;
    } else if (yakit.equalsIgnoreCase("elektrikli")) {
        maxHiz=180;
    }
    return maxHiz;

}



}
