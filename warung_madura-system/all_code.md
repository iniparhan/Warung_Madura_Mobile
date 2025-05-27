# ===== USER =====

package com.warung_madura.warung_madura_system.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {

    protected String username;
    protected String name;
    protected String password;
    protected String role;

    public User(String username, String name, String password, String role) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public abstract void showMenu();
}


# ===== PRODUCT =====

package com.warung_madura.warung_madura_system.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;
    private String unit;
    private double price;
    private int stock;

    public Product(String name, double price, int stock, String unit) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.unit = unit; // satuan produk seperti "botol", "bungkus"
    }
}

# ===== ProductController =====

package com.warung_madura.warung_madura_system.controller;

import com.warung_madura.warung_madura_system.model.Product;
import com.warung_madura.warung_madura_system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{name}")
    public Product updateProduct(@PathVariable String name, @RequestBody Product updatedProduct) {
        return productService.updateProductByName(name, updatedProduct);
    }

    @DeleteMapping("/{name}")
    public void deleteProduct(@PathVariable String name) {
        productService.deleteProductByName(name);
    }
}

# ===== TransactionController =====

package com.warung_madura.warung_madura_system.controller;

import com.warung_madura.warung_madura_system.model.Transaction;
import com.warung_madura.warung_madura_system.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/cashier/{cashierName}")
    public List<Transaction> getTransactionsByCashier(@PathVariable String cashierName) {
        return transactionService.getTransactionsByCashierName(cashierName);
    }

    @GetMapping("/product/{productName}")
    public List<Transaction> getTransactionsByProduct(@PathVariable String productName) {
        return transactionService.getTransactionsByProductName(productName);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
}

# ===== UserController =====

package com.warung_madura.warung_madura_system.controller;

import com.warung_madura.warung_madura_system.model.User;
import com.warung_madura.warung_madura_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public Optional<User> getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{username}")
    public User updateUser(@PathVariable String username, @RequestBody User updatedUser) {
        return userService.updateUserByUsername(username, updatedUser);
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {
        userService.deleteUserByUsername(username);
    }
}

# ===== Admin =====

package com.warung_madura.warung_madura_system.model;

public class Admin extends User {

//  public User(String username, String name, String password, String role)

    public Admin(String id, String name) {
        super(username, name, "Admin");
    }

    @Override
    public void showMenu() {
        System.out.println("Admin Menu: Manage Users, View Reports, etc.");
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }
}

# ===== Cashier =====

package com.warung_madura.warung_madura_system.model;

public class Cashier extends User {

    public Cashier(String username, String name, String password, String role) {
        super(username, name, password, "Cashier");
//        public User(String username, String name, String password, String role) {
}

    @Override
    public void showMenu() {
        System.out.println("Cashier Menu: Process Transactions, Print Receipts.");
    }

    public void processTransaction(Transaction transaction) {
        System.out.println("Processing transaction ID: " + transaction.getId());
    }
}

# ===== InventoryManager =====

package com.warung_madura.warung_madura_system.model;

public class InventoryManager extends User {

    public InventoryManager(String id, String name) {
        super(id, name, "InventoryManager");
    }

    @Override
    public void showMenu() {
        System.out.println("Inventory Manager Menu: Add Product, Update Stock.");
    }

    public void addProduct(Product product) {
        System.out.println("Adding product: " + product.getName());
    }
}

# ===== MinimarketApplication =====

package com.warung_madura.warung_madura_system.model;

public class MinimarketApplication {
public static void main(String[] args) {
Admin admin = new Admin("A1", "Admin One");
admin.showMenu();
admin.manageUsers();

        Cashier cashier = new Cashier("C1", "Cashier One");
        cashier.showMenu();

        Product product = new Product("P1", "Snack", 10.0, 100);
        Transaction transaction = new Transaction("T1", product, 2, new java.util.Date());
        cashier.processTransaction(transaction);
    }
}

# ===== Report =====

package com.warung_madura.warung_madura_system.model;

public class Report {
private String title;
private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

# ===== ReportGenerator =====

package com.warung_madura.warung_madura_system.model;

public class ReportGenerator {
public Report generateSalesReport() {
return new Report("Sales Report", "Total sales: 100 units.");
}

    public Report generateInventoryReport() {
        return new Report("Inventory Report", "All products in stock.");
    }
}

# ===== SalesManager =====

package com.warung_madura.warung_madura_system.model;

public class SalesManager extends User {

    public SalesManager(String id, String name) {
        super(id, name, "SalesManager");
    }

    @Override
    public void showMenu() {
        System.out.println("Sales Manager Menu: View Sales, Generate Reports.");
    }

    public void viewSales() {
        System.out.println("Viewing sales data...");
    }
}

# ===== Transaction =====

package com.warung_madura.warung_madura_system.model;

import java.util.Date;

public class Transaction {
private String id;
private Product product;
private int quantity;
private Date date;

    public Transaction(String id, Product product, int quantity, Date date) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }
}

# ===== UserManager =====

package com.warung_madura.warung_madura_system.model;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String username) {
        users.removeIf(u -> u.getUsername().equals(username));
    }

    public User getUserByUser(String username) {
        return users.stream().filter(u -> u.getUsername().equals(username)).findFirst().orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }
}

// userService.updateUserByUsername(username, updatedUser);

// userService.deleteUserByUsername(username);

# ===== ProductRepository =====

package com.warung_madura.warung_madura_system.repository;

import com.warung_madura.warung_madura_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface
ProductRepository extends JpaRepository<Product, Long> {
Optional<Product> findByName(String name);
}

# ===== TransactionRepository =====

package com.warung_madura.warung_madura_system.repository;

import com.warung_madura.warung_madura_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
List<Transaction> findByCashierName(String cashierName);
List<Transaction> findByProductName(String productName);
}

# ===== UserRepository =====

package com.warung_madura.warung_madura_system.repository;

import com.warung_madura.warung_madura_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
Optional<User> findByUsername(String username);
}

# ===== ProductService =====

package com.warung_madura.warung_madura_system.service;

import com.warung_madura.warung_madura_system.model.Product;
import com.warung_madura.warung_madura_system.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductByName(String name) {
        return productRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Product not found: " + name));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProductByName(String name, Product updatedProduct) {
        Product product = productRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Product not found: " + name));

        product.setPrice(updatedProduct.getPrice());
        product.setStock(updatedProduct.getStock());
        return productRepository.save(product);
    }

    public void deleteProductByName(String name) {
        productRepository.findByName(name)
                .ifPresent(productRepository::delete);
    }
}

# ===== TransactionService =====

package com.warung_madura.warung_madura_system.service;

import com.warung_madura.warung_madura_system.model.Transaction;
import com.warung_madura.warung_madura_system.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public List<Transaction> getTransactionsByCashierName(String cashierName) {
        return transactionRepository.findByCashierName(cashierName);
    }

    public List<Transaction> getTransactionsByProductName(String productName) {
        return transactionRepository.findByProductName(productName);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}

# ===== UserService =====

package com.warung_madura.warung_madura_system.service;

import com.warung_madura.warung_madura_system.model.User;
import com.warung_madura.warung_madura_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }



    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String username, User userDetails) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found with username " + username));

        user.setPassword(userDetails.getPassword());
        user.setRole(userDetails.getRole());
        // jika ada field lain, update di sini

        return userRepository.save(user);
    }

    public void deleteUser(String username) {
        Optional<User> userOpt = userRepository.findByUsername(username);
        if (userOpt.isPresent()) {
            userRepository.delete(userOpt.get());
        } else {
            throw new RuntimeException("User not found with username " + username);
        }
    }
}

# ===== WarungMaduraSystemApplication =====

package com.warung_madura.warung_madura_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarungMaduraSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarungMaduraSystemApplication.class, args);
	}

}

# ===== application.properties =====

spring.application.name=Warung Madura System

spring.datasource.url=jdbc:mysql://localhost:3306/warung_madura?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

server.port=8080
