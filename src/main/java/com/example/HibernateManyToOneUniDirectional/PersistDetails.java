package com.example.HibernateManyToOneUniDirectional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class PersistDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		// Create University
		University university = new University();
		university.setUniversityId(101);
		university.setName("Stanford University");

		// Create Students
		Student student1 = new Student();
		student1.setName("Alice");
		student1.setUniversity(university);

		Student student2 = new Student();
		student2.setName("Bob");
		student2.setUniversity(university);

		List<Student> students = new ArrayList<>(); 
		students.add(student1);
		students.add(student2);
		
		university.setStudents(students);

		transaction.begin();
		//entityManager.persist(student1);
		//entityManager.persist(student2);
		entityManager.persist(university);
		transaction.commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
