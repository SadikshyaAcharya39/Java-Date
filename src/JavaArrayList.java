import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {


//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Ford");
//        cars.add("BMW");
//        cars.add("Ferarri");
//        cars.add("Toyota");
////        cars.remove(0);
////        cars.remove("BMW");
////        cars.add(0, "Tesla");
////        System.out.println(cars.get(0));
//////        cars.get(0);
////
////        // To chnage an item
////        System.out.println(cars.set(0, "boo"));
////        System.out.println(cars);
////        cars.clear();
////        System.out.println(cars);
////        System.out.println(cars.size());
//
//
////        for(int i = 0; i < cars.size(); i++){
////            System.out.println(cars.get(i));
////        }
//
//        for(String i: cars){
//            System.out.println(i);
//        }


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
//      System.out.println(nums);
//        nums.remove(0);
//
//        for(int i = 0; i < nums.size(); i++){
//            System.out.println(nums.get(i));
//        }

        for(int i: nums){
            System.out.println(i);
        }

    }
}