package net.spring.ems_backend.service;

import net.spring.ems_backend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}