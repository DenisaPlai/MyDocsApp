package com.application.myDocs.civilAutoLiability;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.application.myDocs.car.Car;
import com.application.myDocs.carCategory.CarCategory;
import com.application.myDocs.territorialValidity.TerritorialValidity;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "civil_auto_liability", schema = "administration")
public class CivilAutoLiability {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "valid_from")
	private LocalDate validFrom;

	@Column(name = "valid_to")
	private LocalDate validTo;

	@Column(name = "issued_by")
	private String issuedBy;

	@Column(name = "registration_no")
	private String registrationNo;

	@Enumerated(EnumType.STRING)
	@Column(name = "country_code")
	private TerritorialValidity countryCode;

	@Column(name = "number")
	private String number;

	@Column(name = "series")
	private String series;

	@Enumerated(EnumType.STRING)
	@Column(name = "vehicle_category")
	private CarCategory vehicleCategory;

	@Column(name = "make_of_vehicle")
	private String makeOfVehicle;

	@Enumerated(EnumType.STRING)
	@Column(name = "territorial_validity")
	private TerritorialValidity territorialValidity;

	@Column(name = "limit_compensation_for_material_damage")
	private Integer limitCompensationForMaterialDamage;

	@Column(name = "limit_compensation_for_personal_injury")
	private Integer limitCompensationForPersonalInjury;

	@Column(name = "observation")
	private String observation;

	@Column(name = "price")
	private Integer price;

	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "car_id")
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTo() {
		return validTo;
	}

	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public TerritorialValidity getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(TerritorialValidity countryCode) {
		this.countryCode = countryCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getMakeOfVehicle() {
		return makeOfVehicle;
	}

	public void setMakeOfVehicle(String makeOfVehicle) {
		this.makeOfVehicle = makeOfVehicle;
	}

	public TerritorialValidity getTerritorialValidity() {
		return territorialValidity;
	}

	public void setTerritorialValidity(TerritorialValidity territorialValidity) {
		this.territorialValidity = territorialValidity;
	}

	public Integer getLimitCompensationForMaterialDamage() {
		return limitCompensationForMaterialDamage;
	}

	public void setLimitCompensationForMaterialDamage(Integer limitCompensationForMaterialDamage) {
		this.limitCompensationForMaterialDamage = limitCompensationForMaterialDamage;
	}

	public Integer getLimitCompensationForPersonalInjury() {
		return limitCompensationForPersonalInjury;
	}

	public void setLimitCompensationForPersonalInjury(Integer limitCompensationForPersonalInjury) {
		this.limitCompensationForPersonalInjury = limitCompensationForPersonalInjury;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public CarCategory getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(CarCategory vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public void addCar(Car car2) {
		this.car = car2;
		car2.setCivilAutoLiability(this);
	}

}
