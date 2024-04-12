import java.util.Scanner;

public class L6 {
    double length, breadth;
    L6() {
        length = 0.0; breadth = 0.0;
    }
    L6(double s) {
        length = breadth = s;
    }
    L6(double l, double b) {
        length = l; breadth = b;
    }
    public void area() {
        double area = length * breadth;
        System.out.printf("Area of Rectangle: %f\n", area);
    }
    public static void main(String[] args) {
        L6 obj1 = new L6();
        obj1.area();
        L6 obj2 = new L6(8);
        obj2.area();
        L6 obj3 = new L6(10, 5.0);
        obj3.area();
    }
}