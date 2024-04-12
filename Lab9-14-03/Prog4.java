import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--, j++) {
            sb.setCharAt(j, s.charAt(i));
        }
        System.out.println(sb);
    }
}
