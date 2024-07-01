public class Exceptions {
//    public static void main(String[] args) {
//        int age = 18;
//        try{
//            if (age < 18){
//                System.out.println("Not allowed");
//            }
//            else{
//                System.out.println("Access Granted");
//            }
//        } catch (Exception e){
//            System.out.println("Access Denied");
//        }
//}

        static void checkAge(int age){
            if (age < 18){
                throw new ArithmeticException("Access Denied - You must be atleast 18 years old!!!");

            } else{
                System.out.println("Access Granted");
            }

        }

    public static void main(String[] args) {
        checkAge(20);
    }
}

