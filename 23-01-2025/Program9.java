
// Program9.java - Demonstrates static methods and variables
class MathUtils {
    static int count = 0;

    static int square(int num) {
        count++;
        return num * num;
    }
}

public class Program9 {
    public static void main(String[] args) {
        System.out.println("Square of 4: " + MathUtils.square(4));
        System.out.println("Method called " + MathUtils.count + " times");
    }
}
