import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String newStr = str.replace('D', 'F');

        System.out.println("Modified String: " + newStr);

        sc.close();
    }
}