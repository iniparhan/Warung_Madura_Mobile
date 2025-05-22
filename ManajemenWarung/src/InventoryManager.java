import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void updateStock(Product p, int newStock) {
        p.setStock(newStock);
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }
}