public class JavaMethod {

    static void printMethod(){
        System.out.println("Hello Sadikshya!!!");
    }

    public void printName(){
        System.out.println("Hello Hello!!!");
    }

    public int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        JavaMethod javaMethod = new JavaMethod();
        printMethod();
        javaMethod.printName();
        int sum = javaMethod.addNumbers(10, 3);
        int multiply = javaMethod.multiplyNumbers(3, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multiply);


    }

}
