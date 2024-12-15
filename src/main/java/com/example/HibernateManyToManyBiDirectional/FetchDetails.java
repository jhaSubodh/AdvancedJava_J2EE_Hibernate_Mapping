package com.example.HibernateManyToManyBiDirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		
		CustomerBiDirectional customer = entityMg.find(CustomerBiDirectional.class, 101);
		if(customer !=null) {
			System.out.println("Customer ID: "+customer.getcID());
			System.out.println("Customer Name: "+customer.getcName());
			
			List<ProductsBiDirectional> products = customer.getProducts();
			for(ProductsBiDirectional pro : products) {
				System.out.println("Product ID: "+pro.getpID());
				System.out.println("Product Name: "+pro.getpName());
			}
		}
		
		ProductsBiDirectional products = entityMg.find(ProductsBiDirectional.class, 10);
		if(products != null) {
			System.out.println("Product ID: "+products.getpID());
			System.out.println("Product Name: "+products.getpName());
			
			List<CustomerBiDirectional> cust = products.getCustomers();
			for(CustomerBiDirectional custobj : cust) {
				System.out.println("Customer ID: "+custobj.getcID());
				System.out.println("Customer Name: "+custobj.getcName());	
			}
		}
	}
}
