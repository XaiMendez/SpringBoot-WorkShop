package tech.istrategies.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.istrategies.model.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer>{

}
