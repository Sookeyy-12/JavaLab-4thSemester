import java.util.Scanner;

public class L4 {
    public void subtract(int a, int b) {
        System.out.printf("Difference of %d and %d is %d\n", a, b, a - b);
    }
    public void subtract(int a, int b, int c) {
        System.out.printf("Difference of %d, %d and %d is %d\n", a, b, c, a - b - c);
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L4 obj = new L4();
        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        obj.subtract(a, b);
        System.out.println("Enter three numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c = scanner.nextInt();
        obj.subtract(a, b, c);
    }
}