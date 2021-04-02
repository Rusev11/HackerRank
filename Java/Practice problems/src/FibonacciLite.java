import java.util.Scanner;

public class FibonacciLite {
    public static long fibonnaci(long n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = Long.parseLong(scanner.nextLine());
            System.out.println(fibonnaci(n));
        }
    }
}
