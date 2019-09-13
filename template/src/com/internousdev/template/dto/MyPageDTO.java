package com.internousdev.template.dto;

public class MyPageDTO {
	private String itemName;
	private String totalPrice;
	private String totalCount;
	private String payment;

	public String getItemName() {
		return this.itemName;
	}
	public String setItemName(String itemName) {
		this.itemName =itemName;
	}

	public String TotalPrice() {
		return this.totalPrice;
	}
	public String setTotalPrice(String totalPrice) {
		this.totalPrice =totalPrice;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public String setTotalCount(String totalCount) {
		this.totalCount =totalCount;
	}

	public String getPayment() {
		return this.payment;
	}
	public String setPayment(String payment) {
		this.payment =payment;
	}
}
