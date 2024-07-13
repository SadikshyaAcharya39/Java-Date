public class JavaConstructor {

//    int x;
//
//    public JavaConstructor(){
//        x = 10;
//    }
//
//    public static void main(String[] args) {
//        JavaConstructor javaConstructor = new JavaConstructor();
//        System.out.println(javaConstructor.x);
//    }



    // Constructor Parameters

//    int x;
//
//    public JavaConstructor(int y){
//        x = y;
//    }
//
//    public static void main(String[] args) {
//        JavaConstructor javaConstructor = new JavaConstructor(10);
//        System.out.println(javaConstructor.x);
//    }

    String firstName;
    String lastName;
    int age;

    public JavaConstructor(String firstName, String lastName, int age){
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
    }

    public static void main(String[] args) {
        JavaConstructor javaConstructor = new JavaConstructor("Sadikshya", "Acharya", 20);
        System.out.println( "First Name: " + javaConstructor.firstName + " " + "Last Name: " + "  " + javaConstructor.lastName + " " +  "Age: " + javaConstructor.age);

    }
}
