package day26_forEachLoop_constructor;

public class tekrar {
    String marka = "Marka belirtilmemis";
    String model = " Model belirtilmemis";
    int yil = 1900;
    int fiyat;
    String renk = "Renk belirtilmemis";

    public tekrar() {
    }

    @Override
    public String toString() {
        return "tekrar{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }

    public tekrar(String marka, String model, int yil, int fiyat, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.renk = renk;
    }
}
