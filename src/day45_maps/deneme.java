package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

import static day44_maps.MethodDeposu.yilSonuSinifArtir;

public class deneme {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MethodDeposu.ogrenciMapOlustur();

        // ogrenci map'inde yil sonu duzenlemesi yapalim
        // 9,10,11 sinifindaki ogrencilerin siniflarini 1 artirin
        // 12.sinifidaki ogrenciler icin sinif bilgisi olarak mezun yazin


    }
    public static Map<Integer,String> sinifArtir(Map<Integer,String> ogrenciMap){

        // map'te bir value'yu update etmek istersek
        Set<Integer> ogrenciKeySet=ogrenciMap.keySet();

        for (Integer each : ogrenciKeySet
        ) {
            String eachValue = ogrenciMap.get(each);
            String[] valueArr = eachValue.split("-");
            switch (valueArr[2]) {
                case "9":
                    valueArr[2] = "10";
                    break;
                case "10":
                    valueArr[2] = "11";
                    break;
                case "11":
                    valueArr[2] = "12";
                    break;
                case "12":
                    valueArr[2] = "Mezun";
                    break;
            }
            String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4];
            ogrenciMap.put(each, yeniValue);
        }
        return ogrenciMap;
    }
}
