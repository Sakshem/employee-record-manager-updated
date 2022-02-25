package com.sakshem.employeemanager.repository;

import com.sakshem.employeemanager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { // repository is another name for DAO here. long stands for the type of primary key here.

    @Query("Select e FROM Employee e WHERE e.name LIKE %?1%")
    public List<Employee> search(String keyword);
}
