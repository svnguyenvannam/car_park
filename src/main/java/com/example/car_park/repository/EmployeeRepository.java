package com.example.car_park.repository;


import com.example.car_park.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    String update(int employeeId,Employee employee);

}
