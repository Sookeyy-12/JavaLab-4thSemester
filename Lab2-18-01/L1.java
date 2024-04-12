import java.util.Scanner;
public class L1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter Three Numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int largest;
        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("Largest Number is: " + largest);
    }
}
