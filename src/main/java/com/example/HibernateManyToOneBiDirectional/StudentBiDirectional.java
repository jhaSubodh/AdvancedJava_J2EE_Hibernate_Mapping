package com.example.HibernateManyToOneBiDirectional;

import javax.persistence.*;

@Entity
public class StudentBiDirectional {
    @Id
    private int studentId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "university_id") // Foreign key column in Student table
    private UniversityBiDirectional university;

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

    public UniversityBiDirectional getUniversity() {
        return university;
    }

    public void setUniversity(UniversityBiDirectional university) {
        this.university = university;
    }
}
