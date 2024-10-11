package com.firstspringbootproject;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.firstspringbootproject.entity.Employee;
import com.springjpa.repo.EmployeeRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.springjpa.repo") // Adjust this package as needed
public class SpringjaptutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringjaptutorialApplication.class, args);
		
		EmployeeRepo employeeRepo =  context.getBean(EmployeeRepo.class);
/*		Employee employee = new Employee();
		
		employee.setEmail_address("abc1@gmail.com");
		employee.setFirst_name("abc1@gmail.com");
		employee.setLast_name("abc1@gmail.com");
		
		Employee employee1 = new Employee();
		
		employee1.setEmail_address("abc2@gmail.com");
		employee1.setFirst_name("abc2@gmail.com");
		employee1.setLast_name("ab21@gmail.com");
		
		List<Employee>	employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee);
		
		Iterable<Employee> result = employeeRepo.saveAll(employeeList);
		for (Employee employee2 : result) {
			System.out.println("Saved Employee "+employee2);

		}*/
		
		// HOW TO GET DATA FROM DB IN JAVA
//		List<Employee> allEmployees = employeeRepo.findAll();
//		for (Employee employee : allEmployees) {
//			System.out.println("Get "+employee);
//		}
		
		// get by ID
//		Optional<Employee> employeeById = employeeRepo.findById(202);
//		Employee employee = employeeById.get();
//		employee.setLast_name("bankcrupt@gmail.com");
//		employeeRepo.save(employee);
//		System.out.println("EMPLOYEE With ID "+employee);
		
		// DELETE AN EMPLOYEE FROM TABLE
//		employeeRepo.deleteById(202);
//		System.out.println("Deleted");
		
		//Customer Finder Methods
//		List<Employee> employeeByEmailAdress = employeeRepo.findByEmailAddress("abc1@gmail.com");
//		employeeByEmailAdress.forEach((e)->System.out.println(e));
		
		
		// EXECUTING JPQL
//		List<Employee> allEmployees = employeeRepo.getAllEmployees();
//		allEmployees.forEach(e->System.out.println(e));
//	
		
		
		// executing parameterized Query
		List<Employee> employeeByEmail = employeeRepo.getEmployeeByEmail("abc1@gmail.com");
		
		employeeByEmail.forEach(e -> System.out.println(e));
	}	

}
