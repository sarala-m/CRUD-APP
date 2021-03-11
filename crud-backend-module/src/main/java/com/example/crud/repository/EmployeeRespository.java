package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
