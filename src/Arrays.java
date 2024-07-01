public class Arrays {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8, 9, 10};
//        System.out.println(nums[1]);
        nums[0] = 3;
//        System.out.println(nums[0]);


//        for(int i: nums){
//            System.out.println(i);
//        }

        nums[9] = 13;
        for(int i: nums){
            System.out.println(i);
        }


    }
}
