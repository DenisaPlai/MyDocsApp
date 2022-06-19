package com.application.myDocs.driver.dto;

import java.util.ArrayList;
import java.util.List;

import com.application.myDocs.car.Car;
import com.application.myDocs.check.Check;
import com.application.myDocs.drivingLicense.DrivingLicense;
import com.application.myDocs.identityCard.IdentityCard;

public class GetDriverDTO {

	private Integer totalPenaltyPoints;
	private boolean unpaidFines = false;
	private boolean expiredDocuments = false;
	private String cnp;
	private IdentityCard identityCard;
	private DrivingLicense drivingLicense;
	private List<Check> ckecks = new ArrayList<>();
	private List<Car> cars = new ArrayList<>();

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
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

	public List<Check> getCkecks() {
		return ckecks;
	}

	public void setCkecks(List<Check> ckecks) {
		this.ckecks = ckecks;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
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
