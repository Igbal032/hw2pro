package com.ada.crud.CrudProject.Repository;
import com.ada.crud.CrudProject.Entity.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public  interface courseRepository extends CrudRepository <Course, Integer> {

//
//    @Query(value = "SELECT Student.courses, Course.id,Course.courseName from Course where Course.deletedDate is Null")
//    List<Course> selectedCourses();
@Query(value = "select * from Course",nativeQuery = true)
List<Course> getAllCourse();
}
