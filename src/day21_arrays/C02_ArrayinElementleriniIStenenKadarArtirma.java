package day21_arrays;

import java.util.Arrays;

public class C02_ArrayinElementleriniIStenenKadarArtirma {
    public static void main(String[] args) {

        // verilen array'in tum elementlerini
        // artis miktari kadar artirin

        int[] arr={3,5,2};
        int artis=4;

        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=artis;
        }

        System.out.println(Arrays.toString(arr));

        int[] sayilar={5,8,2};
        System.out.println(Arrays.toString(elementleriArtir(sayilar,5)));

    }
    public static int[] elementleriArtir(int[] arr,int artis){

        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=artis;
        }

        return arr;
    }
}
