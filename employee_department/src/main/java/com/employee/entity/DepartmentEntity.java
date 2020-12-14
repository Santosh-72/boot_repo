package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DepartmentEntity {
	@Id
	@GeneratedValue
	private Long departmentId;
	@Column
	private Long employeeId;
	@OneToOne
	@Column
	private String departmentname;
	public DepartmentEntity(Long departmentId, Long employeeId, String departmentname) {
		super();
		this.departmentId = departmentId;
		this.departmentname = departmentname;
	}
	public DepartmentEntity() {
		super();
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	

}
