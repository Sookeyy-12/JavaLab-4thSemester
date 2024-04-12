import java.util.Scanner;

public class L2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int grade;
        System.out.println("Enter Grade: ");
        grade = scanner.nextInt();
        if (grade >= 90) {
            System.out.println("O");
        } else if (grade >= 80) {
            System.out.println("E");
        } else if (grade >= 70) {
            System.out.println("A");
        } else if (grade >= 60) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        System.out.println("Grade: " + grade);
    }
}
