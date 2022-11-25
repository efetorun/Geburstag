package ders30_Encapsulaation;

public class C01_Encapsulation {
    public static void main(String[] args) {

        AEncapsuleClass pers1=new AEncapsuleClass();
//pers1.hastaneIsmi= private görülemez
     //   per1.hastaUcreti= private görülemez
//pers1.hemsireAdresi="Ankara";
//pers1.hemsireIsmi="Fatma";

        System.out.println(pers1.getHastaneIsmi());
        pers1.setHastaUcreti(200);

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        pers1.setHemsireIsmi("Ali");
        System.out.println(pers1.getHemsireIsmi());

        pers1.setHemsireAdresi("Bremen");
        System.out.println(pers1.getHemsireAdresi());
    }
}
