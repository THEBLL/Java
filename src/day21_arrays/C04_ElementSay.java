package day21_arrays;

public class C04_ElementSay {
    public static void main(String[] args) {

        // verilen bir array'de istenn bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olustusturun

        int[] arr = {3,2,3,5,6,7,1,8};
        int arananSayi=5;

        elemanSay(arr,arananSayi);

    }
    public static void elemanSay(int[] arr, int arananSayi){

        int count=0;

        for (int i = 0; i <arr.length; i++) {

            if (arr[i]==arananSayi){
                count++;
            }
        }
        if (count == 0){
            System.out.println("aranan sayi array'de yok");
        }else {
            System.out.println("aranan sayi "+arananSayi+" sayisi array'de "+
                               count+" kere kullanilmis");
        }
    }
}
