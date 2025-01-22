package net.spring.ems_backend.controller;

import lombok.AllArgsConstructor;
import net.spring.ems_backend.dto.EmployeeDto;
import net.spring.ems_backend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController //class can now handle HTTP requests
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    //Build Add Employee REST API
    public ResponseEntity<EmployeeDto> createEmployee(EmployeeDto employeeDto) {
      EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
      return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
