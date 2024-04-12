import java.util.Scanner;

class CheckArgument extends Exception {
    public String toString() {
        return "Number of Arguments less than 4";
    }
}

public class Prog9 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument();
            }
            System.out.println("Sum of Squares:");
            int sum = 0;
            for (String a: args) {
                int num = Integer.parseInt(a);
                sum += num*num;
            }
            System.out.println(sum);
        } catch (CheckArgument e) {
            System.out.println(e);
        }
    }
}
