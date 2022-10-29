package com.example.dz3_2.service;

import com.example.dz3_2.model.Faculty;

import java.util.ArrayList;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(Long id);

    Faculty editFaculty(long id, Faculty faculty);

    Faculty removeFaculty(Long id);

    ArrayList<Faculty> findByColor(String color);
}
