package org.example.controller;

import org.example.dto.*;
import org.example.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin
@RestController
public class InstituteController {
    @Autowired
    InstituteService service;

    @PostMapping("/addBatches")
    void addBatches(@RequestBody Batches batches) throws SQLException, ClassNotFoundException {
        service.addBatches(batches.getBatchName() , batches.getYear() , batches.getCourse() , batches.getMedium() , batches.getLimitOfStudent());
    }

    @PostMapping("/addStudents")
    void addStudents(@RequestBody Students students) throws SQLException, ClassNotFoundException {
        service.addStudents(students.getStudentId() , students.getStudentName(), students.getBatchName(), students.getCourse(), students.getMedium(), students.getEmailAddress(), students.getContactNumber(), students.getDateOfBirth(), students.getPayedOrNot());
    }

    @PostMapping("/addPayments")
    void addPayments(@RequestBody Payments payments) throws SQLException, ClassNotFoundException {
        service.addPayments(payments.getBillId() , payments.getStudentId(), payments.getStudentName(), payments.getBatch(), payments.getCourse(), payments.getYearOfTheBatch(), payments.getValueOfPayment());
    }

    @PostMapping("/addCourses")
    void addCourses(@RequestBody Courses courses) throws SQLException, ClassNotFoundException {
        service.addCourses(courses.getCourseId() , courses.getCourseName() , courses.getPeriodOfTheCourse(), courses.getLecturerName());
    }

    @PostMapping("/addEmployee")
    void addEmployee(@RequestBody Employee employee) throws SQLException, ClassNotFoundException {
        service.addEmployee(employee.getEmployeeName() , employee.getContactNumber(), employee.getEmailAddress(), employee.getMonthlySalary());
    }

    @GetMapping("/showAllBatches")
    List showAllBatches() throws SQLException, ClassNotFoundException {
        return service.showAllBatches();
    }

    @GetMapping("/showAllStudents")
    List showAllStudents() throws SQLException, ClassNotFoundException {
        return service.showAllStudents();
    }

    @GetMapping("/showAllPayments")
    List showAllPayments() throws SQLException, ClassNotFoundException {
        return service.showAllPayments();
    }

    @GetMapping("/showAllCourses")
    List showAllCourses() throws SQLException, ClassNotFoundException {
        return service.showAllCourses();
    }

    @GetMapping("/showAllEmployees")
    List showAllEmployees() throws SQLException, ClassNotFoundException {
        return service.showAllEmployees();
    }

    @PostMapping("/updateStudentDetails")
    void updateStudentDetails(@RequestBody Students students) throws SQLException, ClassNotFoundException {
        service.updateStudentDetails(students.getStudentId() , students.getEmailAddress() , students.getContactNumber() , students.getPayedOrNot());
    }

    @PostMapping("/updateCourseDetails")
    void updateCourseDetails(@RequestBody Courses courses) throws SQLException, ClassNotFoundException {
        service.updateCourseDetails(courses.getCourseId() , courses.getLecturerName());
    }

    @PostMapping("/updateEmployeeDetails")
    void updateEmployeeDetails(@RequestBody Employee employee) throws SQLException, ClassNotFoundException {
        service.updateEmployeeDetails(employee.getEmployeeName() , employee.getContactNumber(), employee.getEmailAddress(), employee.getMonthlySalary());
    }
}
