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
