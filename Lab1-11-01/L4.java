import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = new String();
        System.out.println("Enter String: ");
        name = scanner.nextLine();
        int l = 0;
        int r = name.length()-1;
        while (l<=r) {
            if (name.charAt(l)!=name.charAt(r)) {
                System.out.println("Not Palindrome");
                return;
            }
            l++;r--;
        }
        System.out.println(name + " is Palindrome");
    }
}