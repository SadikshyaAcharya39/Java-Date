import java.util.Collections;
import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Sadikshya");
        names.add("Amshu");
        names.add("Pragya");
        names.add("Mira");
        names.add("Pankaj");
        names.add("Amit");
        names.add("Pramod");
        names.add("Pankey");
        names.set(0, "Saddy");
        System.out.println(names);
//        names.removeFirst();
//        names.removeLast();
        Collections.sort(names);
//        System.out.println(names);

        names.addFirst("Sani");
        names.addLast("Punchhu");
//        System.out.println(names);

//        System.out.println(names.removeFirst());
////      System.out.println(names);
//        System.out.println(names.removeLast());
//        System.out.println(names);

        System.out.println(names.getFirst());
        System.out.println(names.getLast());


    }
}
