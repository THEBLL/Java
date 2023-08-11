package day33_encapsulation_inheritance;

public class C01_pazarlama {


    /*
        satis degeri girecekler
        satis girebilsin ama baaskalarinin girdigi satislari goremesin

        toplam satis degerini gormesi gerekenler gorsun ama
        toplam satis degeri goren kisiler tarafindan degistirilemesin
         */
    private int toplamSatis;  // read only - sadece okunabilir
    private int satis;  // write only - sadece yazilabilir

    /*
     yetki ayirimi yapacagimiz classlarda
     istedigimiz islemi bizim adimiza yapacak
     public method'lar olusturacagiz

     getter methodlari baska classlar icin
     private variablelara ulasir
     ve degerini o classlara dondurur
     */
    public int getToplamSatis() {
        return toplamSatis;
    }
    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis += satis;
    }
}
