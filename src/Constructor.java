
public class Constructor {
    int x ;

    public Constructor(int x){
        this.x = x;
    }

    public static void main(String[] args) {
       Constructor constructor = new Constructor(3);
//       int input = constructor.x;
//        System.out.println(input);

        System.out.println(constructor.x);
    }
}
