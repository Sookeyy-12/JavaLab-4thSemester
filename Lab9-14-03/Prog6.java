import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int choice;

        do {
            System.out.println("\n1. Enter a string");
            System.out.println("2. toString()");
            System.out.println("3. valueOf()");
            System.out.println("4. charAt()");
            System.out.println("5. equals()");
            System.out.println("6. startsWith()");
            System.out.println("7. endsWith()");
            System.out.println("8. compareTo()");
            System.out.println("9. indexOf()");
            System.out.println("10. substring()");
            System.out.println("11. concat()");
            System.out.println("12. replace()");
            System.out.println("13. trim()");
            System.out.println("14. toUpperCase()");
            System.out.println("15. toLowerCase()");
            System.out.println("16. join()");
            System.out.println("17. getChars()");
            System.out.println("18. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Enter a string:");
                    str = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("toString(): " + str.toString());
                    break;
                case 3:
                    System.out.println("valueOf(): " + String.valueOf(str));
                    break;
                case 4:
                    System.out.println("Enter index: ");
                    int i = scanner.nextInt();
                    System.out.printf("charAt(%d): %c\n", i, str.charAt(i));
                    break;
                case 5:
                    System.out.println("Enter a string to compare:");
                    String str2 = scanner.nextLine();
                    System.out.println("equals(): " + str.equals(str2));
                    break;
                case 6:
                    System.out.println("Enter prefix to check:");
                    String prefix = scanner.nextLine();
                    System.out.println("startsWith(): " + str.startsWith(prefix));
                    break;
                case 7:
                    System.out.println("Enter suffix to check:");
                    String suffix = scanner.nextLine();
                    System.out.println("endsWith(): " + str.endsWith(suffix));
                    break;
                case 8:
                    System.out.println("Enter a string to compare:");
                    String str3 = scanner.nextLine();
                    System.out.println("compareTo(): " + str.compareTo(str3));
                    break;
                case 9:
                    System.out.println("Enter a character to find:");
                    char ch = scanner.nextLine().charAt(0);
                    System.out.println("indexOf(): " + str.indexOf(ch));
                    break;
                case 10:
                    System.out.println("Enter start index for substring:");
                    int start = scanner.nextInt();
                    System.out.println("Enter end index for substring:");
                    int end = scanner.nextInt();
                    System.out.println("substring(): " + str.substring(start, end));
                    break;
                case 11:
                    System.out.println("Enter a string to concatenate:");
                    String str4 = scanner.nextLine();
                    System.out.println("concat(): " + str.concat(str4));
                    break;
                case 12:
                    System.out.println("Enter character to replace:");
                    char oldChar = scanner.nextLine().charAt(0);
                    System.out.println("Enter new character:");
                    char newChar = scanner.nextLine().charAt(0);
                    System.out.println("replace(): " + str.replace(oldChar, newChar));
                    break;
                case 13:
                    System.out.println("trim(): " + str.trim());
                    break;
                case 14:
                    System.out.println("toUpperCase(): " + str.toUpperCase());
                    break;
                case 15:
                    System.out.println("toLowerCase(): " + str.toLowerCase());
                    break;
                case 16:
                    System.out.println("Enter a delimiter:");
                    String delimiter = scanner.nextLine();
                    System.out.println("Enter a string to join:");
                    String str5 = scanner.nextLine();
                    System.out.println("join(): " + String.join(delimiter, str, str5));
                    break;
                case 17:
                    System.out.println("Enter start index:");
                    int startIndex = scanner.nextInt();
                    System.out.println("Enter end index:");
                    int endIndex = scanner.nextInt();
                    char[] destination = new char[endIndex - startIndex];
                    str.getChars(startIndex, endIndex, destination, 0);
                    System.out.println("getChars(): " + new String(destination));
                    break;
                case 18:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 18.");
                    break;
            }
        } while (choice != 18);

        scanner.close();
    }
}