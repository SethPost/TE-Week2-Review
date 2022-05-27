
package com.techelevator;

public class Employee {
    private long employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private double salary = STARTING_SALARY;
    private com.techelevator.Department department;
    private String hireDate;

    static final double STARTING_SALARY = 60000.00;

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public com.techelevator.Department getDepartment() {
        return department;
    }

    public void setDepartment
            (com.techelevator.Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Employee(long employeeID,
                    String firstName,
                    String lastName,
                    String email,
                    com.techelevator.Department department,
                    String hireDate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.hireDate = hireDate;
    }

    public Employee() {
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }
    public void raiseSalary(double percent) {
        salary = salary * percent + salary;
    }
}

































