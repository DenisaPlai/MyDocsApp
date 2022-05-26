package com.application.myDocs.roadVignette.dto;

import java.time.LocalDate;

import com.application.myDocs.territorialValidity.TerritorialValidity;

public class RoadVignetteDTO {

	private Integer id;
	private TerritorialValidity territorialValidity;
	private LocalDate issuedDate;
	private LocalDate expirationDate;
	private String registrationNo;

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

}
