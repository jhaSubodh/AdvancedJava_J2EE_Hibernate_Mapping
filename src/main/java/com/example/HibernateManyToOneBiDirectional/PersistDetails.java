package com.example.HibernateManyToOneBiDirectional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class PersistDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		// Create University
		UniversityBiDirectional university = new UniversityBiDirectional();
		university.setUniversityId(101);
		university.setName("Stanford University");

		// Create Students
		StudentBiDirectional student1 = new StudentBiDirectional();
		student1.setName("Alice");
		student1.setUniversity(university);

		StudentBiDirectional student2 = new StudentBiDirectional();
		student2.setName("Bob");
		student2.setUniversity(university);

		List<StudentBiDirectional> students = new ArrayList<>(); 
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
