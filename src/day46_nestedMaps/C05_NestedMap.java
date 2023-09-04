package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C05_NestedMap {
    public static void main(String[] args) {

        /*
        "firstname" : "Ahmet",
        "lastname" : "Bulut",
        "totalprice" : 500,
        "depozitpaid" : false,
        "bookingdates" : {
                    "checkin" : "2023-07-21",
                    "checkout" : "2023-08-10"
                    },
                    "additionalneeds" : "wi-fi" }
         */

        Map<String, Object> bookingMap=new HashMap<>();

        Map<String,String> bookingDatesMap=new HashMap<>();
        bookingDatesMap.put("checkin","2023-07-21");
        bookingDatesMap.put("checkout","2023-08-10");


        bookingMap.put("firstname","Ahmet");
        bookingMap.put("lastname","Bulut");
        bookingMap.put("totalprice",500);
        bookingMap.put("depositpaid",false);
        bookingMap.put("booikingdates",bookingDatesMap); // bu key'in degeri yukarda olusturdugumuz map'tir
        bookingMap.put("additionalneeds","wi-fi");

        System.out.println(bookingMap);
        /*
        {
        additionalneeds=wi-fi,
        firstname=Ahmet,
        totalprice=500, d
        depositpaid=false,
        booikingdates=
                      {  checkin=2023-07-21,
                       checkout=2023-08-10  },
        lastname=Bulut
        }

        sirali vermek zorunda degil
         */

        // rezervasyondaki ismi yazdirin
        System.out.println(bookingMap.get("firstname"));  // Ahmet

        // depozit bilgisini yazdirin
        System.out.println(bookingMap.get("depositpaid"));  // false

        // checkin tarihini yazdirin
        System.out.println(((Map)bookingMap.get("booikingdates")).get("checkin"));  // 2023-07-21

        // checkout tarihini yazdirin
        System.out.println(((Map) bookingMap.get("booikingdates")).get("checkout"));  // 2023-08-10

    }
}
