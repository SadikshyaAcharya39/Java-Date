package JavaCodes;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        try {

            String input =  sc.nextLine();
            System.out.println(input);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
