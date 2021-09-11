package com.luv2code.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//this class basically creates your DAO and DAOImpl, just make sure to autowire this class in the EmployeeServiceImply
}
