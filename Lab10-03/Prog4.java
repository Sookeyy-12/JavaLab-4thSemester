class EvenThread extends Thread {
    String name;
    EvenThread(String s) {
        super(s);
        name = s;
    }
    public void run() {
        try {
            for (int i = 0; i <= 50; i+=2) {
                System.out.println("EvenThread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class OddThread extends Thread {
    String name;
    OddThread(String s) {
        super(s);
        name = s;
    }
    public void run() {
        try {
            for (int i = 1; i <= 50; i+=2) {
                System.out.println("OddThread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Prog4 {
    public static void main(String[] args) {
        EvenThread e = new EvenThread("even");
        OddThread o = new OddThread("odd");
        e.start();
        o.start();
    }
}