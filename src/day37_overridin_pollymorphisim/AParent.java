package day37_overridin_pollymorphisim;

public class AParent {

    public final void finalMethod(){
        System.out.println("Bu bir final method");
    }

    public static void staticMethod(){ // static methodlar cagrilamaz
        System.out.println("Bu bir static method");
    }

    private void privateMethod(){
        System.out.println("Bu bir private method");
    }

    protected  void  protectedMethod(){
        System.out.println("aaaaaaaaaaaaaaaa");
    }
}

