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
		this.institutes = new ArrayList<Institute>();
		this.courses = new ArrayList<Course>();
		this.projects = new ArrayList<Participation>();
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		if (this.institutes == null) this.institutes = new ArrayList<Institute>();
		this.institutes.add(institute);
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		if (this.courses == null) this.courses = new ArrayList<Course>();
		this.courses.add(course);
	}

	/**
	 * 
	 * @param participation
	 */
	public void addParticipation(Participation participation) {
		if (this.projects == null) this.projects = new ArrayList<Participation>();
		this.projects.add(participation);
	}

	@Override()
	public void displayInfo() {
		System.out.println("Research Associate:");
		System.out.println("  Name: " + this.name);
		System.out.println("  Employee ID: " + this.employeeId);
		System.out.println("  SSN: " + this.ssNo);
		System.out.println("  Email: " + this.email);
		System.out.println("  Field of Study: " + this.fieldOfStudy);
		if (institutes != null && !institutes.isEmpty()) {
			System.out.println("  Institutes:");
			for (Institute i : institutes) {
				System.out.println("    - " + (i != null ? i.getName() : "<null>"));
			}
		}
		if (courses != null && !courses.isEmpty()) {
			System.out.println("  Courses:");
			for (Course c : courses) {
				System.out.println("    - " + (c != null ? c.getName() : "<null>"));
			}
		}
		if (projects != null && !projects.isEmpty()) {
			System.out.println("  Participations:");
			for (Participation p : projects) {
				System.out.println("    - " + (p != null ? p.toString() : "<null>"));
			}
		}
	}

}