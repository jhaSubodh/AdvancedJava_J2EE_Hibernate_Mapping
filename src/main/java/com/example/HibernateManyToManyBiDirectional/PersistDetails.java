package com.example.HibernateManyToManyBiDirectional;

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
		
		ProductsBiDirectional product1 = new ProductsBiDirectional();
		product1.setpID(10);
		product1.setpName("Apparel");
		
		ProductsBiDirectional product2 = new ProductsBiDirectional();
		product2.setpID(20);
		product2.setpName("TV");
		
		List<ProductsBiDirectional> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		
		CustomerBiDirectional customer1 = new CustomerBiDirectional();
		customer1.setcID(101);
		customer1.setcName("Alice");
		customer1.setProducts(products);
		
		CustomerBiDirectional customer2 = new CustomerBiDirectional();
		customer2.setcID(102);
		customer2.setcName("Bob");
		customer2.setProducts(products);
		
		List<CustomerBiDirectional> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer1);
		
		product1.setCustomers(customers);
		product2.setCustomers(customers);
		
		transaction.begin();
		for(ProductsBiDirectional pro : products) {
			entityManager.persist(pro);
		}
		for(CustomerBiDirectional cust : customers){
			entityManager.persist(cust);
		}
		transaction.commit();
	}
}
