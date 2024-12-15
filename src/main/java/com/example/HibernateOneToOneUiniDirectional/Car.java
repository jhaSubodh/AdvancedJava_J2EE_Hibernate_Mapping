package com.example.HibernateOneToOneUiniDirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Table Used to change table name
@Table(name = "CarDetails")
@Entity
public class Car {
	@Id
	private int cID;
	//@Column Used to change column name
	@Column(name = "CarBrand", nullable = true, unique = true)
	private String brand;
	private double cost;
	//@OneToOne
	//Using Cascade
	@OneToOne(cascade = CascadeType.PERSIST)
	private Engine engine;
	
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
