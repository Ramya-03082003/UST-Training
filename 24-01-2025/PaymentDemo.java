
class Payment {
    void processPayment() {
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends Payment {
    void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

class PayPalPayment extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        p1.processPayment();
        p2.processPayment();
    }
}
