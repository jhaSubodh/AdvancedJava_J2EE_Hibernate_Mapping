package com.example.HibernateOneToManyUniDirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class DepartmentUniDirectional {
	@Id
	private int dID;
	private String dName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private List<EmployeeUniDirectional> employee;
	
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public List<EmployeeUniDirectional> getEmployee() {
		return employee;
	}
	public void setEmployee(List<EmployeeUniDirectional> employee2) {
		this.employee = employee2;
	}
}
