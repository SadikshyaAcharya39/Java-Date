package JavaCodes;


    /*

    Data abstraction is the process of hiding certain details
    and showing only essential information to the user.

    Abstraction can be achieved
    with either abstract classes or interfaces


    Abstract class: is a restricted class that cannot be used
    to create objects (to access it, it must be inherited from another class).


    Abstract method: can only be used in an abstract class, and
    it does not have a body. The body is provided by the subclass (inherited from).

    */


abstract class AbstractClass {

public abstract void animalSound();
public void sleep(){
    System.out.println("Zzz");
}

    public static void main(String[] args) {
//        AbstractClass abstractClass = new AbstractClass();

        // Error will come, we are not able to create an object of the Abstract Class.
    }

}
