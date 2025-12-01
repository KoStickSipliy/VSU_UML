package main.java;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private String address;
    private List<ResearchAssociate> researchers;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
        this.researchers = new ArrayList<>();
    }

    public void addResearcher(ResearchAssociate researcher) {
        researchers.add(researcher);
        researcher.addInstitute(this);
    }

    public void displayInstituteInfo() {
        System.out.println("Кафедра: " + name + ", Адрес: " + address);
        System.out.println("Научные сотрудники:");
        for (ResearchAssociate ra : researchers) {
            System.out.println("  - " + ra.getName());
        }
    }

    public String getName() {
        return name;
    }

}
