package com.application.myDocs.fine.dto;

import java.time.LocalDate;

public class FineDTO {

	private Integer id;
	private String reason;
	private Integer amount;
	private Integer penaltyPoints;
	private LocalDate paymentDate;
	private String observations;

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

}
