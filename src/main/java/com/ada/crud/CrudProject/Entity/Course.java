package com.ada.crud.CrudProject.Entity;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Course {
    @Id
    private Integer id;
    private String courseName;
    private Date deletedDate;
    @ManyToMany
    List<Student> students;

    public Course(Integer id, String courseName, Date deletedDate, List<Student> students) {
        this.id = id;
        this.courseName = courseName;
        this.deletedDate = deletedDate;
        this.students = students;
    }
    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
