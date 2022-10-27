package com.example.car_park.service;

import com.example.car_park.entity.Employee;
import com.example.car_park.exception.NotFoundException;
import com.example.car_park.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpli implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
    @Override
    public Employee findById(int id)
    {
        return employeeRepository.findById(id).orElse(null);
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public String update(int employeeId, Employee employee) {
        Optional<Employee> emp = employeeRepository.findById(employeeId);
        if (!emp.isPresent()) {
            throw new NotFoundException("Can't update, Employee doesn't exist ");
        }
        employee.setEmployeeId(employeeId);
        employeeRepository.save(employee);
        return "Cập nhật thành công";
    }


}
