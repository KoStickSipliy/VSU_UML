package main.java;

import java.util.ArrayList;
import java.util.List;

class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private List<Institute> institutes;
    private List<Course> courses;
    private List<Participation> projects;

    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.institutes = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println(name + " теперь ведет курс: " + course.getName());
    }

    public void addParticipation(Participation participation) {
        projects.add(participation);
    }

    @Override
    public void displayInfo() {
        System.out.println("Научный сотрудник #" + employeeId +
                ": " + name +
                ", Область: " + fieldOfStudy +
                ", Email: " + email);
        System.out.print("Кафедры: ");
        for (Institute inst : institutes) {
            System.out.print(inst.getName() + " ");
        }
        System.out.println();

        if (!courses.isEmpty()) {
            System.out.println("Ведет курсы:");
            for (Course course : courses) {
                course.displayCourseInfo();
            }
        }
    }
}