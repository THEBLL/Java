package day07_IfStatements;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {

        /*
          bagimsiz if cumleleri
          isminden de anlasilacagi uzere
          kodun kalani ile ilgilenmez

          sadece boolean sarta odaklanir
          sartin sonucu true ise id body'si calisir
          boolean sartin sonucu false ise
          if body'si devreye girmez

          yani

          birden fazla bagimsiz if cumlesi olan bir kod calistiginda
          kac tane if body'sinin calisacagi verilen degerlere baglidir

          tum if bodyleri calisabilir
          bazilari calisabilir
          ya da hic bir body'si calismayabilir
         */

        int a = -201;
        int b = 34;

        if (a>0){
            System.out.println("a sayisi pozitif");
        }
        if (a+b>100){
            System.out.println("sayilarin toplami 100'den buyuk");
        }
        if (b % 3 == 0){
            System.out.println("b 3 ile tam bolunen bir tam sayidir");
        }
        if (b<100){
            System.out.println("b 100'den kucuk bir tamsayidir");
        }
    }
}
