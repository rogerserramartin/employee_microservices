package com.example.demo.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//this repository works with Employee objects and its IDs as Long objects
@Repository
public interface EmployeeRepository
        extends JpaRepository <Employee, Long>{

    // SELECT * FROM employee WHERE email = ?
    @Query("SELECT e FROM Employee e WHERE e.email = ?1")
    Optional<Employee> findEmployeeByEmail(String email);
}
