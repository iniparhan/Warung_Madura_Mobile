import java.util.Date;
import java.util.List;

public class Transaction {
    private String transactionId;
    private Cashier cashier;
    private List<Product> productList;
    private double totalAmount;
    private Date transactionDate;

    public Transaction(String transactionId, Cashier cashier, List<Product> productList, Date transactionDate) {
        this.transactionId = transactionId;
        this.cashier = cashier;
        this.productList = productList;
        this.transactionDate = transactionDate;
        this.totalAmount = calculateTotal();
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }
}