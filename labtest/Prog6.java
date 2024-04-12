import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Enter Divident and Divisor");
        a = s.nextInt();
        b = s.nextInt();
        int r = 0;
        try {
            r = a/b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Hence Result is " + r);
        }
    }
}
