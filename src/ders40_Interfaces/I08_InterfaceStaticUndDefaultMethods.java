package ders40_Interfaces;

public interface I08_InterfaceStaticUndDefaultMethods {

void method();
void method2();
void method31();
 public default void method3(){
     System.out.println("Interface icicndeki Body li method");
 } //boddy si var
   // biz bir interface deki bir method deklarasyonuna default yazarsak
   // bu access modofier degildir
 /*
 Interface icerisinde body si olan method olusturmak icin kullnilan default
 ve static keyword lari arasinda bir fark vardir

 default kullanilan methodlar ob je olusturularqak cagrilabilirken
 static olarak isretlenen methodlar direk kullnilabilir



  */

}
