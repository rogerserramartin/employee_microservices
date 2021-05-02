package com.example.demo.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//this repository works with Employee objects and its IDs as Long objects
@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{
}
