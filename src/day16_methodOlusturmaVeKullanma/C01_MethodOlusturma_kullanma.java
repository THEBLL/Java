package day16_methodOlusturmaVeKullanma;

public class C01_MethodOlusturma_kullanma {
    //Soru 1- Kullanicidan input olarak verilen bir String,
    //        baslangic ve bitis indexlerine gore
    //        baslangic index'i dahil, bitis index'i haric olacak sekilde
    //        aradaki harfleri yazdiran bir method olusturun.
    //
    //          - kullanici baslangic degeri olarak,
    //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
    //          hata mesaji yazdirin.

    public static void main(String[] args) {



        altString("Java guzeldir",3,7);
        altString("Biraz sabir lutfen",5,4);
        altString("Bu da mi gol degil",11,33);

        String str="Aramiz bozulmasin";
        altString(str,5,10);  // z boz


    } // main method sonu

    public static void altString(String metin, int basIndex, int bitisIndex){

        if (basIndex>bitisIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (basIndex>=metin.length() || bitisIndex>=metin.length()) {
            System.out.println("verilen index sinirlarin disinda");
        }else{

            for (int i = basIndex; i <bitisIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }



} // class'in sonu
