public class MethodWithConditional {

//    static void checkAge(int age){
//        if(age > 18){
//            System.out.println("Age is greater than 18!!!");
//        }else if( age == 18){
//            System.out.println("Age is equal to 18!!!");
//        }
//        else{
//            System.out.println("Age is less than 18!!!");
//        }
//    }

//    static  int myMethod(int x){
//        return x + 5;
//    }

//    public static void main(String[] args) {
////        checkAge(20);
////        System.out.println(myMethod(5));
//    }

    // Method Overloading

//    static int plusMethod(int x, int y){
//        return x + y;
//    }
//
//    static double plusMethod(double a, double b){
//        return  a + b;
//    }
//
//    public static void main(String[] args) {
//
//        int z = plusMethod(2, 3);
//        double c = plusMethod(1.2f, 2.3f);
//        System.out.println("Int Numbers: " + z);
//        System.out.println("Double Numbers: " +  c);
//  }

          static int plusMethod(int x, int y){
              return x + y;
          }

          static double plusMethod(float x, float y){
              return x + y;
          }

    public static void main(String[] args) {
        int num1 = plusMethod(2,3);
        double num2 = plusMethod(2.1f, 3.2f);
        System.out.println(num1);
        System.out.println(String.format("%.1f", num2));
    }
}
