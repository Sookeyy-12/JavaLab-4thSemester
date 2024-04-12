class MyRunnable implements Runnable {
    public void run() {
        System.out.println("First: " + Thread.currentThread().getState());
        for (int i = 10; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {       
            System.out.println("Second: " + Thread.currentThread().getState());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            System.out.println("Third: " + Thread.currentThread().getState());
            }
        }
    }
}
public class Prog1 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        System.out.println("Fourth: " + myThread.getState());
        myThread.start();
        System.out.println("Fifth: " + myThread.getState());
        for (int i = 10; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            System.out.println("Sixth: " + myThread.getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Seventh: " + myThread.getState());
    }
}
