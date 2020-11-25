package com.emp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.demo.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
