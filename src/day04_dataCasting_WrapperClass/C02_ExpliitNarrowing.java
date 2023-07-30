package day04_dataCasting_WrapperClass;

public class C02_ExpliitNarrowing {
    public static void main(String[] args) {

        double dbl1=123.6;

        int sayi1=(int)dbl1;

        System.out.println("sayi1 : "+sayi1); // 123

        byte by1=(byte) sayi1;

        System.out.println("by1 : "+by1); // 123

        int sayi2=130;
        byte by2=(byte) sayi2;
        System.out.println("by2 : "+by2); // -126

    }
}
