package com.ecom.EcomWebApp.service.admin.category;

import com.ecom.EcomWebApp.dto.CategoryDto;
import com.ecom.EcomWebApp.entity.Category;

public interface CategoryService {

    Category createCategory(CategoryDto categoryDto);
}
