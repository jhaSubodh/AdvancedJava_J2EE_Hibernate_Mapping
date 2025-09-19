package com.example.HibernateOneToManyBiDirectional;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersistData {
    public static void main(String[] args) {
        //SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        //Session session = factory.openSession();
        //Transaction tx = session.beginTransaction();
    	
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

        // Create Department
        DepartmentBiDirectional departmentBiDirectional = new DepartmentBiDirectional("IT Department");

        // Create Employees
        EmployeeBiDirectional emp1 = new EmployeeBiDirectional("John Doe", 50000, departmentBiDirectional);
        EmployeeBiDirectional emp2 = new EmployeeBiDirectional("Jane Smith", 60000, departmentBiDirectional);

        departmentBiDirectional.setEmployees(Arrays.asList(emp1, emp2));

        // Save Department (Cascade saves Employees too)
        entityManager.persist(departmentBiDirectional);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Data persisted successfully!");
    }
}
