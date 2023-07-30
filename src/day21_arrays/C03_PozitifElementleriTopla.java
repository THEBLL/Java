package day21_arrays;

import java.util.Arrays;

public class C03_PozitifElementleriTopla {
    public static void main(String[] args) {

        // verilen bir array'deki
        // pozitif tamsayilari toplayip sonucu bize donduren bir method yazdirin

        int[] arr={-4,5,2,0,3}; // beklenen output : 3 pozitif elementin toplami 10


        System.out.println(pozitifElementleriTopla(arr));

    }
    public static int pozitifElementleriTopla(int[] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] > 0){
                toplam += arr[i];
            }
        }
        return toplam;
    }
}
