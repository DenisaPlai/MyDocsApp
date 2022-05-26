package com.application.myDocs.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category createCategory(Category category) {
		return categoryRepository.saveAndFlush(category);
	}

	public void deleteCategoryById(Integer id) {
		categoryRepository.deleteById(id);
	}

}
