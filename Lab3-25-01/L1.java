import java.util.Scanner;
public class L1 {
    double length, width, height;
    L1 (double l, double w, double h) {
        length = l; width = w; height = h;
    }
    public void volume() {
        double vol = length * width * height;
        System.out.printf("The volume is %f cubic units\n", vol);
    }
}
class Demo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l, w ,h;
        System.out.println("Enter length, width and height:");
        l = scanner.nextDouble();
        w = scanner.nextDouble();
        h = scanner.nextDouble();
        L1 box = new L1(l, w, h);
        box.volume();
    }
}