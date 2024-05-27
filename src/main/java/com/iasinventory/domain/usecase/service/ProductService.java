package com.iasinventory.domain.usecase.service;

import com.iasinventory.domain.models.Product;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product createProduct(Product product);
}
