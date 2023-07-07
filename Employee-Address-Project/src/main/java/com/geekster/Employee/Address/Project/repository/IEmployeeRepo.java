package com.geekster.Employee.Address.Project.repository;

import com.geekster.Employee.Address.Project.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
}
