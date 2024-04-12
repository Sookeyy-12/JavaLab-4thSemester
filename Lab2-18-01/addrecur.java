import java.util.Scanner;

public class addrecur {
    int bitadd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return bitadd(sum, carry);
    }
    int unmul(int curr, int a, int b) {
        if (b==0) {
            return curr;
        }else {
            for (int i = 0; i < a; i++) {
                curr++;
            }
            b--;
            return unmul(curr, a, b);
        }
    }
    int unadd(int a, int b) {
        if (b==0) {
            return a;
        } else {
            // a++;
            // b--;
            return unadd(++a, --b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        addrecur add = new addrecur();
        int sum = add.unadd(a, b);
        System.out.println("Sum is: " + sum);
    }
}
