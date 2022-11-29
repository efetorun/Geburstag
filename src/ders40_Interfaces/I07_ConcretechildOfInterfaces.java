package ders40_Interfaces;

public class I07_ConcretechildOfInterfaces implements I05_Interface,I06_Interface {
/*
bie class sadece bir class a extends edilebilir ancak birden fazkla
interface e implements edilebilir

2)Concret classs implements ettigi
tüm interface lerdeki abstract methodlari
override etmek zorunda oldugundan iki interface
deki tum methodlari override etmek gerekir
-iki interface de ayni isimde ve ayni return type a sahip method
lardan hangisini override ettigi onemli
degildir

ANcak isimler ayni return type lar farkli oldugunda iki interface i birden
implement etmek mümükün
olmayacakirt
ya child class dan bu iki
Interface i implements etmekten vazgecmelisiniz
yada bir cözüm bulmalisiniz
isim degistirebiliriz
 */

    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }


    public static void main(String[] args) {

        System.out.println(MESAJ);
        System.out.println(I05_Interface.SAYI);//Ayni isimli variable iki intface dede varsa basina interface ismi yazarsin
        System.out.println(SAYI2);//Bir tane varsa Interface adini belirtmeye gerek yoktur


    }

}
