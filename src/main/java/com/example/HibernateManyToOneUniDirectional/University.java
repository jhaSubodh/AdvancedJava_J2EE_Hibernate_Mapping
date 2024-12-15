package com.example.HibernateManyToOneUniDirectional;

import javax.persistence.*;
import java.util.List;

@Entity
public class University {
    @Id
    private int universityId;

    private String name;

    //@OneToMany
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
