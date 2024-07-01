import java.util.Scanner;

public class JavaRegexs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an name: ");
        String email = sc.next("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
        if(email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")){
            System.out.println("Match Found !!!");
        }
        else{
            System.out.println("Match Not Found!!!");
        }
    }
}
