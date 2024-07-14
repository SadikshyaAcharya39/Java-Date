package JavaCodes;

public class Mainss{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.y + outer.x);
    }
}
