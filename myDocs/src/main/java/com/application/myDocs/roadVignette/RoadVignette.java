package com.application.myDocs.roadVignette;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.application.myDocs.car.Car;
import com.application.myDocs.territorialValidity.TerritorialValidity;

@Entity
@Table(name = "road_vignette", schema = "administration")
public class RoadVignette {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "territorial_validity")
	private TerritorialValidity territorialValidity;

	@Column(name = "issued_date")
	private LocalDate issuedDate;

	@Column(name = "expiration_date")
	private LocalDate expirationDate;

	@Column(name = "registration_no")
	private String registrationNo;

	@ManyToOne()
	@JoinColumn(name = "car_id")
	private Car car;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TerritorialValidity getTerritorialValidity() {
		return territorialValidity;
	}

	public void setTerritorialValidity(TerritorialValidity territorialValidity) {
		this.territorialValidity = territorialValidity;
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

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
