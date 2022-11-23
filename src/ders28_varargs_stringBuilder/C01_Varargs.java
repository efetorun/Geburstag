package ders28_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        topla(3,5);
        topla(3,5,6);
        topla(1,2,3,4);
    }

    private static void topla(int i, int i1, int i2, int i3) {
        System.out.println(" 4 sayinin toplami : " + (i+i1+i2+i3) );
    }

    private static void topla(int i, int i1, int i2) {
        System.out.println(" 3 sayinin toplami : " + (i+i1+i2) );
    }

    public static void topla(int sayi1,int sayi2){

    System.out.println(" 2 sayinin toplami : " + (sayi1+sayi2) );
}


}
