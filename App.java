package com.spring.jdbc.Pro1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.Pro1.Dao.StudentDao;
import com.spring.jdbc.Pro1.Dao.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "started...." );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Pro1/Config.xml");
        context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        /*
        // insert query
        Student student=new Student();
        student.setId(4);
        student.setName("amit");
        student.setCity("palamu");
        
        int result = studentDao.insert(student);
        System.out.println("student added" + result);
        */
        
        /*
        //update query
        Student student=new Student();
        student.setId(4);
        student.setName("Harsh");
        student.setCity("Ranchi");
        studentDao.change(student);
        System.out.println("data changed");
        */
        
        //delete query
        int result = studentDao.delete(3);
        System.out.println("student id deleted" + result);
    }
}
