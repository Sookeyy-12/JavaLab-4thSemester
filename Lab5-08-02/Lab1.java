import java.util.Scanner;

abstract class Student {
    int roll;
    int reg;
    void getInput(int roll, int reg) {
        this.roll = roll;
        this.reg = reg;
    }
    abstract void course(String course);
}
class Kiitian extends Student {
    String course;
    void course(String course) {
        this.course = course;
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll Number:");
        int roll = scanner.nextInt();
        System.out.println("Enter Registration Number:");
        int reg = scanner.nextInt();
        System.out.println("Enter Course:");
        String course = scanner.next();
        Kiitian obj = new Kiitian();
        obj.getInput(roll, reg);
        obj.course(course);
        System.out.printf("Roll Number: %d\nRegistration Number: %d\nCourse: %s", obj.roll, obj.reg, obj.course);
    } 
}