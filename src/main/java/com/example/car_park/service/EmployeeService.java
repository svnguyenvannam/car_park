package com.example.car_park.service;

import com.example.car_park.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee create(Employee employee);

    void delete(int id);

    Employee findById(int id);

    List<Employee> findAll();

    String update(int employeeId,Employee employee);
}
