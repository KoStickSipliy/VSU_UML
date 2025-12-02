package main.java;

import java.util.*;

public class Faculty {

	private String name;
	private Dean dean;
	private Collection<Institute> institutes;

	public String getName() {
		return this.name;
	}

	public void setDean(Dean dean) {
		this.dean = dean;
	}

	/**
	 * 
	 * @param name
	 */
	public Faculty(String name) {
		this.name = name;
		this.institutes = new ArrayList<Institute>();
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		if (this.institutes == null) this.institutes = new ArrayList<Institute>();
		this.institutes.add(institute);
	}

	public void displayFacultyInfo() {
		System.out.println("Faculty: " + this.name);
		if (dean != null) {
			System.out.println("  Dean: " + dean.getName());
		}
		if (institutes != null && !institutes.isEmpty()) {
			System.out.println("  Institutes:");
			for (Institute i : institutes) {
				System.out.println("   - " + (i != null ? i.getName() : "<null>"));
			}
		}
	}

}