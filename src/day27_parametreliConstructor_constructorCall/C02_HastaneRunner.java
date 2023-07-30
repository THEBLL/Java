package day27_parametreliConstructor_constructorCall;

import java.util.concurrent.Callable;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane personel1 = new C01_Hastane();

        System.out.println(personel1.personelIsmi); // Isim atanmadi
        System.out.println(personel1.personelTelefonu);  // telefonAtanmadi
        System.out.println(personel1.hastaneAdi);  // Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu);  // 03432432

        personel1.personelTelefonu = "55555";
        personel1.personelIsmi = "Mertkan";


        C01_Hastane personel2 = new C01_Hastane();
        System.out.println(personel2.personelIsmi); // Isim atanmadi
        System.out.println(personel2 .personelTelefonu);  // telefonAtanmadi


    }
}
