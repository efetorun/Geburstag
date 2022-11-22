package ders25_StaticKeyword;

public class AHemsire {

    static  String hastaneIsmi="Yildiz Hastanesi";
    static  String hastaneAdresi="Cankaya/Ankra";
    static  String BasHekimIsmi="Dr Mehmet Yilmaz";

    String personelIsmi="Isim Belitilmedi";
    String personelAdresi="Adres Belitilmedi";
    String personelTelefonu="Telefon Belitilmedi";

    public static void main(String[] args) {





    }


    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefonu='" + personelTelefonu + '\'' +
                '}'+
                "Hastane Ismi = "+ hastaneIsmi+
                "Hastane Adresi = "+hastaneAdresi+
                "Bashekim Ismi = "+ BasHekimIsmi;
    }
}
