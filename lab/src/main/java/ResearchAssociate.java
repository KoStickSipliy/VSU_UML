package main.java;

import java.util.*;

class ResearchAssociate extends Employee {

	private String fieldOfStudy;
	private Collection<Institute> institutes;
	private Collection<Course> courses;
	private Collection<Participation> projects;

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 * @param fieldOfStudy
	 */
	public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
		this.institutes = new ArrayList<>();
		this.courses = new ArrayList<>();
		this.projects = new ArrayList<>();
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		if (institute == null) return;
		if (!this.institutes.contains(institute)) {
			this.institutes.add(institute);
		}
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		if (course == null) return;
		if (!this.courses.contains(course)) {
			this.courses.add(course);
		}
	}

	/**
	 * 
	 * @param participation
	 */
	public void addParticipation(Participation participation) {
		if (participation == null) return;
		if (!this.projects.contains(participation)) {
			this.projects.add(participation);
		}
	}

	@Override
	public void displayInfo() {
		System.out.println("ResearchAssociate: " + this.name + " (ID: " + this.employeeId + ")");
		System.out.println(" Email: " + this.email + "; Field: " + this.fieldOfStudy);
		System.out.println(" Institutes: ");
		for (Institute i : institutes) {
			System.out.println("  - " + i.getName());
		}
		System.out.println(" Courses: ");
		for (Course c : courses) {
			System.out.println("  - " + c.getName());
		}
		System.out.println(" Participations: ");
		for (Participation p : projects) {
			p.displayParticipation();
		}
	}

}