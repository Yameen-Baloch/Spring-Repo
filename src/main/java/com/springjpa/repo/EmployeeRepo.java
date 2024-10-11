package com.springjpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.firstspringbootproject.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public List<Employee> findByEmailAddress(String emailAddress);
	
	@Query("SELECT E FROM Employee E")
	public List<Employee> getAllEmployees();
	
	@Query("SELECT E FROM Employee E WHERE E.emailAddress =:email")
	public List<Employee> getEmployeeByEmail(@Param("email") String emailAddress);
}
