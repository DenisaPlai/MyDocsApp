package com.application.myDocs.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.category.dto.CategoryDTO;
import com.application.myDocs.category.mapper.CategoryMapper;

@RestController
@RequestMapping("categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CategoryMapper categoryMapper;

	@PostMapping
	private CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO) {
		Category category = categoryService.createCategory(categoryMapper.categoryDTO2Category(categoryDTO));
		return categoryMapper.category2CategoryDTO(category);
	}

	@DeleteMapping("/{id}")
	public void deleteCategoryById(@PathVariable Integer id) {
		categoryService.deleteCategoryById(id);
	}
}
