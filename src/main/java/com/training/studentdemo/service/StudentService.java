package com.training.studentdemo.service;

import com.training.studentdemo.model.Student;

import java.util.List;

public interface StudentService {
    //Get
    public List<Student> getAll();
    //POST
    public Student addStudent(Student student);

    //PUT
    public Student updateStudent(Student student);

    public String deleteStudent(Long id);

}
