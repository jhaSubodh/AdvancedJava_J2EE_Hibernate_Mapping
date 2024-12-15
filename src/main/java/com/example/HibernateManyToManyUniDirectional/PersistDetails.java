package com.example.HibernateManyToManyUniDirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		Products product1 = new Products();
		product1.setpID(10);
		product1.setpName("Apparel");
		
		Products product2 = new Products();
		product2.setpID(20);
		product2.setpName("TV");
		
		List<Products> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		
		Customer customer1 = new Customer();
		customer1.setcID(101);
		customer1.setcName("Alice");
		customer1.setProducts(products);
		
		Customer customer2 = new Customer();
		customer2.setcID(102);
		customer2.setcName("Bob");
		customer2.setProducts(products);
		
		transaction.begin();
		for(Products pro: products) {
			entityManager.persist(pro);
		}
		
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		transaction.commit();
	}
}
