package org.example.dto;

public class Employee {
    String employeeName;
    String contactNumber;
    String emailAddress;
    String monthlySalary;

    public Employee() {
    }

    public Employee(String employeeName, String contactNumber, String emailAddress, String monthlySalary) {
        this.employeeName = employeeName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.monthlySalary = monthlySalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(String monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
