package com.application.myDocs.civilAutoLiability.dto;

import java.time.LocalDate;

import com.application.myDocs.carCategory.CarCategory;
import com.application.myDocs.territorialValidity.TerritorialValidity;

public class CivilAutoLiabilityDTO {
	private Integer id;
	private LocalDate validFrom;
	private LocalDate validTo;
	private String issuedBy;
	private String registrationNo;
	private TerritorialValidity countryCode;
	private String number;
	private String series;
	private CarCategory vehicleCategory;
	private String makeOfVehicle;
	private TerritorialValidity territorialValidity;
	private Integer limitCompensationForMaterialDamage;
	private Integer limitCompensationForPersonalInjury;
	private String observation;
	private Integer price;

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

	public CarCategory getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(CarCategory vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
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

}
