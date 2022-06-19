package com.application.myDocs.police;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.application.myDocs.check.Check;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "police", schema = "administration")
public class Police {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "working_place")
	private String workingPlace;

	@Column(name = "grade")
	private String grade;

	@Column(name = "code")
	private String code;

	@OneToMany(mappedBy = "police", fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, orphanRemoval = true)
	private List<Check> ckecks = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWorkingPlace() {
		return workingPlace;
	}

	public void setWorkingPlace(String workingPlace) {
		this.workingPlace = workingPlace;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Check> getCkecks() {
		return ckecks;
	}

	public void setCkecks(List<Check> ckecks) {
		this.ckecks = ckecks;
	}

	public void addCheck(Check ckeck) {
		this.ckecks.add(ckeck);
		ckeck.setPolice(this);
	}

	public void removeCheck(Check ckeck) {
		this.ckecks.remove(ckeck);
		ckeck.setPolice(null);
	}
}
