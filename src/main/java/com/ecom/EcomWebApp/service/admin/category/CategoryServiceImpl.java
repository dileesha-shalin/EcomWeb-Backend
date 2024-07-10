package com.ecom.EcomWebApp.service.admin.category;

import com.ecom.EcomWebApp.dto.CategoryDto;
import com.ecom.EcomWebApp.entity.Category;
import com.ecom.EcomWebApp.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public Category createCategory(CategoryDto categoryDto){
        Category category=new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return categoryRepository.save(category);
    }
}
