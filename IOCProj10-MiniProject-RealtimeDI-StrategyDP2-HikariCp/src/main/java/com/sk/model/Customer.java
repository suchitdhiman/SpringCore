package com.sk.model;



public class Customer {

	private Integer cno;
	private String cname;
	private String caddrs;
	private Double billAmount;
	private Double discount;
	private Double finalAmount;



	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddrs() {
		return caddrs;
	}
	public void setCaddrs(String caddrs) {
		this.caddrs = caddrs;
	}
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(Double finalAmount) {
		this.finalAmount = finalAmount;
	}


	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", caddrs=" + caddrs + ", billAmount=" + billAmount
				+ ", discount=" + discount + ", finalAmount=" + finalAmount + "]";
	}







}
