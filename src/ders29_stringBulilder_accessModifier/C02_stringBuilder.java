package ders29_stringBulilder_accessModifier;

public class C02_stringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1=new StringBuilder("Efe Candir");
        System.out.println(sb1);//Efe Candir
        System.out.println(sb1.reverse());//ridnaC efE
        StringBuilder sb2=new StringBuilder("Efe CAndir.");
        String str="Efe Candir.";
       // System.out.println(sb2==str);iki farkli data türü karsilastirilamaz
        System.out.println(str.equals(sb2));//herzaman false verir farkli iki data Türü
        System.out.println(sb1.compareTo(sb2));//45 tamaen ayniysa 0 döner degilse sayi döner


    }


}
