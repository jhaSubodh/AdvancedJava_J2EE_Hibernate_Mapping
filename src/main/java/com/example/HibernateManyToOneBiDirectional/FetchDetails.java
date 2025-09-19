package com.example.HibernateManyToOneBiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();
		
		StudentBiDirectional student = entityMg.find(StudentBiDirectional.class, 101);
		if(student != null) {
			System.out.println("Student ID: "+student.getStudentId());
			System.out.println("Student Name: "+student.getName());
			System.out.println("Student Class: "+student.getClass());
			
			UniversityBiDirectional dept = student.getUniversity();
			System.out.println("Department ID: "+dept.getUniversityId());
			System.out.println("Department Name: "+dept.getName());
		}
		
		UniversityBiDirectional uni = entityMg.find(UniversityBiDirectional.class, 10);
		if(uni != null) {
			System.out.println("Department ID: "+uni.getUniversityId());
			System.out.println("Department Name: "+uni.getName());
			
			for(StudentBiDirectional studentobj : uni.getStudents()) {
				System.out.println("Student ID: "+studentobj.getStudentId());
				System.out.println("Student Name: "+studentobj.getName());
				System.out.println("Student Class: "+studentobj.getClass());
			}
		}
	}
}
