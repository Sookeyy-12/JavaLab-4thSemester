class MyThread extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Prog2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 10; i > 0; i--) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}