import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int a = args.length;
            int d = 50/a;
            try {
                if (a==1) {a = a / (a-a);}
                if (a==2) {int x[] = {1}; x[15] = 16;}
            } catch (IndexOutOfBoundsException e) {
                    System.out.println(e);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }   
    }
}