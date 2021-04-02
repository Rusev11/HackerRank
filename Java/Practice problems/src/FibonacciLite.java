import java.util.Scanner;

public class FibonacciLite {
    public static int fibonnaci(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return fibonnaci(n-1) + fibonnaci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(fibonnaci(n));
    }
}
