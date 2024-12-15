package com.example.HibernateOneToOneBiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.HibernateOneToOneUiniDirectional.Engine;

@Entity
public class CarBiDirectional {
	@Id
	private int cID;
	private String brand;
	private double cost;
	
	@OneToOne
	@JoinColumn(name = "engine_fk")
	private EngineBiDirectional engine;
	
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
	public EngineBiDirectional getEngineBiDirectional() {
		return engine;
	}
	public void setEngineBiDirectional(EngineBiDirectional engine) {
		this.engine = engine;
	}
}
