package com.pratik.employee_api.repository;

import com.pratik.employee_api.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
