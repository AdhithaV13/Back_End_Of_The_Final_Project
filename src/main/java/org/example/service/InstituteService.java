package org.example.service;

import java.sql.SQLException;
import java.util.List;

public interface InstituteService {
    void addBatches(String batchName , String year , String course , String medium , String limitOfStudent) throws SQLException, ClassNotFoundException;

    void addStudents(String studentId , String studentName , String batchName , String course , String medium , String emailAddress , String contactNumber , String dateOfBirth , String payedOrNot) throws SQLException, ClassNotFoundException;

    void addPayments(String billId , String studentId , String studentName , String batch , String course, String yearOfTheBatch , String valueOfPayment) throws SQLException, ClassNotFoundException;

    void addCourses(String courseId , String courseName , String periodOfTheCourse , String lecturerName) throws SQLException, ClassNotFoundException;

    void addEmployee(String employeeName , String contactNumber , String emailAddress, String monthlySalary) throws SQLException, ClassNotFoundException;

    List showAllBatches() throws SQLException, ClassNotFoundException;

    List showAllStudents() throws SQLException, ClassNotFoundException;

    List showAllPayments() throws SQLException, ClassNotFoundException;

    List showAllCourses() throws SQLException, ClassNotFoundException;

    List showAllEmployees() throws SQLException, ClassNotFoundException;

    void updateStudentDetails(String studentId , String emailAddress , String contactNumber , String payedOrNot) throws SQLException, ClassNotFoundException;

    void updateCourseDetails(String courseId , String lecturerName) throws SQLException, ClassNotFoundException;

    void updateEmployeeDetails(String employeeName , String contactNumber , String emailAddress , String monthlySalary) throws SQLException, ClassNotFoundException;
}
