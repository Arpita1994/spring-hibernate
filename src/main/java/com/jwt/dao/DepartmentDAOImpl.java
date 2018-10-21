package com.jwt.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addDepartment(Department department) {
		sessionFactory.getCurrentSession().saveOrUpdate(department);
		
	}

}
