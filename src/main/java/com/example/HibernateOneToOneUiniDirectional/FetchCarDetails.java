package com.example.HibernateOneToOneUiniDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchCarDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		//EntityTransaction entityTrans = entityMg.getTransaction();
		
		Car car = entityMg.find(Car.class, 1002);
		if(car != null) {
			System.out.println("Car ID: "+car.getcID());
			System.out.println("Brand: "+car.getBrand());
			System.out.println("Cost: "+car.getCost());
			
			Engine engine = car.getEngine();
			if(engine != null) {
				System.out.println("Engine ID: "+engine.geteID());
				System.out.println("CC: "+engine.getCc());
			}
		}
	}
}
