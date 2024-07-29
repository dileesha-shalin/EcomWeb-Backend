package com.ecom.EcomWebApp.service.admin.adminProduct;

import com.ecom.EcomWebApp.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {
    ProductDto addProduct(ProductDto productDto) throws IOException;

    List<ProductDto> getAllProducts();
}
