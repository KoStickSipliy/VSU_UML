package main.java;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private SimpleDate startDate;
    private SimpleDate endDate;
    private List<Participation> participations;

    public Project(String name, SimpleDate start, SimpleDate end) {
        this.name = name;
        this.startDate = start;
        this.endDate = end;
        this.participations = new ArrayList<>();
    }

    public void addParticipation(Participation p) {
        participations.add(p);
    }

    public void displayProjectInfo() {
        System.out.println("Проект: " + name +
                " (" + startDate + " - " + endDate + ")");
        System.out.println("Участники:");
        for (Participation p : participations) {
            p.displayParticipation();
        }
    }

    public String getName() {
        return name;
    }
}
