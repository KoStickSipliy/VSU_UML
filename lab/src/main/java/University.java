package main.java;

import java.util.*;

public class University {

	private String name;
	private Collection<Faculty> faculties;

	/**
	 * 
	 * @param name
	 */
	public University(String name) {
		this.name = name;
		this.faculties = new ArrayList<>();
	}

	/**
	 * 
	 * @param faculty
	 */
	public void addFaculty(Faculty faculty) {
		if (faculty == null) return;
		if (this.faculties == null) this.faculties = new ArrayList<>();
		if (!this.faculties.contains(faculty)) this.faculties.add(faculty);
	}

	public void displayUniversityInfo() {
		System.out.println("University: " + this.name);
		if (faculties != null) {
			System.out.println(" Faculties:");
			for (Faculty f : faculties) f.displayFacultyInfo();
		}
	}

}