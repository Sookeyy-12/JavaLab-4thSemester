class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Prog1 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
    }
}