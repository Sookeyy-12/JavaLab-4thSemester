// import java.util.Scanner;
public class Arith
{
    public int add(int a, int b) {
        return a+b;
    }
    public int mul(int a, int b) {
        return a*b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
    public int div(int a, int b) {
        return a/b;
    }
    public int mod(int a, int b) {
        return a%b;
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter First Number: ");
        // int a = scanner.nextInt();
        // System.out.println("Enter Second Number: ");
        // int b = scanner.nextInt();
        int a = 30, b = 6;
	System.out.printf("Numbers are a = %d and b = %d\n", a, b);
        Arith arith = new Arith();
        System.out.println("Addition: " + arith.add(a, b));
        System.out.println("Multiplication: " + arith.mul(a, b));
        System.out.println("Subtraction: " + arith.sub(a, b));
        System.out.println("Division: " + arith.div(a, b));
        System.out.println("Modulo: " + arith.mod(a, b));
    }
}