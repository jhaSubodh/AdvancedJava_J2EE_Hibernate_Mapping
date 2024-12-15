package com.example.HibernateOneToOneBiDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EngineBiDirectional {
	@Id
	private int eID;
	private String cc;
	
	@OneToOne(mappedBy = "engine")
	private CarBiDirectional car;

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public CarBiDirectional getCar() {
		return car;
	}

	public void setCar(CarBiDirectional car) {
		this.car = car;
	}
}
