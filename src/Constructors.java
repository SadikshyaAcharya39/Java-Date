public class Constructors {

    int x;

    public Constructors(int y){
        x = y;
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors(3);
        System.out.println(constructors.x);
    }
}
