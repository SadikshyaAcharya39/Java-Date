import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Sadikshya");
        names.add("Saddy");
        names.add("Kashish");
        names.add("Amit");
        names.add("Amir");
//        System.out.println(names);

//        for(String i: names){
//            System.out.println(i);
//        }

        System.out.println(names.contains("Anju"));
        System.out.println(names.contains("Saddy"));
        names.remove("Amir");
        System.out.println(names);
        names.clear();
        System.out.println(names);

    }
}
