import java.util.Scanner;

interface earn {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

class Manager implements earn {
    public double earnings(double basic) {
        return 1.95*basic;
    }
    public double deductions(double basic) {
        return 0.12*basic;
    }
    public double bonus(double basic) {
        return basic*0;
    };
}

class Substaff extends Manager {
    public double bonus(double basic) {
        return basic*0.5;
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Substaff staff = new Substaff();
        System.out.println("Enter Basic Salary: ");
        double basic = scanner.nextDouble();
        double earnings = staff.earnings(basic);
        double deductions = staff.deductions(basic);
        double bonus = staff.bonus(basic);
        System.out.printf("Earnings: %f\nDeductions: %f\nBonus: %f", earnings, deductions, bonus);
    }
}