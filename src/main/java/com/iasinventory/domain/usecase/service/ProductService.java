package com.iasinventory.domain.usecase.service;

import com.iasinventory.domain.models.Product;
import com.iasinventory.domain.models.ProductDetail;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    List<Product> getAllProducts();

    Product createProduct(Product product);
}
