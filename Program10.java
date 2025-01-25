class FinalDemo {
    final int value = 100;

    void display() {
        System.out.println("Final Value: " + value);
    }
}

public class Program10 {
    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        demo.display();
    }
}
