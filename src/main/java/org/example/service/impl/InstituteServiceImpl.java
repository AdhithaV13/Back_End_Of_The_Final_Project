package org.example.service.impl;

import org.example.db.DBConnection;
import org.example.service.InstituteService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class InstituteServiceImpl implements InstituteService {
    @Override
    public void addBatches(String batchName, String year, String course , String medium , String limitOfStudent) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO batches VALUES(?,?,?,?,?)");
        pstm.setString(1,batchName);
        pstm.setString(2,year);
        pstm.setString(3,course);
        pstm.setString(4,medium);
        pstm.setString(5,limitOfStudent);
        pstm.executeUpdate();
    }

    @Override
    public void addStudents(String studentId, String studentName, String batchName, String course, String medium, String emailAddress, String contactNumber, String dateOfBirth, String payedOrNot) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO students VALUES(?,?,?,?,?,?,?,?,?)");
        pstm.setString(1,studentId);
        pstm.setString(2,studentName);
        pstm.setString(3,batchName);
        pstm.setString(4,course);
        pstm.setString(5,medium);
        pstm.setString(6,emailAddress);
        pstm.setString(7,contactNumber);
        pstm.setString(8,dateOfBirth);
        pstm.setString(9,payedOrNot);
        pstm.executeUpdate();
    }

    @Override
    public void addPayments(String billId, String studentId, String studentName, String batch, String course, String yearOfTheBatch, String valueOfPayment) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO payments VALUES(?,?,?,?,?,?,?)");
        pstm.setString(1,billId);
        pstm.setString(2,studentId);
        pstm.setString(3,studentName);
        pstm.setString(4,batch);
        pstm.setString(5,course);
        pstm.setString(6,yearOfTheBatch);
        pstm.setString(7,valueOfPayment);
        pstm.executeUpdate();
    }

    @Override
    public void addCourses(String courseId, String courseName, String periodOfTheCourse, String lecturerName) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO courses VALUES(?,?,?,?)");
        pstm.setString(1,courseId);
        pstm.setString(2,courseName);
        pstm.setString(3,periodOfTheCourse);
        pstm.setString(4,lecturerName);
        pstm.executeUpdate();
    }

    @Override
    public void addEmployee(String employeeName, String contactNumber, String emailAddress, String monthlySalary) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
        pstm.setString(1,employeeName);
        pstm.setString(2,contactNumber);
        pstm.setString(3,emailAddress);
        pstm.setString(4,monthlySalary);
        pstm.executeUpdate();
    }

    @Override
    public List showAllBatches() throws SQLException, ClassNotFoundException {
        List list = new ArrayList<>();
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM batches");
        ResultSet resultSet = pstm.executeQuery();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
            list.add(resultSet.getString(2));
            list.add(resultSet.getString(3));
            list.add(resultSet.getString(4));
            list.add(resultSet.getString(5));
        }
        return list;
    }

    @Override
    public List showAllStudents() throws SQLException, ClassNotFoundException {
        List list = new ArrayList<>();
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM students");
        ResultSet resultSet = pstm.executeQuery();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
            list.add(resultSet.getString(2));
            list.add(resultSet.getString(3));
            list.add(resultSet.getString(4));
            list.add(resultSet.getString(5));
            list.add(resultSet.getString(6));
            list.add(resultSet.getString(7));
            list.add(resultSet.getString(8));
            list.add(resultSet.getString(9));
        }
        return list;
    }

    @Override
    public List showAllPayments() throws SQLException, ClassNotFoundException {
        List list = new ArrayList<>();
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Payments");
        ResultSet resultSet = pstm.executeQuery();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
            list.add(resultSet.getString(2));
            list.add(resultSet.getString(3));
            list.add(resultSet.getString(4));
            list.add(resultSet.getString(5));
            list.add(resultSet.getString(6));
            list.add(resultSet.getString(7));
        }
        return list;
    }

    @Override
    public List showAllCourses() throws SQLException, ClassNotFoundException {
        List list = new ArrayList<>();
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM courses");
        ResultSet resultSet = pstm.executeQuery();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
            list.add(resultSet.getString(2));
            list.add(resultSet.getString(3));
            list.add(resultSet.getString(4));
        }
        return list;
    }

    @Override
    public List showAllEmployees() throws SQLException, ClassNotFoundException {
        List list = new ArrayList<>();
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM employee");
        ResultSet resultSet = pstm.executeQuery();
        while(resultSet.next()){
            list.add(resultSet.getString(1));
            list.add(resultSet.getString(2));
            list.add(resultSet.getString(3));
            list.add(resultSet.getString(4));
        }
        return list;
    }

    @Override
    public void updateStudentDetails(String studentId, String emailAddress, String contactNumber, String payedOrNot) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();

        if(emailAddress.length() > 0){
            PreparedStatement pstm = connection.prepareStatement("UPDATE students SET emailAddress=? WHERE studentId=?");
            pstm.setString(1,emailAddress);
            pstm.setString(2,studentId);
            pstm.executeUpdate();
        }
        if(contactNumber.length() > 0){
            PreparedStatement pstm = connection.prepareStatement("UPDATE students SET contactNumber=? WHERE studentId=?");
            pstm.setString(1,contactNumber);
            pstm.setString(2,studentId);
            pstm.executeUpdate();
        }
        if(payedOrNot.length() > 0){
            PreparedStatement pstm = connection.prepareStatement("UPDATE students SET payedOrNot=? WHERE studentId=?");
            pstm.setString(1,payedOrNot);
            pstm.setString(2,studentId);
            pstm.executeUpdate();
        }
    }

    @Override
    public void updateCourseDetails(String courseId, String lecturerName) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE courses SET lecturerName=? WHERE courseId=?");
        pstm.setString(1,lecturerName);
        pstm.setString(2,courseId);
        pstm.executeUpdate();
    }

    @Override
    public void updateEmployeeDetails(String employeeName, String contactNumber, String emailAddress, String monthlySalary) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();

        if(contactNumber.length() > 0 ){
            PreparedStatement pstm = connection.prepareStatement("UPDATE employee SET contactNumber=? WHERE employeeName=?");
            pstm.setString(1,contactNumber);
            pstm.setString(2,employeeName);
            pstm.executeUpdate();
        }
        if (emailAddress.length() > 0){
            PreparedStatement pstm = connection.prepareStatement("UPDATE employee SET emailAddress=? WHERE employeeName=?");
            pstm.setString(1,emailAddress);
            pstm.setString(2,employeeName);
            pstm.executeUpdate();
        }
        if (monthlySalary.length() > 0){
            PreparedStatement pstm = connection.prepareStatement("UPDATE employee SET monthlySalary=? WHERE employeeName=?");
            pstm.setString(1,monthlySalary);
            pstm.setString(2,employeeName);
            pstm.executeUpdate();
        }
    }
}
