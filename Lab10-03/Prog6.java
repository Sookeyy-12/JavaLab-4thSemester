class Thread1 extends Thread {
    String name;
    String[] str = {"I", "Love", "Java", "Very", "Much"};
    int cnt = 0;
    Thread1(String s) {
        super(s);
        this.name = s;
    }
    public void run() {
        for (int i = 0; i < this.str.length; i++) {
            System.out.printf("Thread 1: %s\n", str[i]);
        }
    }
}
class Thread2 extends Thread {
    String name;
    String[] str = {"I", "Love", "Java", "Very", "Much"};
    int cnt = 0;
    Thread2(String s) {
        super(s);
        this.name = s;
    }
    public void run() {
        for (int i = 0; i < this.str.length; i++) {
            System.out.printf("Thread 2: %s\n", str[i]);
        }
    }
}
public class Prog6 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread1");
        Thread2 t2 = new Thread2("Thread2");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}