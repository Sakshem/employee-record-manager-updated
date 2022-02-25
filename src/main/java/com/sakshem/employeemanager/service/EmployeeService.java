package com.sakshem.employeemanager.service;

import com.sakshem.employeemanager.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll(String keyword);
    Employee findById(Long id);
    void save(Employee employee);
    void deleteById(Long id);
}
