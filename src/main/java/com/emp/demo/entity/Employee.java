package com.emp.demo.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="table_emp1")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	
	@OneToMany
	@JoinTable(name="Emp_Drugs",joinColumns=@JoinColumn(name="Id"),inverseJoinColumns=@JoinColumn(name="Drugs"))
	private Collection<EmpDrugs> empdrugs= new ArrayList<EmpDrugs>();
	
	
	public Collection<EmpDrugs> empDrug()
	{
		return empdrugs;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, Collection<EmpDrugs> empDrug) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empdrugs = empDrug;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDrug() {
		return getEmpDrug();
	}
	public void setEmpDrug(Collection<EmpDrugs> empDrug) {
		this.empdrugs = empDrug;
	}
	

}
