import  java.util.ArrayList;
import java.util.function.Consumer;

public class JavaLamba {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };


        nums.forEach(method);
//        nums.forEach((n) -> {
//            System.out.println(n);
//        });

    }
}
