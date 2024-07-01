import  java.util.ArrayList;
import java.util.Collections;

public class ListSorting {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();


         names.add("Sadikshya");
         names.add("Amir");
         names.add("Anju");
         names.add("Mukesh");
         Collections.sort(names);

         for(String i: names){
             System.out.println(i);
         }
//         Collections.sort(names, Collections.reverseOrder());
//        System.out.println(names);
//       Collections.sort(names);

//       System.out.println(names);
//
//        for(String i: names){
//            System.out.println(i);
//        }

//        Collections.sort(names, Collections.reverseOrder());
//        System.out.println(names);




    }
}
