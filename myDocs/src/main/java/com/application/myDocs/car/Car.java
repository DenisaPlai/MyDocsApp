package com.application.myDocs.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.application.myDocs.civilAutoLiability.CivilAutoLiability;
import com.application.myDocs.driver.Driver;
import com.application.myDocs.roadVignette.RoadVignette;
import com.application.myDocs.roadworthinessCertificate.RoadworthinessCertificate;
import com.application.myDocs.vehicleIdentityCard.VehicleIdentityCard;
import com.application.myDocs.vehicleRegistrationCertificate.VehicleRegistrationCertificate;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "car", schema = "administration")
public class Car {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "registration_no")
	private String registrationNo;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private VehicleRegistrationCertificate vehicleRegistrationCertificate;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private RoadworthinessCertificate roadworthinessCertificate;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private CivilAutoLiability civilAutoLiability;

	@OneToMany(mappedBy = "car", fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, orphanRemoval = true)
	private List<RoadVignette> roadVignettes = new ArrayList<>();

	@JsonIgnore
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "driver_car", schema = "administration", joinColumns = @JoinColumn(name = "driver_id"), inverseJoinColumns = @JoinColumn(name = "car_id"))
	private Set<Driver> drivers;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private VehicleIdentityCard vehicleIdentityCard;

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

	public VehicleRegistrationCertificate getVehicleRegistrationCertificate() {
		return vehicleRegistrationCertificate;
	}

	public void setVehicleRegistrationCertificate(VehicleRegistrationCertificate vehicleRegistrationCertificate) {
		this.vehicleRegistrationCertificate = vehicleRegistrationCertificate;
	}

	public RoadworthinessCertificate getRoadworthinessCertificate() {
		return roadworthinessCertificate;
	}

	public void setRoadworthinessCertificate(RoadworthinessCertificate roadworthinessCertificate) {
		this.roadworthinessCertificate = roadworthinessCertificate;
	}

	public CivilAutoLiability getCivilAutoLiability() {
		return civilAutoLiability;
	}

	public void setCivilAutoLiability(CivilAutoLiability civilAutoLiability) {
		this.civilAutoLiability = civilAutoLiability;
	}

	public VehicleIdentityCard getVehicleIdentityCard() {
		return vehicleIdentityCard;
	}

	public void setVehicleIdentityCard(VehicleIdentityCard vehicleIdentityCard) {
		this.vehicleIdentityCard = vehicleIdentityCard;
	}

	public List<RoadVignette> getRoadVignettes() {
		return roadVignettes;
	}

	public void setRoadVignettes(List<RoadVignette> roadVignettes) {
		this.roadVignettes = roadVignettes;
	}

	public Set<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(Set<Driver> drivers) {
		this.drivers = drivers;
	}

	public void addDriver(Driver driver) {
		this.drivers.add(driver);
		driver.getCars().add(this);
	}

}
