
// Program8.java - Demonstrates polymorphism
class Printer {
    void print() {
        System.out.println("Printing from Printer");
    }
}

class LaserPrinter extends Printer {
    void print() {
        System.out.println("Printing from Laser Printer");
    }
}

public class Program8 {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.print();
    }
}
