
class Transport {
    void start() {
        System.out.println("Transport is starting");
    }
}

class Car extends Transport {
    void start() {
        System.out.println("Car is starting");
    }
}

class Bike extends Transport {
    void start() {
        System.out.println("Bike is starting");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Transport t1 = new Car();
        Transport t2 = new Bike();
        t1.start();
        t2.start();
    }
}
