package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue
	private Long employeeId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	@OneToOne
	private DepartmentEntity DepartmentId;
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(Long employeeId, String firstName, String lastName, DepartmentEntity departmentId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		DepartmentId = departmentId;
	}
	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public DepartmentEntity getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(DepartmentEntity departmentId) {
		DepartmentId = departmentId;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", DepartmentId=" + DepartmentId + "]";
	}
}
