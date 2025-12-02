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
		if (faculty != null) faculty.setDean(this);
	}

	public void manageFaculty() {
		if (faculty != null) {
			System.out.println("Dean " + this.getName() + " manages faculty " + faculty.getName());
			faculty.displayFacultyInfo();
		} else {
			System.out.println("No faculty assigned to dean " + this.getName());
		}
	}

	@Override()
	public void displayInfo() {
		System.out.println("Dean:");
		super.displayInfo();
		if (faculty != null) System.out.println("  Faculty: " + faculty.getName());
	}

}