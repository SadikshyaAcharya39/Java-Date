public class PalindromeNumber1 {

   static int reverse(int num){
     int remainder;
     int reverse = 0;


     while( num > 0){
         remainder = num % 10;
         reverse = (reverse * 10) + remainder;
         num = num / 10;
     }
     return reverse;
   }

    public static void main(String[] args) {
        int num = 123;
//        reverse(num);
//      int reversedNum =  reverse(num);
        System.out.println(reverse(num));

    }
}
