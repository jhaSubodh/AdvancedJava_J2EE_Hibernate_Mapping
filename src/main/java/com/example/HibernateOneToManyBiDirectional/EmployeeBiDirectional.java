package com.example.HibernateOneToManyBiDirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeBiDirectional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentBiDirectional departmentBiDirectional;

    // Constructors
    public EmployeeBiDirectional() {}

    public EmployeeBiDirectional(String name, double salary, DepartmentBiDirectional departmentBiDirectional) {
        this.name = name;
        this.salary = salary;
        this.departmentBiDirectional = departmentBiDirectional;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public DepartmentBiDirectional getDepartment() { return departmentBiDirectional; }
    public void setDepartment(DepartmentBiDirectional departmentBiDirectional) { this.departmentBiDirectional = departmentBiDirectional; }
}
