package com.application.myDocs.defects;

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
import com.application.myDocs.roadworthinessCertificate.RoadworthinessCertificate;

@Entity
@Table(name = "defects", schema = "administration")
public class Defects {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roadworthiness_certificate_id")
	private RoadworthinessCertificate roadworthinessCertificate;

	@Enumerated(EnumType.STRING)
	@Column(name = "category")
	private CarCategory category;

	@Column(name = "identified_defect")
	private String identifiedDefect;

	@Column(name = "code")
	private String code;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RoadworthinessCertificate getRoadworthinessCertificate() {
		return roadworthinessCertificate;
	}

	public void setRoadworthinessCertificate(RoadworthinessCertificate roadworthinessCertificate) {
		this.roadworthinessCertificate = roadworthinessCertificate;
	}

	public CarCategory getCategory() {
		return category;
	}

	public void setCategory(CarCategory category) {
		this.category = category;
	}

	public String getIdentifiedDefect() {
		return identifiedDefect;
	}

	public void setIdentifiedDefect(String identifiedDefect) {
		this.identifiedDefect = identifiedDefect;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void addRc(RoadworthinessCertificate rc) {
		this.roadworthinessCertificate = rc;
		rc.getDefects().add(this);
	}

}
