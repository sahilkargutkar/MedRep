package com.emp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EmpDrugs 
{
	@Id
	@GeneratedValue
	private String drugs1;
	private String drugs2;
	private String drugs3;
	@ManyToOne
	private Employee emp;
	
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getDrugs1() {
		return drugs1;
	}
	public void setDrugs1(String drugs1) {
		this.drugs1 = drugs1;
	}
	public String getDrugs2() {
		return drugs2;
	}
	public void setDrugs2(String drugs2) {
		this.drugs2 = drugs2;
	}
	public String getDrugs3() {
		return drugs3;
	}
	public void setDrugs3(String drugs3) {
		this.drugs3 = drugs3;
	}
	
	

}
