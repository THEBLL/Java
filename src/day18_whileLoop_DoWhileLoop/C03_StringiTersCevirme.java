package day18_whileLoop_DoWhileLoop;

public class C03_StringiTersCevirme {
    public static void main(String[] args) {

        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //        bu halini bize donduren bir method olusturun.

        System.out.println(metniTersCevirme("bu is bu kadar"));

        System.out.println(metniTersCevirme("ey edip adanada pide ye"));
    }
    public static String metniTersCevirme(String metin){

        String tersMetin="";

        int index = metin.length()-1;

        while (index>=0){

           tersMetin += metin.charAt(index);
           index--;
        }
        return tersMetin;
    }
}
