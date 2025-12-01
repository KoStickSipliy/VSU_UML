package main.java;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversityInfo() {
        System.out.println("Университет: " + name);
        System.out.println("Факультеты:");
        for (Faculty faculty : faculties) {
            faculty.displayFacultyInfo();
        }
        System.out.println("Всего сотрудников: " + Employee.getTotalEmployees());
    }
}
