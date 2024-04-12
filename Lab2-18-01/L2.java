import java.util.Scanner;

public class L2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter single number:");
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
