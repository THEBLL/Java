package day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {
    public static void main(String[] args) {


        int[] arrTek = {3,7,1,9,2,5};

        // Bu array'in tum elementlerini toplayin

        int toplam=0;

        for (int i = 0; i <arrTek.length ; i++) {

            // arrTek[i]  index degistikce bize array'deki tum elementleri sirasiyla getirir
            toplam+=arrTek[i];
        }
        System.out.println(""+toplam);

        int[][] sayilar = {{1,2,5},{7,4},{9},{3,0,1,6,8}};

       // arr[i] inner arrayleri getirir
        // arr[i][j]
        //yani kat sayisi kadar index'e yani forLoop'a ihtiyacimiz var

        toplam=0;

        for (int i = 0; i <sayilar.length ; i++) { // disardaki forLoop outer array'i kontrol eder

            for (int j = 0; j <sayilar[i].length ; j++) {  // icerdeki forLoop inner arrayleri kontrol eder

                // sayilar[i][j] sirasiyla her bir int elementi getirir
                toplam += sayilar[i][j];
            }
        }
        System.out.println("sayilar array'inin elementleri toplami : "+toplam);


    }

}
