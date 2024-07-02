public class OuterClasss {
    int x;

    public class InnerClasss {
        int x = 3;
    }

    public static void main(String[] args) {
        OuterClasss outerClass = new OuterClasss(); // Corrected class name
        OuterClasss.InnerClasss innerClasss = outerClass.new InnerClasss(); // Corrected instantiation

        // Accessing the inner class's variable
        System.out.println("OuterClasss x: " + outerClass.x); // Accesses the outer class's x
        System.out.println("InnerClasss x: " + innerClasss.x); // Accesses the inner class's x
    }
}
