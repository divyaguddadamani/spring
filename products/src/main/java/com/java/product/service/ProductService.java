package com.java.product.service;

import com.java.product.dto.ProductDto;

public interface ProductService {
    boolean saveAndValid(ProductDto dto);
}
