import java.util.*;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("A01", "admin01", "adminpass", "Pak Admin");
        Cashier cashier = new Cashier("C01", "kasir01", "kasirpass", "Bu Kasir");

        admin.login();
        cashier.login();

        Product p1 = new Product("P01", "Kopi ABC", 3000, 50, "Minuman");
        Product p2 = new Product("P02", "Indomie Goreng", 2500, 100, "Makanan");

        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.addProduct(p1);
        inventoryManager.addProduct(p2);

        List<Product> transaksiProduk = Arrays.asList(p1, p2);
        SalesManager salesManager = new SalesManager();
        Transaction trx = salesManager.createTransaction(cashier, transaksiProduk);

        List<Transaction> transaksiHariIni = Arrays.asList(trx);
        Report report = new Report("R01", transaksiHariIni, new Date());
        System.out.println("Total penjualan hari ini: Rp " + report.summarize());

        cashier.logout();
        admin.logout();
    }
}