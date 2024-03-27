package org.example.dto;

public class Students {
    String studentId;
    String studentName;
    String batchName;
    String course;
    String medium;
    String emailAddress;
    String contactNumber;
    String dateOfBirth;
    String payedOrNot;

    public Students() {
    }

    public Students(String studentId, String studentName, String batchName, String course, String medium, String emailAddress, String contactNumber, String dateOfBirth, String payedOrNot) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.batchName = batchName;
        this.course = course;
        this.medium = medium;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.dateOfBirth = dateOfBirth;
        this.payedOrNot = payedOrNot;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPayedOrNot() {
        return payedOrNot;
    }

    public void setPayedOrNot(String payedOrNot) {
        this.payedOrNot = payedOrNot;
    }
}
