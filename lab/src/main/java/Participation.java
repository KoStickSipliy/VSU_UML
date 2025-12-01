package main.java;

public class Participation {
    private ResearchAssociate employee;
    private Project project;
    private int hours;
    private SimpleDate startDate;
    private SimpleDate endDate;

    public Participation(ResearchAssociate employee, Project project, int hours,
                         SimpleDate start, SimpleDate end) {
        this.employee = employee;
        this.project = project;
        this.hours = hours;
        this.startDate = start;
        this.endDate = end;
    }

    public void displayParticipation() {
        System.out.println("Сотрудник: " + employee.getName() +
                ", Проект: " + project.getName() +
                ", Часы: " + hours +
                ", Период: " + startDate + " - " + endDate);
    }
}
