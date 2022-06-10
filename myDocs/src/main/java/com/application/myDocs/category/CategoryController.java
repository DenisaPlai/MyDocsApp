package com.application.myDocs.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.myDocs.category.dto.CategoryCreateDTO;
import com.application.myDocs.category.dto.CategoryDTO;
import com.application.myDocs.category.mapper.CategoryMapper;

@RestController
@RequestMapping("/categories")
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

	@GetMapping("/list")
	public List<CategoryDTO> getAllCategory() {
		return categoryMapper.categoryList2CategoryListDTO(categoryService.getAllCategory());
	}

	@PostMapping("/with-drivingLicense")
	public CategoryDTO createCategoryWithDrivingLicense(@RequestBody CategoryCreateDTO categoryCreateDTO) {
		Category createCategory = categoryService.createCategory(
				categoryMapper.categoryCreateDTO2Category(categoryCreateDTO), categoryCreateDTO.getDrivingLicenseID());
		return categoryMapper.category2CategoryDTO(createCategory);
	}
}
