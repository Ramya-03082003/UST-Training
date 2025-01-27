
class BankAccount {
    void calculateInterest() {
        System.out.println("Calculating interest for a general account");
    }
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Calculating interest for a savings account");
    }
}

class FixedDepositAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Calculating interest for a fixed deposit account");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount();
        BankAccount b2 = new FixedDepositAccount();
        b1.calculateInterest();
        b2.calculateInterest();
    }
}
