package com.application.myDocs.category.mapper;

import org.springframework.stereotype.Component;

import com.application.myDocs.category.Category;
import com.application.myDocs.category.dto.CategoryDTO;

@Component
public class CategoryMapper {

	public Category categoryDTO2Category(CategoryDTO categoryDTO) {
		Category category = new Category();
		category.setId(categoryDTO.getId());
		category.setCode(categoryDTO.getCode());
		category.setIssuedDate(categoryDTO.getIssuedDate());
		category.setExpirationDate(categoryDTO.getExpirationDate());
		return category;
	}

	public CategoryDTO category2CategoryDTO(Category category) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setCode(category.getCode());
		categoryDTO.setIssuedDate(category.getIssuedDate());
		categoryDTO.setExpirationDate(category.getExpirationDate());
		return categoryDTO;
	}
}
