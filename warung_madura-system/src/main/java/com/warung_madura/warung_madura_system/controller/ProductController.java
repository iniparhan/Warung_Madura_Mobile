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
