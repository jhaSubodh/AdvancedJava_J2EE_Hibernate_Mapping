package com.example.HibernateOneToManyUniDirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeUniDirectional {
	@Id
	private int eID;
	private String eName;
	private String designation;
	
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
