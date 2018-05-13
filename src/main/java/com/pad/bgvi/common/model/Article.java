package com.pad.bgvi.common.model;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "PRODUCTS")
public class Article extends Entity{
	
	@Column(name="CATEGORY_TYPE")
	private int type;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "QUANTITY")
	private int quantity;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}