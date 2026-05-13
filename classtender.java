import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    void input(String name, double c) {
        companyName = name;
        cost = c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender t[] = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();

            System.out.print("Enter company name: ");
            String name = sc.next();

            System.out.print("Enter cost: ");
            double cost = sc.nextDouble();

            t[i].input(name, cost);
        }

        double min = t[0].cost;
        String company = t[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                company = t[i].companyName;
            }
        }

        System.out.println("Company with minimum cost: " + company);

        sc.close();
    }
}