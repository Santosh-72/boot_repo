package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.entity.DepartmentEntity;
import com.employee.entity.EmployeeEntity;
import com.employee.entity.SalaryEntity;
import com.employee.repositary.DepartmentRepositary;
import com.employee.repositary.EmployeeRepositary;
import com.employee.repositary.SalaryRepositary;

public class EmployeeDepartmentServiceImpl implements EmployeeDepartmentService {

	@Autowired
	private EmployeeRepositary employeeRepositary;
	
	@Autowired
	private SalaryRepositary salaryRepositary;
	
	@Autowired
	private DepartmentRepositary departmentRepositary;
	
	Boolean flag = false;
	
	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		EmployeeEntity savedEmployeeEntity=employeeRepositary.save(employeeEntity);
		return savedEmployeeEntity;
	}

	@Override
	public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {
		DepartmentEntity savedDepartmentEntity =departmentRepositary.save(departmentEntity);
		return savedDepartmentEntity;
	}

	@Override
	public SalaryEntity saveSalaryEntity(SalaryEntity salaryEntity) {
		SalaryEntity savedSalaryEntity=salaryRepositary.save(salaryEntity);
		return savedSalaryEntity;
	}

	@Override
	public boolean deleteEmplotyee(Long employeeId) {
		
		employeeRepositary.deleteById(employeeId);
		return true;
	}

	@Override
	public boolean deleteDepartment(Long deprtmentId) {
		departmentRepositary.deleteById(deprtmentId);
		return true;
	}

	@Override
	public boolean deleteSalary(Long id) {
		salaryRepositary.deleteById(id);
		return true;
	}

	@Override
	public List<EmployeeEntity> featchEmployee(Long id, Double salary) {
		List<EmployeeEntity> fatchedEmployyList =employeeRepositary.findByDepartmentIdSallary(id, salary);
		return fatchedEmployyList;
	}

}
