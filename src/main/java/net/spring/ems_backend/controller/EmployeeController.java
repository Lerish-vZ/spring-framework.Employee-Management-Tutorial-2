package net.spring.ems_backend.controller;

import lombok.AllArgsConstructor;
import net.spring.ems_backend.dto.EmployeeDto;
import net.spring.ems_backend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;

import java.util.List;

@AllArgsConstructor
@RestController //class can now handle HTTP requests
@RequestMapping("/api/employees")
public class EmployeeController {
    private final HandlerMapping resourceHandlerMapping;
    private EmployeeService employeeService;

    //Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
      EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
      return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    //Build Get All Employee REST API
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
       List<EmployeeDto> employees =  employeeService.getAllEmployees();
       return ResponseEntity.ok(employees);
    }
}
