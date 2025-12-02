package main.java;

abstract class Employee {

	protected static int counter = 0;
	protected int ssNo;
	/**
	 * социальный код
	 */
	protected String name;
	protected String email;
	protected int employeeId;

	public String getName() {
		return this.name;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	/**
	 * 
	 * @param ssNo
	 * @param name
	 * @param email
	 */
	public Employee(int ssNo, String name, String email) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
		this.employeeId = ++counter;
	}

	public abstract void displayInfo();

	public static int getTotalEmployees() {
		return counter;
	}

}