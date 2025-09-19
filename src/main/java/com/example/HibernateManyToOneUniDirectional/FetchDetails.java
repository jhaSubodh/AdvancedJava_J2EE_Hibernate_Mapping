package com.example.HibernateManyToOneUniDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		
		Student student = entityMg.find(Student.class, 101);
		if(student != null) {
			System.out.println("Student ID: "+student.getStudentId());
			System.out.println("Student Name: "+student.getName());	
			System.out.println("Student Class: "+student.getClass());
			
			University university = student.getUniversity();
			System.out.println("University ID: "+university.getUniversityId());
			System.out.println("University Name: "+university.getName());
		}
	}
}
