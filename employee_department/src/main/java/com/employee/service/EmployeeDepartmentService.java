package com.employee.service;

import java.util.List;

import com.employee.entity.DepartmentEntity;
import com.employee.entity.EmployeeEntity;
import com.employee.entity.SalaryEntity;

public interface EmployeeDepartmentService {
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity);
	public SalaryEntity saveSalaryEntity(SalaryEntity salaryEntity);
	public boolean deleteEmplotyee(Long employeeId);
	public boolean deleteDepartment(Long deprtmentId );
	public boolean deleteSalary(Long id);
	public List<EmployeeEntity> featchEmployee(Long id,Double salary);
	

}
