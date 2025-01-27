
class Game {
    void start() {
        System.out.println("Starting a generic game");
    }
}

class Football extends Game {
    void start() {
        System.out.println("Starting a football game");
    }
}

class Chess extends Game {
    void start() {
        System.out.println("Starting a chess game");
    }
}

public class GameDemo {
    public static void main(String[] args) {
        Game g1 = new Football();
        Game g2 = new Chess();
        g1.start();
        g2.start();
    }
}
