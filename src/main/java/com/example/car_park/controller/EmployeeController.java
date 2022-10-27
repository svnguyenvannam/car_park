package com.example.car_park.controller;

import com.example.car_park.entity.Employee;
import com.example.car_park.exception.NotFoundException;
import com.example.car_park.exception.NotInvalidException;
import com.example.car_park.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public Employee create(@RequestBody @Valid Employee employee) throws NotInvalidException {

         return employeeService.create(employee);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Valid int id) {
        employeeService.delete(id);
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findByID(@PathVariable @Valid int id) {
        Employee employee =employeeService.findById(id);
        if(employee == null){
            throw new NotFoundException("Không có employee đó trong danh sách");
        }
       return  ResponseEntity.ok(employee);
    }
    @PutMapping(path = "/{employeeId}")
    public String updateEmployee(@PathVariable("employeeId") int id, @RequestBody @Valid Employee employee) {
        return employeeService.update(id, employee);
    }
}
