package com.employee.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.DepartmentEntity;

public interface DepartmentRepositary extends JpaRepository<DepartmentEntity, Serializable> {

}
