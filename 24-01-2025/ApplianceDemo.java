
class Appliance {
    void operate() {
        System.out.println("Operating a generic appliance");
    }
}

class WashingMachine extends Appliance {
    void operate() {
        System.out.println("Operating a washing machine");
    }
}

class Refrigerator extends Appliance {
    void operate() {
        System.out.println("Operating a refrigerator");
    }
}

public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance a1 = new WashingMachine();
        Appliance a2 = new Refrigerator();
        a1.operate();
        a2.operate();
    }
}
