package day26_forEachLoop_constructor;

public class C06 {

    C06(){
        // bu constructor default constructor'in ozelliklerine sahiptir
        // ama bu constructor gorunur oldugundan buna default constructor diyemeyiz
        // bu constructor ekledigimiz icin default constructor silinir
    }

    void C06(){
        // constructor degildir
        // ama return type'i oldugundan methoddur
    }

  //   c06(){
        //Invalid method declaration; return type required
        // class adi ile ayni olmadigindan constructor olamaz
        // return type'i olmadigi icin method'da olamaz
        // bunun icin java altini kirmizi cizer



    /*
      constructor bazi kaynaklarda ozel bir method diye gecer
      ama cogunlugun kabuluyle
      constructor baska yapilardan farkli kendisine ozgu bir yapidir

      constructor, constructor'dir


     bir kod blogunun constructor olabilmesi icin
     2 sarti gerceklestirmesi gerekir
     1- ismi class ismi ile ayni olmalidir
     2- return type olmaz
     */

}

