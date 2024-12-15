package com.example.HibernateManyToManyBiDirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProductsBiDirectional {
	@Id
	private int pID;
	private String pName;
	
	@ManyToMany(mappedBy = "productsBiDirectional")
	private List<CustomerBiDirectional> customers;
	
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<CustomerBiDirectional> getCustomers() {
		return customers;
	}
	public void setCustomers(List<CustomerBiDirectional> customers) {
		this.customers = customers;
	}
}
