package com.application.myDocs.roadworthinessCertificate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.myDocs.defects.Defects;
import com.application.myDocs.territorialValidity.TerritorialValidity;

@Entity
@Table(name = "roadworthiness_certificate", schema = "administration")
public class RoadworthinessCertificate {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToMany(mappedBy = "roadworthiness_certificate", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Defects> defects = new ArrayList<>();

	@Column(name = "vin_number")
	private String vinNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "country_symbol")
	private TerritorialValidity countrySymbol;

	@Column(name = "registration_no")
	private String registrationNo;

	@Column(name = "place")
	private String place;

	@Column(name = "date")
	private LocalDate date;

	@Column(name = "odometer")
	private Integer odometer;

	@Column(name = "vehicle_class")
	private String vehicleClass;

	@Column(name = "overall_assessment")
	private String overallAssessment;

	@Column(name = "date_of_next_periodical_test")
	private LocalDate dateOfNextPeriodicalTest;

	@Column(name = "inspection_organisation_name")
	private String inspectionOrganisationName;

	@Column(name = "entry_in_the_national_db")
	private String entryInTheNationalDb;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Defects> getDefects() {
		return defects;
	}

	public void setDefects(List<Defects> defects) {
		this.defects = defects;
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

	public String getEntryInTheNationalDb() {
		return entryInTheNationalDb;
	}

	public void setEntryInTheNationalDb(String entryInTheNationalDb) {
		this.entryInTheNationalDb = entryInTheNationalDb;
	}

	public void addDefects(Defects defects) {
		this.defects.add(defects);
		defects.setRoadworthinessCertificate(this);
	}

	public void removeDefects(Defects defects) {
		this.defects.remove(defects);
		defects.setRoadworthinessCertificate(null);
	}

	public String getInspectionOrganisationName() {
		return inspectionOrganisationName;
	}

	public void setInspectionOrganisationName(String inspectionOrganisationName) {
		this.inspectionOrganisationName = inspectionOrganisationName;
	}
}
