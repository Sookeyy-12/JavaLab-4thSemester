import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s = scanner.nextLine();
        int index = s.indexOf(" is ");
        while (index != -1) {
            s = s.substring(0, index) + " was " + s.substring(index + 4);
            index = s.indexOf(" is ");
        }
        System.out.println(s);
    }
}