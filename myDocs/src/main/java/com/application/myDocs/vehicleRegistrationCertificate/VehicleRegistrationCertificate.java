package com.application.myDocs.vehicleRegistrationCertificate;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.application.myDocs.categoryEnum.CarCategory;

@Entity
@Table(name = "vehicle_registration certificate", schema = "administration")
public class VehicleRegistrationCertificate {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "registration_no")
	private String registrationNo;

	@Enumerated(EnumType.STRING)
	@Column(name = "category_id")
	private CarCategory categoryId;

	@Column(name = "mark")
	private String mark;

	@Column(name = "model")
	private String model;

	@Column(name = "type")
	private String type;

	@Column(name = "vin")
	private String vin;

	@Column(name = "type_approval_no")
	private String typeApprovalNo;

	@Column(name = "max_permissible_mass")
	private Integer maxPermissibleMass;

	@Column(name = "cylinder_capacity")
	private Integer cylinderCapacity;

	@Column(name = "fuel_type")
	private String fuelType;

	@Column(name = "color")
	private String color;

	@Column(name = "seats_no")
	private Integer seatsNo;

	@Column(name = "standing_places_no")
	private Integer standingPlacesNo;

	@Column(name = "suspended")
	private boolean suspended;

	@Column(name = "max_power")
	private Integer maxPower;

	@Column(name = "mass_in_service")
	private Integer massInService;

	@Column(name = "first_registration_date")
	private LocalDate firstRegistrationDate;

	@Column(name = "date_of_issue")
	private LocalDate dateOfIssue;

	@Column(name = "expiration_date")
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
