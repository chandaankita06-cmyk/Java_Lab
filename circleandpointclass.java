class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point p;
    double radius;

    Circle(int x, int y, double radius) {
        p = new Point(x, y);
        this.radius = radius;
    }

    void display() {
        double area = 3.14 * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Point X = " + p.x);
        System.out.println("Point Y = " + p.y);
        System.out.println("Area = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(4, 5, 7);

        c.display();
    }
}