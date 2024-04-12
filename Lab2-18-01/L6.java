import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat[][] = new int[3][3];
        System.out.println("Enter 3x3 Matrix: \n");
        int sum_lr = 0, sum_rl = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    mat[i][j] = scanner.nextInt();
                    if (i==j) {
                        sum_lr += mat[i][j];
                    }
                    if (i+j==2) {
                        sum_rl += mat[i][j];
                    }
            }
        }
        System.out.println("Sum of Left Diagonal: " + sum_lr);
        System.out.println("Sum of Right Diagonal: " + sum_rl);
    }
}
