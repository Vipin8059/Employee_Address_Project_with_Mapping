package com.geekster.Employee.Address.Project.controller;

import com.geekster.Employee.Address.Project.model.Address;
import com.geekster.Employee.Address.Project.model.Employee;
import com.geekster.Employee.Address.Project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //get all employees
    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //get an employee by id
    @GetMapping("employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    //create a new employee
    @PostMapping("employees")
    public String addEmployees(@RequestBody List<Employee> employeeList){
        return employeeService.addEmployees(employeeList);
    }

    //update a employee by id
    @PutMapping("employee/{id}")
    public String updateEmployeeById(@PathVariable Long id, @RequestBody Address address){
        return employeeService.updateEmployeeById(id,address);
    }

    // delete a employee by id
    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
