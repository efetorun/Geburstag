package ders32_inheritanceConstructorCall;

public class GAvciKuslar extends FKuslar{
    public static void main(String[] args) {

        GAvciKuslar avci1=new GAvciKuslar();

        FKuslar avci2=new GAvciKuslar();

        EHayvanlar avci3=new GAvciKuslar();

        /*
        Bir child class da obje olusturmak
        icin child class cons kullanilir

        ama data türünü eger o objenin bagli
        oldugu class lardan secebiliriz


         Eger constructor ve data türü farkli secilirse
         bu durumda uyesi olan
         variable ve methodlar farkli davranis gosterirler


         */
    }
}
