package com.example.HibernateOneToManyUniDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		
		DepartmentUniDirectional dept = entityMg.find(DepartmentUniDirectional.class, 10);
		if(dept != null) {
			System.out.println("Department ID: "+dept.getdID());
			System.out.println("Department Name: "+dept.getdName());
			
			for(EmployeeUniDirectional emp : dept.getEmployee()) {
				System.out.println("Employee ID: "+emp.geteID());
				System.out.println("Employee Name: "+emp.geteName());
				System.out.println("Employee Designation: "+emp.getDesignation());
			}
		}
	}
}
