package ders29_stringBulilder_accessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4));// ne kadar guzel

        System.out.println(sb);//Java ne kadar guzel

        //sb=sb.substring(0,4); esitligin solu String Builder sagi ise String
        //                      java non primitive datalarda casting yapmaz

        //Ayni not Integer,Byte ve short gibi sayi barindiran non primitive ler icin de gecewrlidir

        //sb güzel kelimesi iceriyor mu?
        /*
        String builder ddde olmayan, String klasinda bulkunana metotlari kullanmak isterseniz
        once toString() ile String e cevirip, sonra String manipulation yapilabilir.

         */
        System.out.println(sb.toString().contains("guzel"));//true
        System.out.println(sb.indexOf("e"));
        sb.setCharAt(5,'N');
        System.out.println(sb);//Java Ne kadar guzel  N büyüdü

    }
}
