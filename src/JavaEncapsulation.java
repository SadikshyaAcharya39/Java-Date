public class JavaEncapsulation {


    private String fullName;
    private  int age;

    public String getFullName(){
        return fullName;
    }

    public int getAge(){
        return age;
    }

    public void setFullName(String name){
        fullName = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        JavaEncapsulation javaEncapsulation = new JavaEncapsulation();


        // This is not allowed in encapsulation. We cannot access it from outside the class.
        // Get methods returns the value/
        // Set methods takes a parameter or values and assign it to the another variable. "THIS" keyword is used to refer to the current object.


//        javaEncapsulation.fullName;


        javaEncapsulation.setFullName("Sadikshya Acharya");
        javaEncapsulation.setAge(20);
        System.out.println("Full Name : " + javaEncapsulation.getFullName() + "  " + " Age: " +  javaEncapsulation.getAge()  );

    }
}
