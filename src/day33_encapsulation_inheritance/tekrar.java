package day33_encapsulation_inheritance;

public class tekrar {
    private int toplamSatis;  // read only - sadece okunabilir
    private int satis=0;

    public int getToplamSatis() {

        return toplamSatis;


    }

    public void setSatis(int satis) {

        this.satis = satis;
        toplamSatis+=satis;
    }
    public int getSatis(){

        return satis;
    }
}
