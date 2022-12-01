package ders44_Maps;

import java.util.*;

public class MapDepo {


    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {


        String ogrenciValue = ogrenciMap.get(ogrenciKey); // "Ayse-Cem-11-M-TM"

        String[] valueArr = ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim = valueArr[0] + " " + valueArr[1]; // Ayse Cem

        return isimSoyisim;
    }


    public static Map<Integer, String> ornekMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }


    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {


        // ogrenci key map'de var mi ? 104

        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen Key varsa, update edip yeni map'i dondurecegiz

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H , MF]
            // yeni sube degerini atayalim
            istenenKeyvalueArr[3] = yeniSube; // // [Ayse, Can, 10, K , MF]

            String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" +
                    istenenKeyvalueArr[1] + "-" +
                    istenenKeyvalueArr[2] + "-" +
                    istenenKeyvalueArr[3] + "-" +
                    istenenKeyvalueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu);
        }

        return ogrenciMap;
    }


    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {
    Collection <String> valueCollection = ogrenciMap.values();

        for (String eachValue:valueCollection
             ) {
            //value yi parcalarina ayir
            //sube ismini kontrol et, istenen sube isim soyisim sinif yazdir
            String []valueArr=eachValue.split("-");

            if (valueArr[3].equals(subeAdi)){
                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }
        }
    }

    public static List<String> numaraDeegerineGoreLIsteOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
    // hem key hem value lazim oldugundan ikisinide bu method da olusturalim
        // sonra o key üzerinden valuie yu map den aldik
        Set<Integer> ogrenciKeySet=ogrenciMap.keySet();

        //dondurecegimiz listeyi olusturalim

        List<String> isimListesi= new ArrayList<>();

        // keyleri tek tek elden gecirip
        //istenen aralikata olanlari bulalim
        String value;
        String[]valueArr;
        String istenenIsim;
        for (Integer eachKey: ogrenciKeySet
             ) {
            if (basNo<=eachKey&&eachKey<=bitNo){
                //buraya verilen sinir degerlerine uyan
                //eachKey ler gelecek
        //sinira uygun key in value sunu alalim
           value=ogrenciMap.get(eachKey);
           //value yu parcalara ayiralim
           valueArr=value.split("-");
            istenenIsim= valueArr[0] + " "+valueArr[1] + " "+valueArr[4];

            //istenen ismi olusturduk  , bunu listeeyey ekleyelim
                isimListesi.add(istenenIsim);
            }
        }
return isimListesi;

    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {
    Set<Integer> keySeti=ogrenciMap.keySet();
    String value;
    String [] valueArr;


        for (Integer eachKey:keySeti
             ) {
            value=ogrenciMap.get(eachKey);
            valueArr=value.split("-");

            System.out.println(eachKey + " "+valueArr[0] + " " + valueArr[1]);
        }
   }
}