package main.java;

class Dean extends ResearchAssociate {

	private Faculty faculty;

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 * @param fieldOfStudy
	 * @param faculty
	 */
	public Dean(int ssNo, String name, String email, String fieldOfStudy, Faculty faculty) {
		super(ssNo, name, email, fieldOfStudy);
		this.faculty = faculty;
		if (this.faculty != null) this.faculty.setDean(this);
	}

	public void manageFaculty() {
		System.out.println("Dean " + this.name + " managing faculty: " + (faculty != null ? faculty.getName() : "n/a"));
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" Faculty: " + (faculty != null ? faculty.getName() : "n/a"));
	}

}