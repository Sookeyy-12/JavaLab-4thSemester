import java.util.Scanner;

class TwoD {
    double area;
    TwoD(double area) {
        this.area = area;
    }
    double cost() {
        return 40*(this.area);
    }
}

class ThreeD extends TwoD {
    double volume;
    ThreeD(double area, double volume) {
        super(area);
        this.volume = volume;
    }
    @Override
    double cost() {
        return 60*(this.volume);
    }
}

public class L1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tMenu\n1. 2D Sheet\n2. 3D Box");
        int choice = scanner.nextInt();
        if (choice == 1) {  
            System.out.print("Enter Length and Breadth: ");
            double l, b;
            l = scanner.nextDouble();
            b = scanner.nextDouble();
            TwoD sheet = new TwoD(l*b);
            System.out.printf("Cost: %f", sheet.cost());
        } else if (choice == 2) {
            System.out.print("Enter Length and Breadth and Height: ");
            double l, b, h;
            l = scanner.nextDouble();
            b = scanner.nextDouble();
            h = scanner.nextDouble();
            ThreeD sheet = new ThreeD(l*b, l*b*h);
            System.out.printf("Cost: %f", sheet.cost());
        } else {
            System.out.println("Invalid Choice");
        }
    }
}