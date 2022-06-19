package com.application.myDocs.driver;

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

import com.application.myDocs.car.Car;
import com.application.myDocs.check.Check;
import com.application.myDocs.drivingLicense.DrivingLicense;
import com.application.myDocs.identityCard.IdentityCard;

@Entity
@Table(name = "driver", schema = "administration")
public class Driver {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "driver")
	private IdentityCard identityCard;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "driver")
	private DrivingLicense drivingLicense;

	@Column(name = "total_penalty_points")
	private Integer totalPenaltyPoints;

	@Column(name = "unpaid_fines")
	private boolean unpaidFines = false;

	@Column(name = "expired_documents")
	private boolean expiredDocuments = false;

	@Column(name = "cnp")
	private String cnp;

	@OneToMany(mappedBy = "driver", fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, orphanRemoval = true)
	private List<Check> ckecks = new ArrayList<>();

	@ManyToMany(mappedBy = "drivers")
	private List<Car> cars = new ArrayList<>();

	
	
	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public IdentityCard getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(IdentityCard identityCard) {
		this.identityCard = identityCard;
	}

	public DrivingLicense getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(DrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public Integer getTotalPenaltyPoints() {
		return totalPenaltyPoints;
	}

	public void setTotalPenaltyPoints(Integer totalPenaltyPoints) {
		this.totalPenaltyPoints = totalPenaltyPoints;
	}

	public boolean isUnpaidFines() {
		return unpaidFines;
	}

	public void setUnpaidFines(boolean unpaidFines) {
		this.unpaidFines = unpaidFines;
	}

	public boolean isExpiredDocuments() {
		return expiredDocuments;
	}

	public void setExpiredDocuments(boolean expiredDocuments) {
		this.expiredDocuments = expiredDocuments;
	}

	public List<Check> getCkecks() {
		return ckecks;
	}

	public void setCkecks(List<Check> ckecks) {
		this.ckecks = ckecks;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public void addCheck(Check ckeck) {
		this.ckecks.add(ckeck);
		ckeck.setDriver(this);
	}
}
