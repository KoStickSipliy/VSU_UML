package main.java;

class Dean extends ResearchAssociate {
    private Faculty faculty;

    public Dean(int ssNo, String name, String email, String fieldOfStudy, Faculty faculty) {
        super(ssNo, name, email, fieldOfStudy);
        this.faculty = faculty;
    }

    public void manageFaculty() {
        System.out.println("Декан " + name + " управляет факультетом: " + faculty.getName());
    }

    @Override
    public void displayInfo() {
        System.out.println("Декан #" + getEmployeeId() +
                ": " + name +
                ", Факультет: " + faculty.getName());
    }
}
