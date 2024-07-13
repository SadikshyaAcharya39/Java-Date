import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer number: ");
//        int input = sc.nextInt();
//        System.out.println("Number entered by user is: " + input);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any name: ");
//        String name = sc.next();
//        System.out.println("Hello " + name + " !!! ");

        // It only printed Sadikshya when i entered input Sadikshya Acharya because I used next method not nextLine

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " !!! ");
    }
}
