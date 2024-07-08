public class List {
    public static void main(String[] args) {
//        String[] nums = {"Sadikshya", "Acharya"};
//        System.out.println(nums[0]);
//        nums[1] = "Sad";
//        System.out.println(nums[1]);

//        for(String i: nums){
//            System.out.println( i );
//        }

//        for(int i = nums.length -1 ; i >= 0; i--){
//            System.out.println(nums[i]);
//        }

//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }


        String[][] names = {{"sadikshya", "acharya"} , {"Sadikshya", "Acharya"}};

        for(int i = 0; i < names.length; i++){
            System.out.println(i);
            for(int j = 0; j <names[i].length; j++){
                System.out.println(names[i][j]);
            }
        }

    }
}
