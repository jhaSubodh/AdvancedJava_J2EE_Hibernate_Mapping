package com.example.HiberanteAnnotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "EmployeeDetails")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator  = "Employee_Sequence")
	@SequenceGenerator(name = "Employee_Sequence", sequenceName = "EMPLOYEE_SEQ", initialValue = 200, allocationSize = 10)
	private int eID;
	@Column(name = "EmpName", nullable = false, unique = false)
	private String eName;
	
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
}
