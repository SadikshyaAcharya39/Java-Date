public class MethodOverloading {

//    static int plusMethodInt(int x, int y){
//        return x + y;
//    }
//
//    static double plusMethodDouble(double a, double b){
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        int num1 = plusMethodInt(10, 10);
//        double num2 = plusMethodDouble(1.3, 4.6);
//        System.out.println(num1);
//        System.out.println(num2);
//    }


      public int addingNumbers(int a, int b){
          return  a + b;
      }

      public float addingNumbers(float x, float y){
          return x + y;
      }

    public static void main(String[] args) {
          MethodOverloading overloading = new MethodOverloading();
          int num = overloading.addingNumbers(2,3);
          double num2 = overloading.addingNumbers(1.2f, 2.3f);
          System.out.println("Integer: " + num);
          System.out.println("Double: " + num2);

      }
}
