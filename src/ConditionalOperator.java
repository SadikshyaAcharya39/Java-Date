public class ConditionalOperator {
    public static void main(String[] args) {
        // var = exp ? result1: result2;

        // Example1
//
//        int a = 100, b = 200;
//        // I want to print the largest value acc to condition
//
//        int x = (a > b)? a: b;
//        System.out.println(x);


//        Example 2:


        // Expression is 100
//        int x = ( 1==1)? 100:200;
//        System.out.println(x);


        // Expression is false so it will print 200.
//        int x = ( 1==2)? 100:200;
//        System.out.println(x);

        int age = 30;
        String person_age = (age >= 18)? "true": "false";
        System.out.println(person_age);

    }
}
