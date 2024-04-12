package Marketing;

import General.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }
    public double tallowance(double basic) {
        return earnings(basic)*0.05;
    }
}
