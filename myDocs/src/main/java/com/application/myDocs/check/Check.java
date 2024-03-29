package com.application.myDocs.check;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.application.myDocs.driver.Driver;
import com.application.myDocs.fine.Fine;
import com.application.myDocs.police.Police;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "check", schema = "administration")
public class Check {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_id")
	private Driver driver;

	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "police_id")
	private Police police;

	@Column(name = "date")
	private LocalDate date;

	@Column(name = "time")
	private LocalTime time;

	@Column(name = "place")
	private String place;

	@Column(name = "observation")
	private String observation;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "check")
	private Fine fine;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Police getPolice() {
		return police;
	}

	public void setPolice(Police police) {
		this.police = police;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Fine getFine() {
		return fine;
	}

	public void setFine(Fine fine) {
		this.fine = fine;
	}

}
