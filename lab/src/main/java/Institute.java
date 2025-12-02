package main.java;

import java.util.*;

public class Institute {

	private String name;
	private String address;
	private Collection<ResearchAssociate> researchers;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
		this.researchers = new ArrayList<>();
	}

	/**
	 * 
	 * @param researcher
	 */
	public void addResearcher(ResearchAssociate researcher) {
		if (researcher == null) return;
		if (this.researchers == null) this.researchers = new ArrayList<>();
		if (!this.researchers.contains(researcher)) {
			this.researchers.add(researcher);
			researcher.addInstitute(this);
		}
	}

	public void displayInstituteInfo() {
		System.out.println("Institute: " + this.name + " (" + this.address + ")");
		if (researchers != null) {
			System.out.println(" Researchers:");
			for (ResearchAssociate r : researchers) System.out.println("  - " + r.getName());
		}
	}

}