package day45_maps;

import java.util.HashMap;
import java.util.Map;

public class C07_MapMethodlari {
    public static void main(String[] args) {

        Map<String,Integer> harfler=new HashMap<>();

        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);

        System.out.println(harfler);  // {A=15, T=5, Z=50, K=25, L=10}

        harfler.put("L",40);          // {A=15, T=5, Z=50, K=25, L=10}
        System.out.println(harfler);  // {A=15, T=5, Z=50, K=25, L=40}

        System.out.println(harfler.containsKey("Z"));  // true
        System.out.println(harfler.containsValue(5));  // true
        // eger value birlestirilmis bir String ise "Ali-Can-11-H-MF
        // harfler.containsKey("Ali") false doner
        // value'yu bir butun olarak arar, value'nun bir parcasini kontrol etmez

        System.out.println(harfler.getOrDefault("G", 0));  // 0
        System.out.println(harfler.getOrDefault("T", 0));  // 5

        System.out.println(harfler.get("G"));  // null

        System.out.println(harfler.replace("F", 90));  // null
        System.out.println(harfler);

        System.out.println(harfler.replace("T", 90));  //  5 ( T'nin eski halini getiriyor)
        System.out.println(harfler);  // {A=15, T=90, Z=50, K=25, L=40}  ve burda degistiriyor

        System.out.println(harfler.replace("A", 20, 30));  // A'nin degeri 20 ise 30 yap  false
        System.out.println(harfler);

        System.out.println(harfler.replace("K", 25, 30));  // K'nin degeri 25 ise 30 yap  true
        System.out.println(harfler);   // {A=15, T=90, Z=50, K=30, L=40}

        System.out.println(harfler.replace("X", 25, 30));  // false
        System.out.println(harfler);

        System.out.println(harfler.remove("Z")); // Z'yi kaldirir
        System.out.println(harfler);  // {A=15, T=90, K=30, L=40}

        System.out.println(harfler.remove("Y")); // null
        System.out.println(harfler);

        System.out.println(harfler.remove("T",70));  // false
        System.out.println(harfler);  // {A=15, T=90, K=30, L=40}

        System.out.println(harfler.remove("T",90));  // true
        System.out.println(harfler);  // {A=15, K=30, L=40}


    }
}
