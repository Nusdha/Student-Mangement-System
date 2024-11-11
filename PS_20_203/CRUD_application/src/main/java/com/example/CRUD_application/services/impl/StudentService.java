package com.example.CRUD_application.services.impl;

import java.util.List;

import com.example.CRUD_application.model.Student;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentById(long id);
    Student updateStudent(Student student,long id);
    void deleteStudent(long id);
}
