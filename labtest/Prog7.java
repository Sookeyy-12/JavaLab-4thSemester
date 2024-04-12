import java.util.Scanner;

class NegativeException extends Exception {
    public String toString() {
        return "Negative Number Exception";
    }
}

public class Prog7 {
    void processInput(int x) throws NegativeException{
        if (x < 0) {
            throw new NegativeException();
        } else {
            System.out.println("Entered number is : " + x);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Prog7 obj = new Prog7();
        System.out.println("Enter Number:");
        int a = s.nextInt();
        try {
            obj.processInput(a);
        } catch (NegativeException e) {
            System.out.println(e);
        }
    }
}
