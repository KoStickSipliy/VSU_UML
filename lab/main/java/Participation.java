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
		if (project != null) {
			project.addParticipation(this);
		}
	}

	public void displayParticipation() {
		String empName = (employee != null ? employee.getName() : "<no employee>");
		String projName = (project != null ? project.getName() : "<no project>");
		System.out.println("    Participation: employee=" + empName + ", project=" + projName + ", hours=" + hours);
		System.out.println("      Period: " + (startDate != null ? startDate.toString() : "<null>") + " - " + (endDate != null ? endDate.toString() : "<null>"));
	}

	@Override()
	public String toString() {
		String projName = (project != null ? project.getName() : "<no project>");
		return projName + " (" + hours + "h)";
	}

}