package com.example.HibernateOneToManyUniDirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		EntityTransaction entityTrans = entityMg.getTransaction();
		
		EmployeeUniDirectional emp1 = new EmployeeUniDirectional();
		emp1.seteID(101);
		emp1.seteName("Alice");
		emp1.setDesignation("Sales Manager");
		
		EmployeeUniDirectional emp2 = new EmployeeUniDirectional();
		emp2.seteID(102);
		emp2.seteName("Bob");
		emp2.setDesignation("Sales Executive");
		
		DepartmentUniDirectional dept = new DepartmentUniDirectional();
		dept.setdID(10);
		dept.setdName("Sales");
		
		List<EmployeeUniDirectional> employee = new ArrayList<>();
		employee.add(emp1);
		employee.add(emp2);
		
		dept.setEmployee(employee);
		
		entityTrans.begin();
		for(EmployeeUniDirectional emp:employee) {
			entityMg.persist(emp);
		}
		entityMg.persist(dept);
		entityTrans.commit();
	}
}
