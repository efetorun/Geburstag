package ders33_inheritanceDataTuruKullanimi_Overriding;

public class FAvciKuslar extends  EKuslar{

    public void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avci kuslar et yerler");
    }
    public void pence(){
        System.out.println("Avci kuslar pencelidir");
    }
    public void gaga(){
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {
        /*
        Constructor ve data türü aynuiysa ilk class daki methodlara
        bakilir yoksa parentlere gidilir ilk buldugumuzu aliriz
         */

        FAvciKuslar avci1=new FAvciKuslar();
        avci1.beslenme();
         avci1.gaga();
         avci1.pence();
         avci1.cogalma();
         avci1.omur();
         avci1.solunum();
         avci1.kanat();

        EKuslar avci2=new FAvciKuslar();
        avci2.beslenme();
        avci2.gaga();
       // avci2.pence();
        avci2.cogalma();
        avci2.omur();
        avci2.solunum();
        avci2.kanat();



        EKuslar kus1=new EKuslar();
        kus1.cogalma();
        kus1.gaga();
        kus1.hareket();
        kus1.kanat();
        kus1.beslenme();
        kus1.omur();
        kus1.solunum();

    }




}
