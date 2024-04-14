package com.spring.jdbc.Pro1.Dao;

import com.spring.jdbc.Pro1.Dao.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int studentID);
	
}
