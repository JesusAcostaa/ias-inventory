package com.iasinventory.domain.usecase.service;

import com.iasinventory.domain.models.Product;
import com.iasinventory.domain.models.ProductDetail;
import com.iasinventory.infraestructure.repository.ProductDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductDetailImpl implements ProductDetailService {

    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Override
    public ProductDetail createDetailProduct(ProductDetail productDetail, Long id) {
        return productDetailRepository.save(productDetail);
    }

    @Override
    public ProductDetail getDetailById(Long id) {
        return null;
    }
}
