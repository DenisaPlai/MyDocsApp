package com.application.myDocs.roadVignette.dto;

import java.time.LocalDate;
import java.util.Set;

import com.application.myDocs.territorialValidity.TerritorialValidity;

public class RoadVignetteCreateDTO {

	private Integer id;
	private TerritorialValidity territorialValidity;
	private LocalDate issuedDate;
	private LocalDate expirationDate;
	private String registrationNo;
	private Set<Integer> carIds;



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
