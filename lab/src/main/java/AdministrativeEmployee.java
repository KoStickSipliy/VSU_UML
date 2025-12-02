package main.java;

class AdministrativeEmployee extends Employee {

	private String department;

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 * @param department
	 */
	public AdministrativeEmployee(int ssNo, String name, String email, String department) {
		super(ssNo, name, email);
		this.department = department;
	}

	@Override
	public void displayInfo() {
		System.out.println("AdministrativeEmployee: " + this.name + " (ID: " + this.employeeId + ")");
		System.out.println(" Email: " + this.email + "; Department: " + this.department);
	}

}