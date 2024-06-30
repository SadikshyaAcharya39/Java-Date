public class Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums);

        for(int i: nums){
            System.out.println(i);
        }

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }
}
