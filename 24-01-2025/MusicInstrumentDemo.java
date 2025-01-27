
class Instrument {
    void play() {
        System.out.println("Playing a generic instrument");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Strumming the guitar");
    }
}

class Piano extends Instrument {
    void play() {
        System.out.println("Playing the piano");
    }
}

public class MusicInstrumentDemo {
    public static void main(String[] args) {
        Instrument i1 = new Guitar();
        Instrument i2 = new Piano();
        i1.play();
        i2.play();
    }
}
