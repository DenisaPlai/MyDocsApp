package com.application.myDocs.vehicleRegistrationCertificate.dto;

import java.time.LocalDate;

import com.application.myDocs.carCategory.CarCategory;

public class VehicleRegistrationCertificateDTO {

	private Integer id;
	private String registrationNo;
	private CarCategory categoryId;
	private String mark;
	private String model;
	private String type;
	private String vin;
	private String typeApprovalNo;
	private Integer maxPermissibleMass;
	private Integer cylinderCapacity;
	private String fuelType;
	private String color;
	private Integer seatsNo;
	private Integer standingPlacesNo;
	private boolean suspended = false;
	private Integer maxPower;
	private Integer massInService;
	private LocalDate firstRegistrationDate;
	private LocalDate dateOfIssue;
	private LocalDate expirationDate;

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

	public CarCategory getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(CarCategory categoryId) {
		this.categoryId = categoryId;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getTypeApprovalNo() {
		return typeApprovalNo;
	}

	public void setTypeApprovalNo(String typeApprovalNo) {
		this.typeApprovalNo = typeApprovalNo;
	}

	public Integer getMaxPermissibleMass() {
		return maxPermissibleMass;
	}

	public void setMaxPermissibleMass(Integer maxPermissibleMass) {
		this.maxPermissibleMass = maxPermissibleMass;
	}

	public Integer getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(Integer cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSeatsNo() {
		return seatsNo;
	}

	public void setSeatsNo(Integer seatsNo) {
		this.seatsNo = seatsNo;
	}

	public Integer getStandingPlacesNo() {
		return standingPlacesNo;
	}

	public void setStandingPlacesNo(Integer standingPlacesNo) {
		this.standingPlacesNo = standingPlacesNo;
	}

	public boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}

	public Integer getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(Integer maxPower) {
		this.maxPower = maxPower;
	}

	public Integer getMassInService() {
		return massInService;
	}

	public void setMassInService(Integer massInService) {
		this.massInService = massInService;
	}

	public LocalDate getFirstRegistrationDate() {
		return firstRegistrationDate;
	}

	public void setFirstRegistrationDate(LocalDate firstRegistrationDate) {
		this.firstRegistrationDate = firstRegistrationDate;
	}

	public LocalDate getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(LocalDate dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

}
