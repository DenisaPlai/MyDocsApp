package com.application.myDocs.roadworthinessCertificate.dto;

import java.time.LocalDate;

import com.application.myDocs.territorialValidity.TerritorialValidity;

public class RoadworthinessCertificateDTO {

	private Integer id;
	private String vinNumber;
	private TerritorialValidity countrySymbol;
	private String registrationNo;
	private String place;
	private LocalDate date;
	private Integer odometer;
	private String vehicleClass;
	private String overallAssessment;
	private LocalDate dateOfNextPeriodicalTest;
	private String inspectionOrganisationName;
	private String entryInTheNationalDb;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public TerritorialValidity getCountrySymbol() {
		return countrySymbol;
	}

	public void setCountrySymbol(TerritorialValidity countrySymbol) {
		this.countrySymbol = countrySymbol;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getOdometer() {
		return odometer;
	}

	public void setOdometer(Integer odometer) {
		this.odometer = odometer;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getOverallAssessment() {
		return overallAssessment;
	}

	public void setOverallAssessment(String overallAssessment) {
		this.overallAssessment = overallAssessment;
	}

	public LocalDate getDateOfNextPeriodicalTest() {
		return dateOfNextPeriodicalTest;
	}

	public void setDateOfNextPeriodicalTest(LocalDate dateOfNextPeriodicalTest) {
		this.dateOfNextPeriodicalTest = dateOfNextPeriodicalTest;
	}

	public String getInspectionOrganisationName() {
		return inspectionOrganisationName;
	}

	public void setInspectionOrganisationName(String inspectionOrganisationName) {
		this.inspectionOrganisationName = inspectionOrganisationName;
	}

	public String getEntryInTheNationalDb() {
		return entryInTheNationalDb;
	}

	public void setEntryInTheNationalDb(String entryInTheNationalDb) {
		this.entryInTheNationalDb = entryInTheNationalDb;
	}

}
