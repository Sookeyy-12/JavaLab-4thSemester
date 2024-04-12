import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Numbers: ");
            int size = 4;
            int arr[] = {0,0,0,0};
            for (int i = 0; i < 5; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < size; i++) {
                System.out.printf("%d\t", arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Out of Bounds: " + e);
        }
    }
}
