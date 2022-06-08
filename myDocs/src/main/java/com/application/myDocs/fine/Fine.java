package com.application.myDocs.fine;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.application.myDocs.check.Check;

@Entity
@Table(name = "fine", schema = "administration")
public class Fine {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "reason")
	private String reason;

	@Column(name = "amount")
	private Integer amount;

	@Column(name = "penalty_points")
	private Integer penaltyPoints;

	@Column(name = "payment_date")
	private LocalDate paymentDate;

	@Column(name = "observations")
	private String observations;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "check_id")
	private Check check;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getPenaltyPoints() {
		return penaltyPoints;
	}

	public void setPenaltyPoints(Integer penaltyPoints) {
		this.penaltyPoints = penaltyPoints;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

}
