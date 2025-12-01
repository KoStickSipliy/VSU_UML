package main.java;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Dean dean;
    private List<Institute> institutes;

    public Faculty(String name) {
        this.name = name;
        this.institutes = new ArrayList<>();
    }

    public void setDean(Dean dean) {
        this.dean = dean;
        System.out.println("Деканом факультета " + name + " назначен: " + dean.getName());
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public void displayFacultyInfo() {
        System.out.println("Факультет: " + name);
        if (dean != null) {
            System.out.println("Декан: " + dean.getName());
        }
        System.out.println("Кафедры:");
        for (Institute inst : institutes) {
            System.out.println("  - " + inst.getName());
        }
    }

    public String getName() {
        return name;
    }
}
