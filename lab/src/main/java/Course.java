package main.java;

public class Course {

	private String name;
	private int id;
	private float weeklyHours;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 * @param id
	 * @param weeklyHours
	 */
	public Course(String name, int id, float weeklyHours) {
		this.name = name;
		this.id = id;
		this.weeklyHours = weeklyHours;
	}

	public void displayCourseInfo() {
		System.out.println("Course: " + name + " (ID: " + id + ") weekly hours: " + weeklyHours);
	}

}