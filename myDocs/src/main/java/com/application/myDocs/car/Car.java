package com.application.myDocs.car;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

@Entity
@Table(name = "car", schema = "administration")
public class Car {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private VehicleRegistrationCertificate vehicleRegistrationCertificate;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private RoadworthinessCertificate roadworthinessCertificate;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private CivilAutoLiability civilAutoLiability;

	@OneToMany(mappedBy = "car", fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, orphanRemoval = true)
	private List<RoadVignette> roadVignettes = new ArrayList<>();

	@ManyToMany(mappedBy = "cars")
	private List<Driver> drivers = new ArrayList<>();

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "car")
	private VehicleIdentityCard vehicleIdentityCard;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	// add a road vignette to a car
	public void addRoadVignette(RoadVignette roadVignette) {
		this.roadVignettes.add(roadVignette);
		roadVignette.setCar(this);
	}

	// delete a road vignette from a car
	public void removeRoadVignette(RoadVignette roadVignette) {
		this.roadVignettes.remove(roadVignette);
		roadVignette.setCar(null);
	}
}
