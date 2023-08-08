package day26_forEachLoop_constructor;

public class aaaaaaaaaa {

    public static void main(String[] args) {

        tekrar car1=new tekrar("bmw","320",2020,500000,"kirmizi");
        System.out.println(car1);

        tekrar car320=new tekrar();
        car320.marka="Mercedes";
        car320.model="C200";
        car320.yil=2018;
        car320.fiyat=400000;
        car320.renk="siyah";
        System.out.println(car320);
    }
}
