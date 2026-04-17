#include <iostream>
using namespace std;

class Point {
private:
    float x, y;

public:
    Point(float xVal = 0, float yVal = 0) {
        x = xVal;
        y = yVal;
    }

    void display() {
        cout << "(" << x << ", " << y << ")";
    }

    float getX() { return x; }
    float getY() { return y; }
};

class Circle {
private:
    float radius;
    Point center;

public:
    Circle(float r, float x, float y) : center(x, y) {
        radius = r;
    }

    float area() {
        return 3.14159 * radius * radius;
    }

    void display() {
        cout << "Center: ";
        center.display();
        cout << endl;
        cout << "Radius: " << radius << endl;
        cout << "Area: " << area() << endl;
    }
};

int main() {
    Circle c(5, 2, 3);
    c.display();
    return 0;
}
