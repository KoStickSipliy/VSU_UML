package main.java;

import java.util.*;

public class UniversitySystemConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("=== University Console ===");
            System.out.println("1) Create Administrative Employee");
            System.out.println("2) Create Research Associate");
            System.out.println("3) List employees");
            System.out.println("4) Total employees");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine().trim();
            if (choice.equals("0")) {
                System.out.println("Exiting...");
                break;
            }
            switch (choice) {
                case "1": {
                    System.out.print("SSN (int): ");
                    int ss = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Email: ");
                    String email = scanner.nextLine().trim();
                    System.out.print("Department: ");
                    String dept = scanner.nextLine().trim();
                    AdministrativeEmployee ae = new AdministrativeEmployee(ss, name, email, dept);
                    employees.add(ae);
                    System.out.println("Administrative employee created, ID=" + ae.getEmployeeId());
                    break;
                }
                case "2": {
                    System.out.print("SSN (int): ");
                    int ss = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Email: ");
                    String email = scanner.nextLine().trim();
                    System.out.print("Field of study: ");
                    String field = scanner.nextLine().trim();
                    ResearchAssociate ra = new ResearchAssociate(ss, name, email, field);
                    employees.add(ra);
                    System.out.println("Research associate created, ID=" + ra.getEmployeeId());
                    break;
                }
                case "3": {
                    if (employees.isEmpty()) {
                        System.out.println("No employees yet.");
                    } else {
                        for (Employee e : employees) {
                            e.displayInfo();
                            System.out.println();
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("Total employees (static counter): " + Employee.getTotalEmployees());
                    break;
                }
                default:
                    System.out.println("Unknown choice");
            }
        }

        scanner.close();
    }
}
