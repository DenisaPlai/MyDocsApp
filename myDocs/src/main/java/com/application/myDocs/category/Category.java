package com.application.myDocs.category;

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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.application.myDocs.carCategory.CarCategory;
import com.application.myDocs.drivingLicense.DrivingLicense;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "category", schema = "administration")
public class Category {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "code")
	private CarCategory code;

	@Column(name = "issued_date")
	private LocalDate issuedDate;

	@Column(name = "expiration_date")
	private LocalDate expirationDate;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driving_license_id")
	private DrivingLicense drivingLicense;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarCategory getCode() {
		return code;
	}

	public void setCode(CarCategory code) {
		this.code = code;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public DrivingLicense getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(DrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public void addDrivingLicense(DrivingLicense drivingLicense2) {
		this.drivingLicense = drivingLicense2;
		drivingLicense2.getCategories().add(this);
	}

}
