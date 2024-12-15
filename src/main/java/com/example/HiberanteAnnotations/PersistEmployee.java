package com.example.HiberanteAnnotations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		EntityTransaction entityTrans = entityMg.getTransaction();
		
		Employee emp1 = new Employee();
		emp1.seteName("Alice");
		
		Employee emp2 = new Employee();
		emp2.seteName("Alice");
		
		entityTrans.begin();
		entityMg.persist(emp1);
		entityMg.persist(emp2);
		entityTrans.commit();
	}
}
