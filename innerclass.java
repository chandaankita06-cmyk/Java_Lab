class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x = " + x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();

        obj2.display();
    }
}