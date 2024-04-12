import java.util.Scanner;

public class L2 {
    double length, breadth;
    double area, perimeter;
    public void read(double l, double b) {
        length = l; breadth = b;
    }
    public void calculate() {
        area = length * breadth;
        perimeter = 2*(length + breadth);
    }
    public void display() {
        System.out.printf("Area of Rectangle: %f\nPerimeter of Rectangle: %f\n", area, perimeter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l, b;
        System.out.println("Enter length and breadth:");
        l = scanner.nextInt();
        b = scanner.nextInt();
        L2 rectangle = new L2();
        // methods invoking
        rectangle.read(l, b);
        rectangle.calculate();
        rectangle.display();
    }
}
