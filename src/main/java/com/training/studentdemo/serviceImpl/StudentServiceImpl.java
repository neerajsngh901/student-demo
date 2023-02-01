package com.training.studentdemo.serviceImpl;

import com.training.studentdemo.model.Student;
import com.training.studentdemo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getAll() {
        List<Student> getAll=new ArrayList<>();
        Student s1=new Student((long) 1,"Divya",22);
        Student s2=new Student((long) 2,"Aman",22);
        Student s3=new Student((long) 3,"Neeraj",32);
        getAll.add(s1);
        getAll.add(s2);
        getAll.add(s3);
        return getAll;
    }

    @Override
    public Student addStudent(Student student) {
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        return student;
    }

    @Override
    public String deleteStudent(Long id) {
        return "Delete Successfully id no:"+id;
    }
}
