package com.example.dz3_2.service;

import com.example.dz3_2.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Service
public class FacultyServiceImpl implements FacultyService{

    private final HashMap<Long, Faculty> faculties = new HashMap<>();

    private long count = 0;

    @Override
    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(count++);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty findFaculty(Long id) {
        return faculties.get(id);
    }

    @Override
    public Faculty editFaculty(long id, Faculty faculty) {
        if (!faculties.containsKey(id)) {
            return null;
        }
        faculties.put(id, faculty);
        return faculty;
    }

    @Override
    public Faculty removeFaculty(Long id) {
        return faculties.remove(id);
    }

/*    @Override
    public ArrayList<Faculty> findByColor(String color) {
        ArrayList<Faculty> result = new ArrayList<>();
        for (Faculty faculty : faculties.values()) {
            if (Objects.equals(faculty.getColor(), color)) {
                result.add(faculty);
            }
        }
        return result;
    }*/
}
