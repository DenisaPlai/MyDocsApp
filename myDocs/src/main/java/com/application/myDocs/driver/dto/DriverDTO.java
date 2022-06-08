package com.application.myDocs.driver.dto;

public class DriverDTO {

	private Integer id;
	private Integer totalPenaltyPoints;
	private boolean unpaidFines = false;
	private boolean expiredDocuments = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalPenaltyPoints() {
		return totalPenaltyPoints;
	}

	public void setTotalPenaltyPoints(Integer totalPenaltyPoints) {
		this.totalPenaltyPoints = totalPenaltyPoints;
	}

	public boolean isUnpaidFines() {
		return unpaidFines;
	}

	public void setUnpaidFines(boolean unpaidFines) {
		this.unpaidFines = unpaidFines;
	}

	public boolean isExpiredDocuments() {
		return expiredDocuments;
	}

	public void setExpiredDocuments(boolean expiredDocuments) {
		this.expiredDocuments = expiredDocuments;
	}

}
