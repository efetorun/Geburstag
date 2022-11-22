package ders25_StaticKeyword;

public class AHemsireRunner {
    public static void main(String[] args) {

      AHemsire h1= new AHemsire();
        System.out.println(h1);
        h1.personelIsmi="Ayse";
        h1.personelAdresi="AUlus";
        h1.personelTelefonu="054523656895";
        System.out.println(h1);

        AHemsire h2=new AHemsire();
        h2.personelIsmi="efe";
        h2.personelAdresi="Bremen";
        h2.personelTelefonu="0176565432658";

        System.out.println("h1 : "+h1);
        AHemsire.BasHekimIsmi="efe torun";
        System.out.println("h2 : "+h2);
        System.out.println(AHemsire.BasHekimIsmi);

    AHemsire h3= new AHemsire();
        System.out.println(h3);
        h3.hastaneIsmi="Java Hastanesi ";

        System.out.println(h3);


    }
}
