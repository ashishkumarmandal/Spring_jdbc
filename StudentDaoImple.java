package com.spring.jdbc.Pro1.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Pro1.Dao.entities.Student;

public class StudentDaoImple implements StudentDao{

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		
		//insert query
        String query ="insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	
	public int change(Student student) {
		//update query
		String query = "update student set name = ? , city = ? where id = ?" ;
		int r  = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(int studentID) {
		// delete query
		String query = "delete from student where id = ?";
		int r =this.jdbcTemplate.update(query,studentID);
		return r;
	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	



}
