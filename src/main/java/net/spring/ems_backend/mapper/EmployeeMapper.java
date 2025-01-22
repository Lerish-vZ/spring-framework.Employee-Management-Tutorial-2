package net.spring.ems_backend.mapper;

import net.spring.ems_backend.dto.EmployeeDto;
import net.spring.ems_backend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto maptoEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        ); //will map employee into employeedto
    }


}
