import java.util.Scanner;

class Task1 extends Thread {
    String name;

    Task1(String s) {
        super(s);
        this.name = s;
    }
    public void run() {
        if (!name.equals("COMPUTE")) {
            for (int i = 0; i < name.length(); i++) {
                System.out.println(name.charAt(i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = name.length() - 1; i >= 0; i--) {
                System.out.println(name.charAt(i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Task2 extends Thread {
    String name;

    Task2(String s) {
        super(s);
        this.name = s;
    }
    public void run() {
        for (int i = 50; i <= 250; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    i++;
                    j = 2;
                }
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usr_str;
        System.out.println("Enter String: ");
        usr_str = scan.nextLine();
        Task1 t1 = new Task1(usr_str);
        Task2 t2 = new Task2("primeThread");
        t1.start();
        t2.start();
    }
}