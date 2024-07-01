


public class Threads extends Thread implements MyInterface{
    public static void main(String[] args) {
        Threads threads = new Threads();

        threads.printResults();
        int sum = threads.addNumbers(10, 20);
        int multiplication =threads.multipleNumbers(10, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multiplication);

        threads.start();
    }

    public int addNumbers(int num1 , int num2){
        return num1 + num2;
    }

    public int multipleNumbers(int num3, int num4) {
        return num3 * num4;
    }

    public void printResults(){
        System.out.println("Using Threads: ");
    }

    @Override
    public void run(){
        System.out.println("Hello It's Sadikshya Acharya!!! Enjoy a life...");
    }
}


