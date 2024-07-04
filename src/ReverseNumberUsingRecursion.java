public class ReverseNumberUsingRecursion {


        static int reverse(int num, int reverse) {
            if (num == 0) {
                return reverse;
            }

            int remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            return reverse(num / 10, reverse);
        }

        public static void main(String[] args) {
            int num = 12345;
            int reversedNum = reverse(num, 0);
            System.out.println("Reversed Num is: " + reversedNum);
        }
    }

