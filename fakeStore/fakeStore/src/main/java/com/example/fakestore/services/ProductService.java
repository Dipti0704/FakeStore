package com.example.fakestore.services;

import com.example.fakestore.modals.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
