package com.application.myDocs.defects.dto;

import com.application.myDocs.carCategory.CarCategory;

public class DefectsCreateDTO {

	private Integer id;
	private CarCategory category;
	private String identifiedDefect;
	private String code;
	private Integer rcId;

	public Integer getRcId() {
		return rcId;
	}

	public void setRcId(Integer carId) {
		this.rcId = carId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarCategory getCategory() {
		return category;
	}

	public void setCategory(CarCategory category) {
		this.category = category;
	}

	public String getIdentifiedDefect() {
		return identifiedDefect;
	}

	public void setIdentifiedDefect(String identifiedDefect) {
		this.identifiedDefect = identifiedDefect;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
