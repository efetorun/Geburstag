package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        //Java ile bilgisayarim,izdaki bir dosayya ulasmak istersek
        //FileInputStream class indan bir obje olusturup
        //o obje araciligiyla dosyayi kullanabiliriz

        //fis olustururken ulasmak istedigimiz diosyanin
        //doszya yolunu paramewtre olarak girm,eliyiz

        // checked exception olusturma ihtimali olan kodlari yazdigimizda
        //java compile time da hata ihtimalini görür ve altini kirmizi cizer
        /*kirmizi cizgiyi kaldirmak icin 2 yontem vardir

                1 exception u try catch ile handle etmek
                2 javaya sorun ihtimalinin farkinda oldugumuizu ama calismaya devam etmesinin söylüyourzu
                bunun icin method signature una throws keyword ve beklenen exception türü yazilabilir
*/
        FileOutputStream fos=new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");




    }



}
