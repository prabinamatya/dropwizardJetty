package com.prabin.loancalc.entities;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payment {
	private long id;
	
	@Length(max = 3)
	private String paymentValue;
	
	public Payment() {
	}
	
	public Payment(long id, String paymentValue) {
		this.id = id;
		this.paymentValue = paymentValue;
	}
	
	@JsonProperty
	public long getId() {
		return id;
	}
	
	@JsonProperty
	public String getPaymentValue() {
		return this.paymentValue;
	}
}
