package ders28_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        topla(1,2,3,4,5,6,7,8,9);
    }
public static void topla(int...sayilar){

    int toplamSonucu=0;

    for (int each: sayilar
         ) {
    toplamSonucu+=each;
    }
    System.out.println("Girilen sayilarin toplami : "+ toplamSonucu);
    }
}
