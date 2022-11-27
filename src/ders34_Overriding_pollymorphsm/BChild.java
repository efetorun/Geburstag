package ders34_Overriding_pollymorphsm;

public class BChild extends AParent {
    public void method1(){
        System.out.println("child class method1");
    }

    public void method2(int a){
        System.out.println("child class method2");
//overriding olabilmesi icin hem method ismi hemde signatüre(par.sayisi
// ve parametre türleri)
    }

    @Override
    public void method3() {
        //super.method3(); overriding varsa parentve child classtaki
        //overriden ve overriding methodlardan sadece
        //biri calisir eger ikisini birden calistirmak istersek
        //super.method kullanilir

        /*
        overriding method @Override notasyonu ile isaretlenebilir
         */
    }

    public void method2(String isim){

    System.out.println("child class method2");
}
/*
Oerriding metho @Oveerride noasyonu ile isaretlenebilir isaretlenmisse
parent ten overridden edilen method silinirse yada signature
degistirilirse java cte verir
eger isaretlenmemisse parent ten silsek bile java cte vermez yani
hicbir sorun olmaz
 */


}
