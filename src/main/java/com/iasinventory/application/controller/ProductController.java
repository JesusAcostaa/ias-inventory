package com.iasinventory.application.controller;

import com.iasinventory.domain.models.Product;
import com.iasinventory.domain.models.ProductDetail;
import com.iasinventory.domain.usecase.service.ProductDetailImpl;
import com.iasinventory.domain.usecase.service.ProductDetailService;
import com.iasinventory.domain.usecase.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/iasinventory/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductDetailService productDetailService;

    @GetMapping("/getall")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


    public ProductDetail createProductDetail(@PathVariable Long id, @RequestBody ProductDetail productDetail){
        return productDetailService.createDetailProduct(productDetail,id);
    }
    @PostMapping("/delete/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProduct(id);
    }



}
