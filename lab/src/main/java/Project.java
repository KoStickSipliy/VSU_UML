package main.java;

import java.util.*;

public class Project {

	private String name;
	private SimpleDate startDate;
	private SimpleDate endDate;
	private Collection<Participation> participations;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 * @param start
	 * @param end
	 */
	public Project(String name, SimpleDate start, SimpleDate end) {
		this.name = name;
		this.startDate = start;
		this.endDate = end;
		this.participations = new ArrayList<>();
	}

	/**
	 * 
	 * @param p
	 */
	public void addParticipation(Participation p) {
		if (p == null) return;
		if (this.participations == null) this.participations = new ArrayList<>();
		if (!this.participations.contains(p)) this.participations.add(p);
	}

	public void displayProjectInfo() {
		System.out.println("Project: " + this.name);
		System.out.println(" Start: " + (startDate != null ? startDate.toString() : "n/a") + " End: " + (endDate != null ? endDate.toString() : "n/a"));
		if (participations != null) {
			System.out.println(" Participations:");
			for (Participation p : participations) p.displayParticipation();
		}
	}

}