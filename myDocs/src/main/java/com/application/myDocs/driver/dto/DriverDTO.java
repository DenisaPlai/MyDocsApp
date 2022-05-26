package com.application.myDocs.driver.dto;

import com.application.myDocs.drivingLicense.DrivingLicense;
import com.application.myDocs.identityCard.IdentityCard;

public class DriverDTO {

	private Integer id;
	private IdentityCard identityCard;
	private DrivingLicense drivingLicense;
	private Integer totalPenaltyPoints;
	private boolean unpaidFines;
	private boolean expiredDocuments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public IdentityCard getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(IdentityCard identityCard) {
		this.identityCard = identityCard;
	}

	public DrivingLicense getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(DrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
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
