package com.example.fakestore.controllers;

import com.example.fakestore.modals.Product;
import com.example.fakestore.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// this controller os capable to host http api's........
@RestController
@RequestMapping("/products")
public class ProductController {
    public class productController {
        private ProductService productService;

        productController(ProductService productService) {
            this.productService = productService;
        }

        @GetMapping("/{id}")
        public Product getProductById(@PathVariable("id") Long id) {
            return productService.getProductById(id);
        }

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

    }
}

