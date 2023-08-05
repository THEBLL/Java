package day28_constructorCall;

import day27_parametreliConstructor_constructorCall.C05_Araba;

public class C01_ConstructorCall {

    /*
      java'da bir contructor'in icinde baska bir contructor' cagirmamiz gerekebilir
      bu durumda
      C01_ConstructorCall(4); yazarsak,
      Java bunu cons. call olarak degil, method call olarak kabul eder

      eger bir constructor'in incinden baska bir cons cagirmamiz gerekirse
      ClassIsmi(ilgiliArgumentler) yerine this(ilgiliArgumentler) kullanilir ve ilk satira yazmamiz gerekiyor
      ve baska bir cons cagiramayiz

     */
    C01_ConstructorCall(){
        System.out.println("parametresiz constructor calisti");
    }
    C01_ConstructorCall(String str){
        this(11);  // constructor call  ve ilk satira yazmamiz gerekiyor ve baska bir cons cagiramayiz
        C01_ConstructorCall(4);  // method call
        System.out.println("String parametreli constructor calisti");
    }
    C01_ConstructorCall(int a){
        System.out.println("int parametreli constructor calisti");
    }
   static void C01_ConstructorCall(int sayi){
        System.out.println("int parametresi olan method calisti");
    }

    public static void main(String[] args) {
      //  C01_ConstructorCall obj1 = new C01_ConstructorCall("Merhaba televole");

       new C01_ConstructorCall(4); // constructor calisir
        // C01_ConstructorCall(4);  // method calisir


    }
}
