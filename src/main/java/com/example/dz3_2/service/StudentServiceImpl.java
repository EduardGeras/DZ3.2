package com.example.dz3_2.service;

import com.example.dz3_2.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentServiceImpl implements StudentService{

    private final HashMap<Long, Student> students = new HashMap<>();
    private long count = 0;

    @Override
    public Student addStudent(Student student) {
        student.setId(count++);
        students.put(student.getId(), student);
        return student;
    }

    @Override
    public Student findStudent(Long id) {
        return students.get(id);
    }

    @Override
    public Student editStudent(long id, Student student) {
        if (!students.containsKey(id)) {
            return null;
        }
        students.put(id, student);
        return student;
    }

    @Override
    public Student removeStudent(Long id) {
        return students.remove(id);
    }

/*    @Override
    public ArrayList<Student> findByAge(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getAge() == age) {
                result.add(student);
            }
        }
        return result;
    }*/
}
