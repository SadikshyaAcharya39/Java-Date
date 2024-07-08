public class ArrayReversing {
    public static void main(String[] args) {
        int[] num = {1, 2, 34, 4, 5,6, 6,7 };

//        for(int i = num.length - 1; i >= 0; i--){
//            System.out.println(num[i]);
//        }

        int i = num.length - 1;
        while(i >= 0){
            System.out.println(num[i]);
            i--;
        }
    }
}
