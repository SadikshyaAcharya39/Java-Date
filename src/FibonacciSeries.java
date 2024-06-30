public class FibonacciSeries {
    public static void main(String[] args) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;
        System.out.print(firstTerm + " , " + secondTerm);

        for(int i = 0; i <= 6; i++){
            nextTerm = firstTerm + secondTerm;
            System.out.print(" , " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
//        System.out.println();
    }
}
