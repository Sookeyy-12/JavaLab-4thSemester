import java.util.Scanner;

public class Prog1 {
    public static void main(String args[]) {
        String s, s1;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        s = sc.nextLine();
        System.out.println("Enter the choice");
        System.out.print(
                "1.Change the case \n 2.Reverse \n3.Compare \n4.Insert one string to other \n5.To upper and lower case \n6.check character and position \n7.Palindrome \n8.number of words, vowel,consonants \n9.Exit\n");
        do{
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                if (s.equals(s.toLowerCase())) {
                    System.out.println(s.toUpperCase());
                } else {
                    System.out.println(s.toLowerCase());
                }
                break;
            case 2:
                s1 = "";
                for (int i = (s.length() - 1); i >= 0; i--) {
                    s1 = s1 + s.charAt(i);
                }
                System.out.println(s1);
                break;
            case 3:
                System.out.println("Enter string 2");
                s1 = sc.nextLine();
                int x = s.compareTo(s1);
                System.out.println("The difference in ascii value is " + x);
                break;
            case 4:
                System.out.println("Enter string to insert");
                s1 = sc.nextLine();
                String s2 = s + " " + s1;
                System.out.println("The string after inserting is " + s2);
                break;
            case 5:
                System.out.println("Uppercase is " + s.toUpperCase());
                System.out.println("Lowercase is " + s.toLowerCase());
                break;
            case 6:
                System.out.println("Enter character to search");
                String ch = sc.next();
                if (s.indexOf(ch) == -1) {
                    System.out.println("Character not found");
                } else {
                    System.out.println(ch + " found at " + (s.indexOf(ch) + 1));
                }
                break;
            case 7:
                int l = s.length() - 1;
                int k;
                int m = 0;
                for (k = 0; k < l; k++) {
                    if (s.charAt(k) != s.charAt(l)) {
                        m = 1;
                        break;
                    }
                    l--;
                }
                if (m == 1) {
                    System.out.println("It's not a palindrome");
                } else {
                    System.out.println("It's a palindrome");
                }
                break;
            case 8:
                int v = 0;
                int c = 0;
                int space = 0;
                for (int j = 0; j < s.length(); j++) {
                    char a = s.charAt(j);
                    if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I'
                            || a == 'O' || a == 'U') {
                        v++;
                    } else if (a == ' ') {
                        space++;
                    } else {
                        c++;
                    }
                }
                System.out.println("Vowels " + v + " Consonants " + c + " Words " + (space + 1));
                break;
            case 9: System.out.println("Exiting the program.");
            break;
            default: System.out.println("Invalid choice");
        }}while(choice!=9);
    }
}