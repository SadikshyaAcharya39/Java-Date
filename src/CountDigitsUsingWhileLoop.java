public class CountDigitsUsingWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        int num = 123456;
        while(num != 0){
            num /= 10;
            ++count;
        }
        System.out.println("No. of Digits: " + count);
    }
}
