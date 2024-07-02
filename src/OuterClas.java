public class OuterClas {

    int x = 10;

    protected class InnerClas{
        int y = 5;
    }

    public static void main(String[] args) {
        OuterClas outerClass = new OuterClas();
        OuterClas.InnerClas innerClas = outerClass.new InnerClas();
        System.out.println(outerClass.x);
        System.out.println(innerClas.y);
    }
}
