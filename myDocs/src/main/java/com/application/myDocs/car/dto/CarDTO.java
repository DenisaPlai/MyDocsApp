package com.application.myDocs.car.dto;

import com.application.myDocs.civilAutoLiability.CivilAutoLiability;
import com.application.myDocs.roadworthinessCertificate.RoadworthinessCertificate;
import com.application.myDocs.vehicleIdentityCard.VehicleIdentityCard;
import com.application.myDocs.vehicleRegistrationCertificate.VehicleRegistrationCertificate;

public class CarDTO {

	private Integer id;
	private VehicleRegistrationCertificate vehicleRegistrationCertificate;
	private RoadworthinessCertificate roadworthinessCertificate;
	private CivilAutoLiability civilAutoLiability;
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

}
