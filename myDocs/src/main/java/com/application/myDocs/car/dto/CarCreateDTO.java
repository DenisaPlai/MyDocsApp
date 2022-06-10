package com.application.myDocs.car.dto;

import java.util.Set;

public class CarCreateDTO {

	private Integer id;
	private String registrationNo;
	private Set<Integer> driverIds;

	public Set<Integer> getDriverIds() {
		return driverIds;
	}

	public void setDriverIds(Set<Integer> driverIds) {
		this.driverIds = driverIds;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

}
