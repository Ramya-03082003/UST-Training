
class Food {
    void eat() {
        System.out.println("Eating generic food");
    }
}

class Pizza extends Food {
    void eat() {
        System.out.println("Eating pizza");
    }
}

class Burger extends Food {
    void eat() {
        System.out.println("Eating burger");
    }
}

public class FoodDemo {
    public static void main(String[] args) {
        Food f1 = new Pizza();
        Food f2 = new Burger();
        f1.eat();
        f2.eat();
    }
}
