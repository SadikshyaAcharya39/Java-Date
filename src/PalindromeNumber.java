public class PalindromeNumber {
    static int reverse(int num) {

        int remainder;
        int reverse = 0;

        while (num > 0) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }
        return  reverse;
    }

    static void print(int num, int reversedNum ){
            if (num == reversedNum) {
                System.out.println(num + " is a palindrome number");
            } else {
                System.out.println(num + " is not a palindrome number");
            }

    }

    public static void main(String[] args) {
        int num = 121;
        int reversedNum = reverse(num);
        print(num, reversedNum);
        System.out.println("Reverse Number: " + reverse(num));

    }
}
