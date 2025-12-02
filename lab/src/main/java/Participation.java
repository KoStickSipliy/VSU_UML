package main.java;

public class Participation {

	private int hours;
	private ResearchAssociate employee;
	private Project project;
	private SimpleDate startDate;
	private SimpleDate endDate;

	/**
	 * 
	 * @param employee
	 * @param project
	 * @param hours
	 * @param start
	 * @param end
	 */
	public Participation(ResearchAssociate employee, Project project, int hours, SimpleDate start, SimpleDate end) {
		this.employee = employee;
		this.project = project;
		this.hours = hours;
		this.startDate = start;
		this.endDate = end;
		if (this.employee != null) this.employee.addParticipation(this);
		if (this.project != null) this.project.addParticipation(this);
	}

	public void displayParticipation() {
		System.out.println(" Participation: " + (project != null ? project.getName() : "n/a") + " by " + (employee != null ? employee.getName() : "n/a") + " hours: " + hours);
		System.out.println("  From: " + (startDate != null ? startDate.toString() : "n/a") + " To: " + (endDate != null ? endDate.toString() : "n/a"));
	}

}