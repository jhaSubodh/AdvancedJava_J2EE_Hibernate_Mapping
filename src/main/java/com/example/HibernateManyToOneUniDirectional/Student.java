package com.example.HibernateManyToOneUniDirectional;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    private int studentId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "university_id") // Foreign key column in Student table
    private University university;

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
