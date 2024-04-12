import java.util.Scanner;

public class L5 {
    public void area(int s) {
        int area = s*s;
        System.out.printf("Area of Square: %d\n", area);
    }
    public void area(int b, int h) {
        double area = 0.5 * b * h;
        System.out.printf("Area of Triangle: %f\n", area);
    }
    public void area (double r) {
        double area = 3.14 * r * r;
        System.out.printf("Area of Circle: %f\n", area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side of Square:");
        int s = scanner.nextInt();
        L5 obj = new L5();
        obj.area(s);
        System.out.println("Enter Base and Height of Triangle:");
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        obj.area(b, h);
        System.out.println("Enter Radius of Circle (double type):");
        double r = scanner.nextDouble();
        obj.area(r);
    }
}