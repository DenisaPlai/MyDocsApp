package com.application.myDocs.category.dto;

import java.time.LocalDate;

import com.application.myDocs.carCategory.CarCategory;

public class CategoryDTO {

	private Integer id;
	private CarCategory code;
	private LocalDate issuedDate;
	private LocalDate expirationDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarCategory getCode() {
		return code;
	}

	public void setCode(CarCategory code) {
		this.code = code;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

}
