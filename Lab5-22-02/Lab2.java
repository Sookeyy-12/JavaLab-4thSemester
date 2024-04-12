interface Motor {
    float capacity = 100;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing machine is Running1!");
    }
    public void consume() {
        System.out.printf("Washing Machine is Consuming, Capacity %f", capacity);
    }
}

public class Lab2 {
    public static void main(String[] args) {
        WashingMachine bosch = new WashingMachine();
        bosch.run();
        bosch.consume();
    }
}