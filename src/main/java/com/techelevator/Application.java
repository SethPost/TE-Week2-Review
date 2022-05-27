package com.techelevator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    List<Department> departments = new ArrayList<Department>();
    List<Employee> employees = new ArrayList<Employee>();
    Map<String, Project> projects = new HashMap<>();

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();


        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        com.techelevator.Department marketing = new com.techelevator.Department(1, "Marketing");
        com.techelevator.Department sales = new com.techelevator.Department(2, "Sales");
        com.techelevator.Department engineering = new com.techelevator.Department(3, "Engineering");
        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (com.techelevator.Department department : departments) {
            System.out.println(department.getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee deanJohnson = new Employee();
            deanJohnson.setEmployeeID(1);
            deanJohnson.setFirstName("Dean");
            deanJohnson.setLastname("Johnson");
            deanJohnson.setEmail("djohnson@teams.com");
            deanJohnson.setDepartment(departments.get(2));
            deanJohnson.setHireDate("08/21/2020");
        Employee angieSmith = new Employee(2, "Angie",
                "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
        Employee margaretThompson = new Employee(3, "Margaret",
                "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020");
        employees.add(deanJohnson);
        employees.add(angieSmith);
        employees.add(margaretThompson);
        angieSmith.raiseSalary(0.10);

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") "
                    + employee.getDepartment().getName());
        }

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project teams = new Project("TEams",
                "Project Management Software", "10/10/2020", "11/10/2020");
        List <Employee> engineeringEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Engineering")) {
                engineeringEmployees.add(employee);
            }
        }
        teams.setTeamMembers(engineeringEmployees);
        projects.put("Management Software", teams);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project marketingLandingPage = new Project ("Marketing Landing Page",
                "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        List <Employee> marketingEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Marketing")) {
                marketingEmployees.add(employee);
            }
        }
        marketingLandingPage.setTeamMembers(marketingEmployees);
        projects.put("Marketing Landing Page", marketingLandingPage);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        System.out.println(projects.get("Management Software").getName() + ": " +
                projects.get("Management Software").getTeamMembers().size());
        System.out.println(projects.get("Marketing Landing Page").getName() + ": " +
                projects.get("Marketing Landing Page").getTeamMembers().size());
    }
}
