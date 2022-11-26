package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota{
   Corolla(int pc){
       super(5   );
       System.out.println("Parametreli Corolla Constructor");
   }
Corolla(){

}

    public static void main(String[] args) {
       Corolla corolla1=new Corolla();

//Parametresiz Araba Constructor
//Parametresiz Toyota Constructor

    }
}
