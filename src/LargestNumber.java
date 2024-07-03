public class LargestNumber {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 15;
        int num2 = 20;

//        if(num <= num1){
//            System.out.println(num1);
//        }
//        else if(num1 <= num2 ){
//            System.out.println(num1);
//        }
//        else{
//            System.out.println(num2);
//        }

        if(num > num1 && num > num2){
            System.out.println(num);
        }
        else if(num1 > num && num1 > num2 ){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}
