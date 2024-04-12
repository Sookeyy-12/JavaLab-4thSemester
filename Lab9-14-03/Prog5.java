import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        StringBuffer rev = sb.reverse();
        if (s.equals(rev.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}