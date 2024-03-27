package org.example.dto;

public class Courses {
    String courseId;
    String courseName;
    String periodOfTheCourse;
    String lecturerName;

    public Courses() {
    }

    public Courses(String courseId, String courseName, String periodOfTheCourse, String lecturerName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.periodOfTheCourse = periodOfTheCourse;
        this.lecturerName = lecturerName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPeriodOfTheCourse() {
        return periodOfTheCourse;
    }

    public void setPeriodOfTheCourse(String periodOfTheCourse) {
        this.periodOfTheCourse = periodOfTheCourse;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
}
