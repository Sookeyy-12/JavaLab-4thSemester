import java.util.Scanner;

public class L3 {
    int roll;
    String name;
    double gpa;
    L3(int r, String n, double g) {
        roll = r;
        name = n;
        gpa = g;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter number of Student:");
        n = scanner.nextInt();
        L3[] array = new L3[n];
        int top = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Rollnumber, Name, Gpa:");
            int r = scanner.nextInt();
            String name = scanner.next();
            double g = scanner.nextDouble();
            L3 obj = new L3(r, name, g);
            array[top] = obj;
            top++;
        }
        String lowname = "Initialized";
        int lowroll = 0;
        double lowgpa = 11.0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Name: %s\tRoll: %d\tCGPA: %f\n", array[i].name, array[i].roll, array[i].gpa);
            if (array[i].gpa <= lowgpa) {
                lowgpa = array[i].gpa;
                lowname = array[i].name;
                lowroll = array[i].roll;
            }
        }
        System.out.printf("Lowest Gpa of %f is scored by %s, %d", lowgpa, lowname, lowroll);
    }
}