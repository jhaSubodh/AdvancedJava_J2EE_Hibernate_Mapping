package com.example.HibernateOneToOneBiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		//EntityTransaction entityTrans = entityMg.getTransaction();
		
		CarBiDirectional car = entityMg.find(CarBiDirectional.class, 1002);
		if(car != null) {
			System.out.println("Car ID: "+car.getcID());
			System.out.println("Brand: "+car.getBrand());
			System.out.println("Cost: "+car.getCost());
			
			EngineBiDirectional engine = car.getEngineBiDirectional();
			if(engine != null) {
				System.out.println("Engine ID: "+engine.geteID());
				System.out.println("CC: "+engine.getCc());
			}
		}
		System.out.println("----------------------------------------------");
		EngineBiDirectional engine = entityMg.find(EngineBiDirectional.class, 101);
		if(engine != null) {
			System.out.println("Engine ID: "+engine.geteID());
			System.out.println("CC: "+engine.getCc());
			
			CarBiDirectional car1 = engine.getCar();
			if(car1 != null) {
				System.out.println("Car ID: "+car.getcID());
				System.out.println("Brand: "+car.getBrand());
				System.out.println("Cost: "+car.getCost());
			}
		}
	}
}
