package day35_inheritance;

public class EMuhasebe extends DHastane{

    EMuhasebe(){
        System.out.println("parametresiz Muhasebe constructor'i calisti");

    }
    EMuhasebe(String str){
        System.out.println("parametreli Muhasebe constructor'i calisti");

    }
    EMuhasebe(int a){
        this("Yusuf");
        System.out.println("int parametreli Muhasebe constructor'i calisti");

    }
}
