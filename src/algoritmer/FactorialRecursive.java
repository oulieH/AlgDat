package algoritmer;

public class FactorialRecursive {

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }

    //    COPY:
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
//
}
