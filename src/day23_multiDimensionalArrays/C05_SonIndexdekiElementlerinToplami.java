package day23_multiDimensionalArrays;

public class C05_SonIndexdekiElementlerinToplami {
    public static void main(String[] args) {

        // Soru 5- Verilen 2 katli bir array’de
        //         her bir inner array’in son elementlerinin
        //         toplaminini yazdiran bir method olusturun.

        int[][] sayilar = {{3,4,5},{1,4},{5,2,7},{1,9,0,3}};

        int toplam=0;
        int sonElement=0;

        for (int i = 0; i < sayilar.length; i++) {  // outer array


            toplam += sayilar[i][sayilar[i].length-1];
        }
        System.out.println("inner arraylerdeki son elementlerin toplami : " +toplam);
    }
}
