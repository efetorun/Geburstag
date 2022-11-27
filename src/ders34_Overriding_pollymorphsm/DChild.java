package ders34_Overriding_pollymorphsm;

public class DChild extends CParent {

   /*
   overriding kurallari

   1 access modifier method signature dahil olmadigindan
   ovewrriidden ve overridding access modifier farkli
   olabilir
   Child parent i sinirlandiramaz
   yani overridding method un access modifier i daha genis
   kapsamli olmalidir

CHILD CLASS daki ACCESS MODIFIER AYNI yada DAHA GENIS
KAPSAMLI OLMALIDIR
   private default protected public
    */
/*
2) private ve static methodlar override edilemez
 */


    public void method1(String torun){
        System.out.println("torun");
    }
public void method4(){

}
public Integer method5(){
        return 5;
}
}




