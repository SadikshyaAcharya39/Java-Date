public class SwappingVariable {
    public static void main(String[] args) {
//        int num1 = 200;
//        int num2 = 100;
//
//        num1 = num1 + num2; // 200 + 100 =  300
//        num2 = num1 - num2; // 300 - 100 = 200
//        num1 = num1 - num2; // 300 - 200 = 100
//        System.out.println(num2);
//        System.out.println(num1);

//        int num1 = 10;
//        int num2 = 20;
//        int num;
//
//        // a b c  ,   c = a  ,  b = a   ,  c = b;
//
//        num = num1;
//        num1 = num2;
//        System.out.println(num1);
//        num2 = num;
//        System.out.println(num2);


//        int num = 10;
//        int num2 = 20;
//        int temp;
//
//        temp = num; // c = a
//        num = num2; // a = b
//        num2 = temp; // b = c
//        System.out.println(num);
//        System.out.println(num2);


        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);



    }
}
