package com.example.HibernateOneToOneBiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		EntityTransaction entityTrans = entityMg.getTransaction();
		
		EngineBiDirectional engine = new EngineBiDirectional();
		engine.seteID(101);
		engine.setCc("500CC");
		
		CarBiDirectional car = new CarBiDirectional();
		car.setcID(1002);
		car.setBrand("Mercedes Benz");
		car.setCost(10000000);
		car.setEngineBiDirectional(engine);
		engine.setCar(car);
		
		entityTrans.begin();
		entityMg.persist(engine);
		entityMg.persist(car);
		entityTrans.commit();
	}
}
