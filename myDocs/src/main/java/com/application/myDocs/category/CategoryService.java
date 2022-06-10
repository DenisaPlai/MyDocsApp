package com.application.myDocs.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.myDocs.drivingLicense.DrivingLicense;
import com.application.myDocs.drivingLicense.DrivingLicenseService;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private DrivingLicenseService drivingLicenseService;

	public Category createCategory(Category category) {
		return categoryRepository.saveAndFlush(category);
	}

	public void deleteCategoryById(Integer id) {
		categoryRepository.deleteById(id);
	}

	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	public Category createCategory(Category category, Integer drivingLicenseID) {
		DrivingLicense drivingLicense = drivingLicenseService.getDrivingLicense(drivingLicenseID);
		category.addDrivingLicense(drivingLicense);
		return categoryRepository.save(category);
	}

}
