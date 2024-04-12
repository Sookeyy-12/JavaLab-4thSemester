import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d;
        int a;
        System.out.println("Entner divident and divisor: ");
        d = s.nextInt();
        a = s.nextInt();
        int r = 0;
        try{
            r = d/a;    //possibility of error
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Result is " + r);
    }
}