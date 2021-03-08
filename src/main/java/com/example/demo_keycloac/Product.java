package com.example.demo_keycloac;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {

	private String id;
    private String reference;
    private double price; 
    
	public Product(String i, String ref, double pr) {
		// TODO Auto-generated constructor stub
		this.setId(i);
		this.setReference(ref);
		this.setPrice(pr) ;
	
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
