package main.java;

abstract class Employee {
    protected static int counter = 0;

    protected int ssNo; // социальный код
    protected String name;
    protected String email;
    protected int employeeId;

    public Employee(int ssNo, String name, String email) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
        this.employeeId = ++counter;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getTotalEmployees() {
        return counter;
    }
}
