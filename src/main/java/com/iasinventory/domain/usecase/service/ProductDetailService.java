package com.iasinventory.domain.usecase.service;

import com.iasinventory.domain.models.ProductDetail;

public interface ProductDetailService {

    ProductDetail createDetailProduct(ProductDetail productDetail, Long id);

    ProductDetail getDetailById(Long id);
}
