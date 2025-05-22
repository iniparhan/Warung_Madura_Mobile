import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesManager {
    private List<Transaction> transactions = new ArrayList<>();

    public Transaction createTransaction(Cashier cashier, List<Product> products) {
        Transaction t = new Transaction("TRX" + System.currentTimeMillis(), cashier, products, new Date());
        transactions.add(t);
        return t;
    }
}