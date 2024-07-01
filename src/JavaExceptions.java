public class JavaExceptions {
    public static void main(String[] args) {
        // try and catch

        // Syntax

//        try{
//            // Block of code
//        }
//        catch (Exception e){
//            //  Block of code to handle errors
//        }


        try {
            int[] nums = {10, 11, 12, 13, 14, 15, 16, 17, 28, 29, 30};
//          System.out.println(nums[11]);
            System.out.println(nums[10]);
        }
        catch (Exception e){
            System.out.println("Something went wrong!!!");
        } finally {
            System.out.println("The try-catch is finished!!!");
        }
    }
}
