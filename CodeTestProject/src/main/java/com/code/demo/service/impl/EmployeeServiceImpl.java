package com.code.demo.service.impl;

import com.code.demo.mapper.EmployeeMapper;
import com.code.demo.pojo.Employee;
import com.code.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author byte
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {

//    @Autowired
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> listEmployee() {
        return employeeMapper.selectList(null);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateById(employee);
    }
}
