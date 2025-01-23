package net.spring.ems_backend.service.impl;

import lombok.AllArgsConstructor;
import net.spring.ems_backend.dto.EmployeeDto;
import net.spring.ems_backend.entity.Employee;
import net.spring.ems_backend.exception.ResourceNotFoundException;
import net.spring.ems_backend.mapper.EmployeeMapper;
import net.spring.ems_backend.repository.EmployeeRepository;
import net.spring.ems_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDto); // connected employee to employeeDto
        Employee savedEmployee = employeeRepository.save(employee); //Save employeeDto to database
        return EmployeeMapper.maptoEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
     Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(()-> new ResourceNotFoundException("Employee with id " + employeeId + " not found"));
        return EmployeeMapper.maptoEmployeeDto(employee);
    }
}
