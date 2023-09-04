package day46_nestedMaps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C01_Compute {
    public static void main(String[] args) {

        /*
        soru : verilen array'de kullanilan harfleri
               ve kacar defa kullanildigini yazdirin

               Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
               output : { a kullanimi : 4 adet
                          b kullanimi : 2 adet



                          z kullanimi : 1 adet
         */

        String[] arr = {"a", "b", "s", "a", "s", "c", "d", "b", "c", "a", "a", "s", "z", "k"};

        Map<String, Integer> harfMapi = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

        harfMapi.computeIfPresent(arr[i],(k,v) -> v+1);
        harfMapi.computeIfAbsent(arr[i],v->1);
        }
        System.out.println(harfMapi);  // {a=4, b=2, c=2, d=1, k=1, s=3, z=1}


    }
}
