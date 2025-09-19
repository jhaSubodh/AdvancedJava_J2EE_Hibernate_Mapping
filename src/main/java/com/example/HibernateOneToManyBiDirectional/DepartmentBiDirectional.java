package com.example.HibernateOneToManyBiDirectional;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "departments")
public class DepartmentBiDirectional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "departmentBiDirectional", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmployeeBiDirectional> employeeBiDirectionals;

    // Constructors
    public DepartmentBiDirectional() {}

    public DepartmentBiDirectional(String name) {
        this.name = name;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<EmployeeBiDirectional> getEmployees() { return employeeBiDirectionals; }
    public void setEmployees(List<EmployeeBiDirectional> employeeBiDirectionals) { this.employeeBiDirectionals = employeeBiDirectionals; }
}
