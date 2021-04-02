import java.util.Arrays;
import java.util.Scanner;

public class MthToLastElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        String[] numbers = scanner.nextLine().split(" ");
        if (m>numbers.length){
            System.out.println("NIL");
            return;
        }
        System.out.println(numbers[numbers.length-m]);
    }
}
