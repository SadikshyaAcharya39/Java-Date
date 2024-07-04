public class ReverseANumberUsingBuilderClass {
    public static void main(String[] args) {
        int n = 12345;

        // Conversion of int to string
        String temp = "" + n;

        // Creating StringBuilder

        StringBuilder sb = new StringBuilder(temp);
        StringBuilder str = sb.reverse();
        System.out.println(str.toString());
    }
}
