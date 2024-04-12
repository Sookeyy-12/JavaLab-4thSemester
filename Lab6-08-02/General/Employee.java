package General;

public class Employee {
    protected int empid;
    private String ename;
    protected Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }
    public double earnings(double basic) {
        double earn = 1.95*basic; 
        return earn;
    }
    public int get_empid() {
        return this.empid;
    }
}
