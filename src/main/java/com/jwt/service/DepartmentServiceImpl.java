package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.DepartmentDAO;
import com.jwt.model.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDAO departmentDAO;

	@Override
	public void addDepartment(Department department) {
		departmentDAO.addDepartment(department);
	}
}
