package com.code.demo.service;

import com.code.demo.pojo.Employee;

import java.util.List;

/**
 * @author byte
 **/
public interface EmployeeService {

    List<Employee> listEmployee();

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);
}
