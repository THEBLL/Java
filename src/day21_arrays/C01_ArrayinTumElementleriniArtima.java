package day21_arrays;

import java.util.Arrays;

public class C01_ArrayinTumElementleriniArtima {
    public static void main(String[] args) {

        // verilen bir int array'in tum elemanlarini
        // 2 artirip bize donduren bir method olusturun
        // eski array'in yeni haliyle kaydedin

        int[] arr= {3,4,6,8,1};

        arr = arrayElementlerini2Artir(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayElementlerini2Artir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            // arr[i] = arr[i]+2;
            arr[i]+=2;
        }
        return arr;
    }
}
