package day32_stringBuilder_accessModifier;

public class C05 {

    private int privateSayi;
    int defaultSayi;
    protected int protectedSayi;
    public int publicSayi;

    public static void main(String[] args) {
        C05 obj= new C05();
        obj.privateSayi=20;
        System.out.println(obj.privateSayi);
    }
}
