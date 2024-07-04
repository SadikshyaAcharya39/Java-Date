public class CountNumOfDigits {
    public static void main(String[] args) {

        int count = 1, num = 12345;
        for(; num != 0; num /= 10, ++count){
            System.out.println("Number Of Digits: " + count);
        }

    }
}
