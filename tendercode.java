import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    void setData(double c, String name) {
        cost = c;
        companyName = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            double cost = sc.nextDouble();
            sc.nextLine();
            String name = sc.nextLine();
            t[i].setData(cost, name);
        }

        double minCost = t[0].cost;
        String minCompany = t[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].companyName;
            }
        }

        System.out.println("Company with minimum cost: " + minCompany);
    }
}
