import java.util.Date;
import java.util.List;

public class Report implements ReportGenerator {
    private String reportId;
    private List<Transaction> transactions;
    private Date reportDate;
    private double totalSales;

    public Report(String reportId, List<Transaction> transactions, Date reportDate) {
        this.reportId = reportId;
        this.transactions = transactions;
        this.reportDate = reportDate;
        this.totalSales = summarize();
    }

    public double summarize() {
        double sum = 0;
        for (Transaction t : transactions) {
            sum += t.calculateTotal();
        }
        return sum;
    }

    @Override
    public Report generateReport(List<Transaction> transactions) {
        return new Report("REP" + System.currentTimeMillis(), transactions, new Date());
    }
}