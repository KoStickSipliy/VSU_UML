package main.java;

public class Course {
    private String name;
    private int id;
    private float weeklyHours;

    public Course(String name, int id, float weeklyHours) {
        this.name = name;
        this.id = id;
        this.weeklyHours = weeklyHours;
    }

    public void displayCourseInfo() {
        System.out.println("Курс #" + id + ": " + name +
                " (" + weeklyHours + " часов/неделю)");
    }

    public String getName() {
        return name;
    }
}
