public class MethodsInJava {

//    static int addNumbers(int a, int b){
//        return a + b;
//    }

//    public int addNumbers(int a, int b){
//        return a + b;
//    }

//    static void myMethod(String fname){
//        System.out.println(fname + "Acharya");
//    }

//    static void  addNumbers(int x, int y){
//        System.out.println("Adding Numbers: " + (x + y));
//    }
//
//    static void subtractNumbers(int a, int b){
//        System.out.println("Subtracting Numbers: " + (a - b));
//    }
//
//    static void multiplyNumbers(int c, int d){
//        System.out.println("Multiplying Numbers: " + (c * d));
//    }
//
//    static void divideNumbers(int f, int g){
//        System.out.println("Dividing Numbers: " + (f / g));
//    }

    // Multiple Parameters

    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
//        MethodsInJava methodsInJava = new MethodsInJava();
//        System.out.println(methodsInJava.addNumbers(2, 3));
//          myMethod("Sadikshya");

//        addNumbers(1, 2);
//        subtractNumbers(6,5);
//        multiplyNumbers(2, 3);
//        divideNumbers(10, 5);

        myMethod("Sadikshya", 20);
    }
}
