package com.employee.repositary;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.entity.EmployeeEntity;

public interface EmployeeRepositary extends JpaRepository<EmployeeEntity, Serializable> {
	@Query(value="SELECT E.FIRST_NAME, E.LAST_NAME FROM EMPLOYEE E WHERE E.EMPLOYEE_ID = (SELECT D.EMPLOYEE_ID FROM DEPARTMANT D WHERE D.DEPATRMENT_ID = :deprtmentId AND "
			+ "SELECT S.EMPLOYEE_ID FROM SALARY S WHERE S.SALLARY < :deprtmentId)", nativeQuery=true) 
	public List<EmployeeEntity> findByDepartmentIdSallary(Long deprtmentId,Double sal);

}
