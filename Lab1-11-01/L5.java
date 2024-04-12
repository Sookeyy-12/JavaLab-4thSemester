import java.util.Scanner;

public class L5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstName = new String();
        String lastName = new String();
        System.out.println("Enter First Name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        lastName = scanner.nextLine();
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
