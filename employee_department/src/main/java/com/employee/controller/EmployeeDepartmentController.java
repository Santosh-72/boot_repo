package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.DepartmentEntity;
import com.employee.entity.EmployeeEntity;
import com.employee.entity.SalaryEntity;
import com.employee.service.EmployeeDepartmentService;

@RestController
public class EmployeeDepartmentController {
	@Autowired
	private EmployeeDepartmentService employeeDepartmentService;
	@PostMapping("/saveemployee")
	public EmployeeEntity saveEmplyee(EmployeeEntity employeeEntity) {
		EmployeeEntity savedemployeeEntity=employeeDepartmentService.saveEmployee(employeeEntity);
		return savedemployeeEntity;
	}
	
	@PostMapping("/savedepartmant")
	public DepartmentEntity saveDepartmant(DepartmentEntity departmentEntity) {
		DepartmentEntity saveddepartmentEntity=employeeDepartmentService.saveDepartment(departmentEntity);
		return saveddepartmentEntity;
	}
	
	@PostMapping("/savesallary")
	public SalaryEntity saveSallary(SalaryEntity sallaryEntity) {
		SalaryEntity savedsallaryEntity=employeeDepartmentService.saveSalaryEntity(sallaryEntity);
		return savedsallaryEntity;
	}
	@GetMapping("/list/{id}/{sal}")
	public List<EmployeeEntity> getEmployeeByDeptIdSaslId(@PathVariable("id") Long id,@PathVariable("sal") Double sal){
		List<EmployeeEntity> feactchedEmployee=employeeDepartmentService.featchEmployee(id, sal);
		return feactchedEmployee;
	}
	

}
