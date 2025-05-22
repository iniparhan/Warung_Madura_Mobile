import java.util.List;

public interface ReportGenerator {
    Report generateReport(List<Transaction> transactions);
}