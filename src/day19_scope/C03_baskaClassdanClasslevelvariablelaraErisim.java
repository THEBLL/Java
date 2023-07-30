package day19_scope;

public class C03_baskaClassdanClasslevelvariablelaraErisim {

    public static void main(String[] args) {

        // classIsmi.staticVariableIsmi  static olanlar
        System.out.println(C02_ClassLevelVariablela.bls);  // false
        System.out.println(C02_ClassLevelVariablela.strs);  // Java
        System.out.println(C02_ClassLevelVariablela.sayis);  // 0
        System.out.println(C02_ClassLevelVariablela.chrs);  // a


        // instance olanlar
        C02_ClassLevelVariablela obj=new C02_ClassLevelVariablela();
        System.out.println(obj.sayii);  // false
        System.out.println(obj.stri);  // null
        System.out.println(obj.sayii); // 23
        System.out.println(obj.chri); // ''




       // eger static bir variable'a obje uzerinden ulasmak isterseniz
       // Java otomatik olarak getirmez
       // ama elle yazarsaniz kabullenir

       // intellij static variable'a insatance gibi obje uzerinden ulasirsaniz
       // kodu sariya boyayarak sizi uyarir
        System.out.println(obj.bls);
        System.out.println(obj.strs);
    }
}
