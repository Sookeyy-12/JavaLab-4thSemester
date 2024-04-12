import java.util.Scanner;

public class L3 {
    public static void main(String args[]) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Assuming the current month's first day is Monday. \nEnter Day: ");
        int day = scanner.nextInt();
        day = day%7;
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:                
                System.out.println("Friday");
                break;
            case 6:                    
                System.out.println("Saturday");
                break;
            default:
                break;
        }
    }
}
