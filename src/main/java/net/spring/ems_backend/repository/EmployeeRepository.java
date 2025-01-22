package net.spring.ems_backend.repository;

import net.spring.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {//two parameters, first is the type of entity and the second is the type of the primary key

}
