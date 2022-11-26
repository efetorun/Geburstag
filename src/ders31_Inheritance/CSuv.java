package ders31_Inheritance;

import java.util.Arrays;

public class CSuv extends BinekArac{
    public static void main(String[] args) {


        CSuv suv1=new CSuv();
        System.out.println(suv1.yil);
        suv1.teker();
        suv1.hiz();
        CSuv su2=new CSuv();
        System.out.println(su2.yakit);
        su2.hiz("dizel");
    }

public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("Benzin")){
            System.out.println("300 km");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("250 km");
        } else if (yakit.equalsIgnoreCase("Elktrikli")) {
            System.out.println("280 km");
        }else {
            System.out.println("Yakit belli degil hiz verisi saptanamadi");
        }
}


}
