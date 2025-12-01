package main.java;

class AdministrativeEmployee extends Employee {
    private String department;

    public AdministrativeEmployee(int ssNo, String name, String email, String department) {
        super(ssNo, name, email);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Административный сотрудник #" + employeeId +
                ": " + name +
                ", Отдел: " + department +
                ", Email: " + email);
    }
}

