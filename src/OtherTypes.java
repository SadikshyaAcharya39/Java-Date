import java.util.HashMap;

public class OtherTypes {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Sadikshya", 33);
        people.put("Anju", 32);
        people.put("Aashika", 31);
        people.put("Mocking", 30);
        people.put("Bird", 29);
        people.put("Baby", 28);
        people.remove("Sadikshya");
        System.out.println(people);

        for(String i: people.keySet()){
            System.out.println("Keys: " + i );
        }

        for(int i: people.values()){
            System.out.println(i);
        }

//        for(String i: people.keySet()){
//            System.out.println("   Keys:  " + i +        "     " + "Values:  " + people.get(i));
//        }


    }
}
