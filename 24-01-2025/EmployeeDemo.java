
class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int bonus;

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Bonus: " + bonus);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee("John", 50000);
        Manager m = new Manager("Alice", 80000, 20000);
        e.showDetails();
        m.showDetails();
    }
}
