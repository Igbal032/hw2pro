package com.ada.crud.CrudProject.exception;

public class StudentAndCourseException extends Exception {
     public StudentAndCourseException(String mes){
      super(mes);
     }
     @Override
    public String getMessage(){
         return "Error "+ super.getMessage();
     }
}
