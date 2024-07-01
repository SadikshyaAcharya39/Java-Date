import java.util.ArrayList;
import java.util.Iterator;


public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amir");
        names.add("Mira");
        names.add("Bad Guy");
        names.add("Olivia");
        names.remove("Mira");


        Iterator<String> it = names.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Removing Items from a Collection



    }
}
