package com.example.HibernateOneToManyBiDirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {
    public static void main(String[] args) {
        //SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        //Session session = factory.openSession();
    	
    	EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("subodh");
		EntityManager entityMg = entityMF.createEntityManager();

        // Fetch Department
        DepartmentBiDirectional departmentBiDirectional = entityMg.find(DepartmentBiDirectional.class, 1);
        
        if(departmentBiDirectional == null) {
			System.out.println("Department not found");
			return;
		}else {
			System.out.println("Department: " + departmentBiDirectional.getName());

	        // Fetch Employees
	        List<EmployeeBiDirectional> employeeBiDirectionals = departmentBiDirectional.getEmployees();
	        for (EmployeeBiDirectional emp : employeeBiDirectionals) {
	            System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
	        }
		}
        
        EmployeeBiDirectional employeeBiDirectional = entityMg.find(EmployeeBiDirectional.class, 1);
        if(employeeBiDirectional == null) {
        	System.out.println("Employee not found");
        	return;
        }else {
        	System.out.println("Employee: " + employeeBiDirectional.getName() + ", Salary: " + employeeBiDirectional.getSalary());
			
			// Fetch Department
			DepartmentBiDirectional dept = employeeBiDirectional.getDepartment();
			System.out.println("Department: " + dept.getName());
        }
        
        entityMg.close();   
        entityMF.close();
    }
}
