class Thread1 extends Thread {
    String name;
    Thread1(String s) {
        super(s);
        name = s;
    }
    public void run() {
        try {
            for (int i = 100; i > 90; i--) {
                System.out.println("Thread1: "  + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Thread2 extends Thread {
    String name;
    Thread2(String s) {
        super(s);
        name = s;
    }
    public void run() {
        try {
            for (int i = 100; i > 90; i--) {
                System.out.println("Thread2: "  + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Thread3 extends Thread {
    String name;
    Thread3(String s) {
        super(s);
        name = s;
    }
    public void run() {
        try {
            for (int i = 100; i > 90; i--) {
                System.out.println("Thread3: "  + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Prog3 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread1");
        Thread2 t2 = new Thread2("Thread2");
        Thread3 t3 = new Thread3("Thread3");
        t1.start();
        t2.start();
        t3.start();
    }
}