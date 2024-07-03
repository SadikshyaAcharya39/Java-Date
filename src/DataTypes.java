public class DataTypes {
    public static void main(String[] args) {

// These all are numeric data types.

        int a, b;
        a = 200;
         b = 20;
         System.out.println("Sum of two numbers are: " + 200 + 20);

         // Prints 20020. Because there is a string. It was concatenated first.

        System.out.println("Sum: " + ( a + b));

        byte by = 124;
        System.out.println(by);

        long l = 2122222222;
        System.out.println(l);

        // For long and float specify literal.

//        float f = 20.0; // Error


        float floatingNum1 = 20.0f; // Both are correct
        float floatingNum = 20.0F; // Correct
        // That f is known as literal and it wont be printed.


        // Decimal Numbers

        boolean bl = true;
        boolean bl2 = false;
        System.out.println(bl);
        System.out.println(bl2);

//        int num = 200;
//        num = 300;
        final int num = 30;
    }
}
