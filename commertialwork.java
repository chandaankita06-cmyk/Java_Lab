interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    private double lastSaleAmount;
    private String lastClientName;
    private boolean saleProcessed = false;
    private boolean invoiceGenerated = false;

    @Override
    public void processSale(double amount) {
        this.lastSaleAmount = amount;
        this.saleProcessed = true;
        System.out.println("Sale Amount: ₹" + amount);
        System.out.println("Sale processed successfully.");
    }

    @Override
    public void generateInvoice(String clientName, double amount) {
        this.lastClientName = clientName;
        this.invoiceGenerated = true;
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: ₹" + amount);
        System.out.println("Invoice generated successfully.");
    }

    public void showSummary() {
        System.out.println("\nSummary:");
        if (saleProcessed && invoiceGenerated) {
            System.out.println("All commercial operations completed successfully.");
        } else {
            System.out.println("Operations pending.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("
        CommercialExecutive executive = new CommercialExecutive();
        
        executive.processSale(10000.0);
        executive.generateInvoice("ABC Pvt 
        executive.showSummary();
    }
}