package com.iasinventory.domain.usecase.service;

import com.iasinventory.domain.models.Product;
import com.iasinventory.domain.models.ProductDetail;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product createProduct(Product product);

    void deleteProduct(Long id);
}
