package com.ada.crud.CrudProject.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    private Integer Id;

    private String firstName;

    private String lastName;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @ManyToMany
    @JoinTable(name = "ENROLLMENT",
            joinColumns = @JoinColumn(name = "stId"),
            inverseJoinColumns = @JoinColumn(name = "crs_Id"))
    List<Course> courses;

    public Student(Integer id, String firstName, String lastName, List<Course> courses) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }
    public Student() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
