interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Winter Mango is sweet");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Summer Mango is very juicy");
    }
}

public class Main {
    public static void main(String[] args) {
        Winter w = new Winter();
        Summer s = new Summer();

        w.taste();
        s.taste();
    }
}