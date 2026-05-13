interface BankInterface {
    void displayBank();
}

class Customer {
    String name = "Rahul";

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
    }
}

class Account extends Customer implements BankInterface {
    int accNo = 12345;
    double balance = 5000;

    public void displayBank() {
        System.out.println("Bank: State Bank");
    }

    void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account a = new Account();

        a.displayBank();
        a.displayCustomer();
        a.displayAccount();
    }
}