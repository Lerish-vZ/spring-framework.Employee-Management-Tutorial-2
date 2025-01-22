package net.spring.ems_backend.service.impl;

import lombok.AllArgsConstructor;
import net.spring.ems_backend.dto.EmployeeDto;
import net.spring.ems_backend.repository.EmployeeRepository;
import net.spring.ems_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        return null;
    }
}
