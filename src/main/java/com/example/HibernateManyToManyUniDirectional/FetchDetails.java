package com.example.HibernateManyToManyUniDirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		
		Customer customer = entityMg.find(Customer.class, 101);
		if(customer !=null) {
			System.out.println("Customer ID: "+customer.getcID());
			System.out.println("Customer Name: "+customer.getcName());
			
			List<Products> products = customer.getProducts();
			for(Products pro : products) {
				System.out.println("Product ID: "+pro.getpID());
				System.out.println("Product Name: "+pro.getpName());
			}
		}
	}
}
