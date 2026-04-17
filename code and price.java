import java.util.Scanner;

class Item {
    int code;
    double price;

    void setData(int c, double p) {
        code = c;
        price = p;
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            int code = sc.nextInt();
            double price = sc.nextDouble();
            items[i].setData(code, price);
        }

        System.out.println("Code\tPrice");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        System.out.println("Total Price: " + total);
    }
}
