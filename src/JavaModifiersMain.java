public class JavaModifiersMain {
//    public static void main(String[] args) {
//        JavaModifiers javaModifiers = new JavaModifiers();
//        System.out.println(javaModifiers.firstName);
//        System.out.println(javaModifiers.lastName);
//    }

    // This won't work. Because variables are private.

    public static void main(String[] args) {
        System.out.println("Private variables ");


/*
PUBLIC - 	The code is accessible for all classes

PRIVATE - The code is only accessible within the declared class

PROTECTED - The code is accessible in the same package and subclasses.
 */

        // final : The class cannot be inherited by other classes.
        // abstract: The class cannot be used to create objects, it must be inherited from another class.

        // final - Attributes and methods cannot be overridden or modified.
        // static - Attributes and methods cannot belongs to the class, rather than an object
        // abstract - can only be used in an abstract class, and can only be used on methods.
        // The method does not have body . for example abstract void run();.
        // The body is provided by the subclass (inherited from).
        // transient - Attributes and methods are skipped when serializing the object containing them
        // synchronized - Methods can only be accessed by one thread at a time
        // volatile - The value of an attribute is not cached thread-locally, and is always read from the "main memory"



    }
}
