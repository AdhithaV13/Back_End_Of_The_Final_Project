package org.example.dto;

public class Payments {
    String billId;
    String studentId;
    String studentName;
    String batch;
    String course;
    String yearOfTheBatch;
    String valueOfPayment;

    public Payments() {
    }

    public Payments(String billId, String studentId, String studentName, String batch, String course, String yearOfTheBatch, String valueOfPayment) {
        this.billId = billId;
        this.studentId = studentId;
        this.studentName = studentName;
        this.batch = batch;
        this.course = course;
        this.yearOfTheBatch = yearOfTheBatch;
        this.valueOfPayment = valueOfPayment;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYearOfTheBatch() {
        return yearOfTheBatch;
    }

    public void setYearOfTheBatch(String yearOfTheBatch) {
        this.yearOfTheBatch = yearOfTheBatch;
    }

    public String getValueOfPayment() {
        return valueOfPayment;
    }

    public void setValueOfPayment(String valueOfPayment) {
        this.valueOfPayment = valueOfPayment;
    }
}
