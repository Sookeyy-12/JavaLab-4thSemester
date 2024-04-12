import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 10;
        int arr[] = {1,2,3,4,5};
        int d, i;
        System.out.println("Enter divisor and index");
        d = s.nextInt();
        i = s.nextInt();
        try {
            System.out.println(a/d);
            System.out.println(arr[i]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out of Bounds Exception: " + e);
        }
    }
}
