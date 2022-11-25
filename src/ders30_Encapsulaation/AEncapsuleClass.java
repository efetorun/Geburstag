package ders30_Encapsulaation;

public class AEncapsuleClass {
private String hastaneIsmi="Yildiz Hastanesi";
//hastane ismi görülebilsin ama degistirilemesin
private int hastaUcreti;
//hasta ucretleri de giris yapilabilsuin
    //ucreti sigortadan alinacagi icin
    //personel hasta ucretlerini görmesin

   private String hemsireIsmi;
    private             String hemsireAdresi;
    //Bu instance Variable lere herkes ulasabilsin
    //Bu durumda public yapmak ilk cvozum olabilir

    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }
}
