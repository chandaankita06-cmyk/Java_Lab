class Demo {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}