import java.util.Scanner;

public class RegexForNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Full Name: ");
        String name = sc.next("[\\p{L}\\p{M}\\p{Nl}]+");

        if(name.matches("[\\p{L}\\p{M}\\p{Nl}]+")){
            System.out.println("Match Found");
        }
        else{
            System.out.println("Match Not Found!!!!");
        }
    }
}
