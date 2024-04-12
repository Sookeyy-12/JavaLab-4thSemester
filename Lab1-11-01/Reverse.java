public class Reverse {
    public static void main(String[] args) {
        int n = 72;
        int a = n%10;
        int b = n/10;
        int rev = a*10 + b;
        System.out.printf("The Reverse of %d is %d\n", n, rev);
    }   
}