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

	@Override()
	public void displayInfo() {
		System.out.println("Administrative Employee:");
		System.out.println("  Name: " + this.name);
		System.out.println("  Employee ID: " + this.employeeId);
		System.out.println("  SSN: " + this.ssNo);
		System.out.println("  Email: " + this.email);
		System.out.println("  Department: " + this.department);
	}

}