class callme {
    public void call(String msg) {
        System.out.print("[");
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();};
        System.out.print(msg);
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();};
        System.out.print(']');
    }
}

class mythread extends Thread {
    String name;
    callme func;
    mythread(String name, callme func) {
        super(name);
        this.name = name;
        this.func = func;
    }
    public void run() {
        synchronized (func) {
            func.call(this.name);
        }
    }
}

public class test {
    public static void main(String[] args) {
        callme func = new callme();
        mythread t1 = new mythread("thread1", func);
        mythread t2 = new mythread("thread2", func);
        mythread t3 = new mythread("thread3", func);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}