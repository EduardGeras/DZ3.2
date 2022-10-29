package com.example.dz3_2.service;

import com.example.dz3_2.model.Student;

import java.util.ArrayList;

public interface StudentService {

    Student addStudent(Student student);

    Student findStudent(Long id);

    Student editStudent(long id, Student student);

    Student removeStudent(Long id);

//    ArrayList<Student> findByAge(int age);
}
