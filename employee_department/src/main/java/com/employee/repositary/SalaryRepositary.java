package com.employee.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.SalaryEntity;

public interface SalaryRepositary extends JpaRepository<SalaryEntity, Serializable> {

}
