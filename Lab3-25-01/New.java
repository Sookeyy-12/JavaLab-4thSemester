public class New {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Palindomes are: ");
        for (int i = 1; i <= 50; i++) {
            if (i/10 == i%10) {
                sum+=i;
                System.out.printf("%d\t", i);
            }
        }
        System.out.printf("\nSum of all Palindrome numbers: %d", sum);
    }
}