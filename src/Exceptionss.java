public class Exceptionss {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            if(nums.length < 10) {
                throw new ArrayIndexOutOfBoundsException("Array out of index");
            }
            else{
                System.out.println("Access Granted!!!");
            }
    }
}
