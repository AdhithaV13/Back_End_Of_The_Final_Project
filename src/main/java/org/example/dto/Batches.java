package org.example.dto;

public class Batches {
    String batchName;
    String year;
    String course;
    String medium;
    String limitOfStudent;

    public Batches(String batchName, String year, String course, String medium, String limitOfStudent) {
        this.batchName = batchName;
        this.year = year;
        this.course = course;
        this.medium = medium;
        this.limitOfStudent = limitOfStudent;
    }

    public Batches() {
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getLimitOfStudent() {
        return limitOfStudent;
    }

    public void setLimitOfStudent(String limitOfStudent) {
        this.limitOfStudent = limitOfStudent;
    }
}
