package com.sakshem.employeemanager.service;

import com.sakshem.employeemanager.entity.Employee;
import com.sakshem.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void save(Employee employee) {
        // setting up random employee code in string format
        employee.setEmployeeCode(UUID.randomUUID().toString());

        employeeRepository.save(employee);
    }
    @Override
    public List<Employee> findAll(String keyword) {
        if (keyword != null) {
            return employeeRepository.search(keyword);
        }
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        // Java optional feature
        Optional<Employee> result = employeeRepository.findById(id);
        Employee theEmployee = null;
        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            throw new RuntimeException("Did not find employee id - " + id);
        }
        return theEmployee;
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
