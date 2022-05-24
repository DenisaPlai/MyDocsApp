package com.application.myDocs.civilAutoLiability;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.application.myDocs.category.Category;
import com.application.myDocs.territorialValidity.TerritorialValidity;

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
	private Integer number;

	@Column(name = "series")
	private String series;

	@Enumerated(EnumType.STRING)
	@Column(name = "vehicle_category")
	private Category vehicleCategory;

	@Column(name = "make_of_vehicle")
	private String makeOfVehicle;

	@Column(name = "territorial_validity")
	private List<TerritorialValidity> territorialValidity = new ArrayList<>();

	@Column(name = "limit_compensation_for_material_damage")
	private Integer limitCompensationForMaterialDamage;

	@Column(name = "limit_compensation_for_personal_injury")
	private Integer limitCompensationForPersonalInjury;

	@Column(name = "observation")
	private String observation;

	@Column(name = "price")
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Category getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(Category vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public String getMakeOfVehicle() {
		return makeOfVehicle;
	}

	public void setMakeOfVehicle(String makeOfVehicle) {
		this.makeOfVehicle = makeOfVehicle;
	}

	public List<TerritorialValidity> getTerritorialValidity() {
		return territorialValidity;
	}

	public void setTerritorialValidity(List<TerritorialValidity> territorialValidity) {
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
