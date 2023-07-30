package day13_stringManipulations_forLoops;

public class C05_forLoop {
    public static void main(String[] args) {

        // kullanicinin verdigi input degerinden baslayip
        // ardisik 10 tam sayi yazdirin

        int input = 20;

        for (int i = input; i <input+10 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");
        // kullanicinin verdigi sayidan baslayin
        // 100'e kadar(100 dahil) 5'er 5'er artirarak yazdirin

        for (int i = input; i <=100 ; i+=5) {
            System.out.print(i + " ");
        }

        System.out.println("");
        // 100'den baslayip 1'e kadar geri geri gidin
        // 7'nin kati olan sayilari yazdirin

        for (int i = 110; i >=1 ; i--) {

            if (i%7==0){
                System.out.print(i + " ");
            }
        }
    }
}
