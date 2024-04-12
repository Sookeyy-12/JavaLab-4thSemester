import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Five Numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        // sort the array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int n: numbers) {
            System.out.print(n + " ");
        }
    }
}
