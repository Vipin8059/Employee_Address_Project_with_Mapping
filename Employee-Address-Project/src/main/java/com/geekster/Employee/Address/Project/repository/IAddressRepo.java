package com.geekster.Employee.Address.Project.repository;

import com.geekster.Employee.Address.Project.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {

}
