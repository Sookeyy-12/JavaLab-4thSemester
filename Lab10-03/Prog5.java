import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of the Thread: ");
        String name = scanner.nextLine();
        System.out.println("Enter Lower Bound and Upper Bound");
        int l, u;
        l = scanner.nextInt();
        u = scanner.nextInt();
        CounterThread counterThread = new CounterThread(name, l, u);
        counterThread.start();
    }
}

class CounterThread extends Thread {
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.println("Counter - " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}