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
		this.faculties = new ArrayList<Faculty>();
	}

	/**
	 * 
	 * @param faculty
	 */
	public void addFaculty(Faculty faculty) {
		if (this.faculties == null) this.faculties = new ArrayList<Faculty>();
		this.faculties.add(faculty);
	}

	public void displayUniversityInfo() {
		System.out.println("University: " + this.name);
		if (faculties != null && !faculties.isEmpty()) {
			System.out.println(" Faculties:");
			for (Faculty f : faculties) {
				System.out.println("  - " + (f != null ? f.getName() : "<null>"));
			}
		} else {
			System.out.println(" No faculties.");
		}
	}

}