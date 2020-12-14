package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SalaryEntity {
	@Id
	@GeneratedValue
	private Long salaryid;
	@Column
	private Long employeeId;
	@Column
	private Double sallary;
	@OneToOne
	@Column
	private DepartmentEntity dentity;
	public SalaryEntity(Long salaryid,Long employeeId, Double sallary, DepartmentEntity dentity) {
		super();
		this.salaryid = salaryid;
		this.sallary = sallary;
		this.dentity = dentity;
	}
	public SalaryEntity() {
		super();
	}
	public Long getSalaryid() {
		return salaryid;
	}
	public void setSalaryid(Long salaryid) {
		this.salaryid = salaryid;
	}
	public Double getSallary() {
		return sallary;
	}
	public void setSallary(Double sallary) {
		this.sallary = sallary;
	}
	public DepartmentEntity getDentity() {
		return dentity;
	}
	public void setDentity(DepartmentEntity dentity) {
		this.dentity = dentity;
	}
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	
	

}
