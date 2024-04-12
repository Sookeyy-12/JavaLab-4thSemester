import java.util.Scanner;
import General.Employee;
import Marketing.Sales;

public class Lab1 {
    public static void main(String[] args) {
        /**this is a test comment */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int eid = scanner.nextInt();
        System.out.println("Enter Employee Name: ");
        String ename = scanner.next();
        Sales person = new Sales(eid, ename);
        double basic;
        System.out.println("Enter Basic Salary of Employee: ");
        basic = scanner.nextInt();
        System.out.print("The Employee ID is "+ person.get_empid());
        System.out.print("\nThe Net Salary is " + (person.earnings(basic) + person.tallowance(basic)));
    }
}
