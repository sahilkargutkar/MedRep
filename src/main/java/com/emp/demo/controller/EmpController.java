package com.emp.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.demo.entity.Employee;
import com.emp.demo.repository.EmpRepository;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpRepository empRepo;
	
	@GetMapping("/get/all")  // Get All Representatives
	public List<Employee> getAll(){
		return empRepo.findAll();
	}
	
	
	@GetMapping("/getid")   //Get Representatives using ID
	public Employee getById(@PathVariable int empId)
	{
	 Optional <Employee> employee=empRepo.findById(empId);
	 if(employee.isPresent()) 
	 {
		 return employee.get();
	 }else  {
		 throw new RuntimeException("Employee not found");
	 }
		 
	}
	
	
	@PostMapping("/add")   //Create Representative
	public Employee add(@RequestBody Employee emp){
		return empRepo.save(emp);
	}
	
	
	@PutMapping("/edit")   //Update Representative
	public Employee edit(@RequestBody Employee emp){
		return empRepo.save(emp);
	}
	
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int empNo ) //Delete Representative 
	{
		Optional<Employee> employee = empRepo.findById(empNo);
		if(employee.isPresent()) {
			empRepo.delete(employee.get());
			return "Employee is deleted";
		}
		else 
		{
			throw new RuntimeException("Employee not Found");
		}
		
		
	}
}
