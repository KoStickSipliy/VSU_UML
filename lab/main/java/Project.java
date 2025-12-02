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
		this.participations = new ArrayList<Participation>();
	}

	/**
	 * 
	 * @param p
	 */
	public void addParticipation(Participation p) {
		if (this.participations == null) this.participations = new ArrayList<Participation>();
		this.participations.add(p);
	}

	public void displayProjectInfo() {
		System.out.println("Project: " + this.name);
		System.out.println("  Start: " + (startDate != null ? startDate.toString() : "<null>"));
		System.out.println("  End: " + (endDate != null ? endDate.toString() : "<null>"));
		if (participations != null && !participations.isEmpty()) {
			System.out.println("  Participations:");
			for (Participation p : participations) {
				if (p != null) p.displayParticipation();
			}
		}
	}

}