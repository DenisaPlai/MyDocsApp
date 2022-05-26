package com.application.myDocs.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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

	@Column(name = "identity_card_id")
	private IdentityCard identityCard;

	@Column(name = "driving_license_id")
	private DrivingLicense drivingLicense;

	@Column(name = "total_penalty_points")
	private Integer totalPenaltyPoints;

	@Column(name = "unpaid_fines")
	private boolean unpaidFines;

	@Column(name = "expired_documents")
	private boolean expiredDocuments;

	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Check> ckecks = new ArrayList<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "driver_car", schema = "administration", joinColumns = @JoinColumn(name = "driver_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "car_id", nullable = false))
	private List<Car> cars = new ArrayList<>();

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
		ckeck.setUser(this);
	}

	public void removeCheck(Check ckeck) {
		this.ckecks.remove(ckeck);
		ckeck.setUser(null);
	}
}
