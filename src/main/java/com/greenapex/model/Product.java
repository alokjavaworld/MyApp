package com.greenapex.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Prod")
public class Product {

	@Id
	@GeneratedValue
	private Integer prodId;
	private String vendorCode;
	private String prodName;
	private Double prodCost;

	public Product() {
		super();
	}

	public Product(Integer prodId) {
		super();
		this.prodId = prodId;
	}

	public Product(String vendorCode, String prodName, Double prodCost) {
		super();
		this.vendorCode = vendorCode;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}

	// Setters and Getters method
	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", vendorCode=" + vendorCode + ", prodName=" + prodName + ", prodCost="
				+ prodCost + "]";
	}

}
