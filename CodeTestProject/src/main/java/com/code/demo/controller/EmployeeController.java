package com.code.demo.controller;

import com.code.demo.pojo.Employee;
import com.code.demo.service.EmployeeService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author byte
 **/
@RestController
@RequestMapping("/employee")
public class EmployeeController {

//    @Autowired
    @Resource
    private EmployeeService employeeService;

    @GetMapping("/listEmployee")
    public List<Employee> listEmployee(){
        return employeeService.listEmployee();
    }

    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "name", value = "员工姓名",dataType = "String", required = true),
            @ApiImplicitParam(paramType = "query", name = "age", value = "员工年龄",dataType = "Integer", required = true),
            @ApiImplicitParam(paramType = "query", name = "tel", value = "员工电话",dataType = "String", required = true),
            @ApiImplicitParam(paramType = "query", name = "email", value = "员工邮箱",dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "address", value = "员工地址",dataType = "String", required = true),
            @ApiImplicitParam(paramType = "query", name = "deptId", value = "员工部门ID",dataType = "Integer", required = true)
    })
    @PostMapping("/addEmployee")
    public void addEmployee(@Valid Employee employee){
        employeeService.addEmployee(employee);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "员工ID",dataType = "String", required = true),
            @ApiImplicitParam(paramType = "query", name = "name", value = "员工姓名",dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "age", value = "员工年龄",dataType = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "tel", value = "员工电话",dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "email", value = "员工邮箱",dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "address", value = "员工地址",dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "deptId", value = "员工部门ID",dataType = "Integer")
    })
    @PutMapping("/updateEmployee")
    public void updateEmployee(@Valid Employee employee){
        employeeService.updateEmployee(employee);
    }

}
