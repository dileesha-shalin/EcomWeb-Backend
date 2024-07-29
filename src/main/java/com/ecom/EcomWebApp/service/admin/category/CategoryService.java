package com.ecom.EcomWebApp.service.admin.category;

import com.ecom.EcomWebApp.dto.CategoryDto;
import com.ecom.EcomWebApp.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(CategoryDto categoryDto);
    List<Category> getAllCategories();
}
