import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d;
        int a;
        System.out.println("Entner divident and divisor: ");
        d = s.nextInt();
        a = s.nextInt();
        int r = d/a;    //possibility of error
        System.out.println("Result is " + r);
    }
}