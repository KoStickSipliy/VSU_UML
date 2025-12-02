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
		this.researchers = new ArrayList<ResearchAssociate>();
	}

	/**
	 * 
	 * @param researcher
	 */
	public void addResearcher(ResearchAssociate researcher) {
		if (this.researchers == null) this.researchers = new ArrayList<ResearchAssociate>();
		this.researchers.add(researcher);
	}

	public void displayInstituteInfo() {
		System.out.println("Institute: " + this.name);
		System.out.println("  Address: " + this.address);
		if (researchers != null && !researchers.isEmpty()) {
			System.out.println("  Researchers:");
			for (ResearchAssociate r : researchers) {
				System.out.println("   - " + (r != null ? r.getName() : "<null>"));
			}
		}
	}

}