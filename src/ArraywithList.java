
import java.util.ArrayList;

import java.util.Collections;

public class ArraywithList {

    public static void main(String[] args) {

//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Sadikshya");
//        cars.add("Toyota");
//        cars.add("BMW");


        // Removing an item
//        cars.remove(0);

        // Accessing an item

//        System.out.println(cars.get(0));

        // Clearing an items

//        cars.clear();


//        System.out.println(cars);

//      Adding an Item
//        cars.add(0, "Ford");
////        System.out.println(cars);
//
//        // Change an item
//        cars.set(0, "Ferrari");
//        System.out.println(cars);
//
//        // ArrayList Size
//
//        System.out.println(cars.size());

        // Loop Through An ArrayList

//        for (int i = 0; i < cars.size(); i++) {
//
//            System.out.println(cars.get(i));
//        }

//        for(String i: cars){
//            System.out.print(i + " ");
//        }


        // Other Types
        // We have to use Wrapper Class example

    //    ArrayList<Integer> number =new ArrayList<>();



        // Sort An Array List
/*
    Another useful class in the java.util package
    is the Collections class,
    which include the sort() method
    for sorting lists alphabetically or numerically:
 */

//        ArrayList<String> names = new ArrayList<>();
//        names.add("Amir");
//        names.add("Anju");
//        names.add("Anushka");
//        names.add("Sadikshya");
//        names.add("Narayani");
//        names.add("Shubham");
//        Collections.sort(names);  // Sort names
//        for(String i: names){
//            System.out.println(i);
//        }


        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        Collections.sort(myNumbers);  // Sorting Numbers

        for(int i: myNumbers){
            System.out.println(i);
        }



    }

}
