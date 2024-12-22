package com.spring.jdbc.Pro1.dao;

import com.spring.jdbc.Pro1.dao.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int studentID);
	
}
