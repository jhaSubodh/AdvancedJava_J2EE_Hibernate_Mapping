package com.example.HibernateManyToOneBiDirectional;

import javax.persistence.*;
import java.util.List;

@Entity
public class UniversityBiDirectional {
    @Id
    private int universityId;

    private String name;

    @OneToMany
    private List<StudentBiDirectional> students;

    // Getters and Setters
    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentBiDirectional> getStudents() {
        return students;
    }

    public void setStudents(List<StudentBiDirectional> students) {
        this.students = students;
    }
}