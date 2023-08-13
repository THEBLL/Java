package day35_inheritance;

public class FDoktor extends EMuhasebe{

    FDoktor(){
        super(3);
        System.out.println("parametresiz Doktor constructor'i calisti");
    }
    FDoktor(String str){
        System.out.println("String parametreli Doktor constructor'i calisti");
    }
    FDoktor(int sayi){
        this();
        System .out.println("int parametreli Doktor constructor'i calisti");
    }

    public static void main(String[] args) {

       // FDoktor doktor1 = new FDoktor("Java");

       // FDoktor doktor2=new FDoktor();

        FDoktor doktor3=new FDoktor(5);
    }
}
