package day44_maps;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class MethodDeposu {

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap=new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }
    public static void isimSoyIsimYazdir(Map<Integer,String> ogrenciMap){

        Collection<String> valueCollection = ogrenciMap.values(); // eger kaydetmek istiyorsak
        System.out.println("Sira No  Isim Soyisim");
        System.out.println("======================");
        int siraNo=1;


        for (String eachValue : valueCollection  // "Ali-Can-11-H-MF"
             ) {
            String[] valueArr = eachValue.split("-");  // [Ali, Can, 11, H, MF]
            System.out.println(siraNo+" - "+valueArr[0]+" "+valueArr[1]);
            siraNo++;
        }
    }
    public static void sinifSubedekiOgrenciListesiYazdir(Map<Integer,String> ogrenciMap,int sinif,String sube){

        //1-tum value'leri bir Collection olarak kaydedelim
       Collection<String> valueCollection = ogrenciMap.values();

        // 2-bir for-each loop ile herbir value'yu ele alalim
        System.out.println(sinif+".sinif "+sube+" subesindeki ogrenci listesi");
        System.out.println("========================");
        for (String eachValue : valueCollection
             ) {

            // 3-value'lar belirli bir ayrac ile birlestirilen Stringlerden olusturuldugu icin
            //    bu ayrac kullanilarak split() ile bir array'e donusturulebilir
            String[] valuArr = eachValue.split("-");   // [Ali, Can, 11, H, MF]

            // 4-artik bir bir array ve icerisinde value'yu olusturan bilgiler mevcut
            //     istenen bilgiyi, array'den index ile alabiliriz
            String sinifStr=sinif+"";
            if (valuArr[2].equals(sinifStr) && valuArr[3].equalsIgnoreCase(sube)){
                System.out.println(valuArr[0] + " " + valuArr[1]);
            }
        }
    }
    public static void isimSoyIsimIleOgrenciBul(Map<Integer,String> ogrenciMap, String isim, String soyIsim){

        Collection<String> valueCollection = ogrenciMap.values();

        for (String eachValu : valueCollection
             ) {

            String[] valueArr=eachValu.split("-");  // [Ali, Can, 11, H, MF]

            if (valueArr[0].equalsIgnoreCase(isim) && valueArr[1].equalsIgnoreCase(soyIsim)){
                // isim, soyisim, sinif ve subelerini yazdirin
                System.out.println(valueArr[0]+" "+ valueArr[1]+" "+valueArr[2]+" "+valueArr[3]);
            }
        }
    }
    public static void numaraIleOgrenciBilgisiYazdirma(Map<Integer,String> ogrenciMap,int ogrenciNo){

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // "Ali-Can-11-H-MF"

        // numarasi verilen ogrencinin isim, soyisim, sinif ve subesi yazdirin
        String[] istenenOgrenciArr=istenenOgrenciValue.split("-");  // [Ali, Can, 11, H, MF]

        System.out.println("Isim : "+istenenOgrenciArr[0]+", "+
                           "Soyisim : "+istenenOgrenciArr[1]+", "+
                           "Sinif : "+istenenOgrenciArr[2]+", "+
                           "Sube : "+istenenOgrenciArr[3]);

    }
    public static void numaraliOgrenciListesiYazdir(Map<Integer,String> ogrenciMap){

        // butun key'leri kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  // [101, 102, 103, 104, 105, 106]

        // for each ile tum key'leri elden gecirebilirim
        for (Integer eachKey : ogrenciKeySeti
             ) {
            // her bir key yaninda
            System.out.print(eachKey+" ");

            // ve o key'in isim ve soyismini yazdiralim
            String valueStr = ogrenciMap.get(eachKey);  // "Ali-Can-11-H-MF"
            String[] valueArr = valueStr.split("-");  // [Ali, Can, 11, H, MF]

            System.out.println(valueArr[0]+" "+valueArr[1]);

        }
    }

    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {

        // map'te bir value'yu update etmek istersek
        Set<Integer> ogrenciKeySeti=ogrenciMap.keySet();

        // for each loop ile her bir key'e ait value'yu cagirip, istedigimiz update'i yapalim
        for (Integer eachKey : ogrenciKeySeti
             ) {
            //        1- bilgiye ulasmak icin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
            //          - key ile value'yu cagiririz
            String eachValue=ogrenciMap.get(eachKey);  // "Ali-Can-11-H-MF"
            //          - value'yu array'e ceviririz
            String[] valueArr=eachValue.split("-");  // [Ali, Can, 11, H, MF]
            //          -array'de istedigimiz update'yapariz  // [Ali, Can, 11, H, MF]

            switch (valueArr[2]){
                case "9" :
                    valueArr[2]="10";
                    break;
                case "10" :
                    valueArr[2]="11";
                    break;
                case "11" :
                    valueArr[2]="12";
                    break;
                case "12" :
                valueArr[2]="Mezun";
                break;
            }  // [Ali, Can, 11, H, MF]



            //        2- bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle tekrar birlestiririz
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];
            // "Ali-Can-11-H-MF"

            //        3- key ve yeni value'yu kullanarak, map'i update ederiz
            ogrenciMap.put(eachKey,yeniValue);
        }
        return ogrenciMap;
    }

    public static Map<Integer, String> ogrenciBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {

        // update icin key ve value'nun ikisine de ihtiyacimiz var
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  // [101, 102, 103, 104, 105, 106]

        // her bir key'e ait value'yu cagirip, update edip, yeni haliyle map'e ekleyelim
        for (Integer eachKey : ogrenciKeySeti  // 101
             ) {
            String eachValue=ogrenciMap.get(eachKey);  // "Ali-Can-11-H-MF"

            String[] valueArr=eachValue.split("-"); // // [Ali, Can, 11, H, MF]

            // artik array'de update yapabiliriz

            if (valueArr[4].equalsIgnoreCase(eskiBolum)){
                valueArr[4] = yeniBolum;
            }
            // update edilen array'i map'e value olarak koymak icin birlestirelim
            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            // key var, value'nun update hali de var
            ogrenciMap.put(eachKey,yeniValue);
        }
        return ogrenciMap;
    }
}

           /*
           Elimizde map var

         {
         101=Ali-Can-11-H-MF,
         102=Veli-Cem-10-K-TM,
         103=Ali-Cem-11-K-TM,
         104=Ayse-Can-10-H-MF,
         105=Sevgi-Cem-11-M-TM,
         106=Sevgi-Can-10-K-MF
         }

         1- bizden istenen bilgiler key'de mi yoksa value'de mi
         [
         Ali-Can-11-H-MF,
         Veli-Cem-10-K-TM,
         Ali-Cem-11-K-TM,
         Ayse-Can-10-H-MF,
         Sevgi-Cem-11-M-TM,
         Sevgi-Can-10-K-MF
         ]

         2- value icerisindeki bilgilere rahat ulasabilmek icin
         for each loop ile her value'yu alip split'ile array'e cevirelim

         [Ali, Can, 11, H, MF]

         3- eger sinif ve sube parametre olarak verilen ile ayni ise
         isim ve soyismi yazdir


       */
