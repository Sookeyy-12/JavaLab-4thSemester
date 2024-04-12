import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empID;
    String eName;
    int deptId;
    String deptName;
    public void getDetails() {
        System.out.printf("Employee ID: %d\nEmployee Name: %s\n", empID, eName);
    }
    public void getDeptDetails() {
        System.out.printf("Department ID: %d\nDepartment Name: %s\n", deptId, deptName);
    }
}

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Head emp = new Head();
        System.out.println("Enter Employee ID: ");
        emp.empID = scanner.nextInt();
        System.out.println("Enter Employee Name: ");
        emp.eName = scanner.next();
        System.out.println("Enter Department ID:");
        emp.deptId = scanner.nextInt();
        System.out.println("Enter Department Name:");
        emp.deptName = scanner.next();

        emp.getDetails();
        emp.getDeptDetails();
    }
}