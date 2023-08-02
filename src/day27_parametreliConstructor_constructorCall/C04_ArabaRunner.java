package day27_parametreliConstructor_constructorCall;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();
        System.out.println(araba1);
        // C08_Car{marka='Marka belirtilmemis', model=' Model belirtilmemis', yil=1900, fiyat=0, renk='Renk belirtilmemis'}

        araba1.marka = "Mercedes";
        araba1.model = "E200";
        araba1.yil = 2010;
        araba1.fiyat = 15000;
        araba1.renk = "siyah";
        System.out.println(araba1);





        // her yeni obje olusturdugumuzda parametresiz default cons. calistigindan
        // o class'da instance variable'lara atanan degerlerini alir
        // sonra bizim her variable icin yeniden atama yapmamiz gerekir

        // bunun yerine constructor call'a parametre olarak degerler yazalim


        C03_Araba araba2 = new C03_Araba("BMW","5.20",2017,33000,"Mavi");

        System.out.println(araba2);


        C03_Araba araba3 = new C03_Araba("Volvo","C40",2005,5000,"yesil");
        System.out.println(araba3);
    }
}
