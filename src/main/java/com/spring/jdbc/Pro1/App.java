package com.spring.jdbc.Pro1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.Pro1.dao.StudentDao;
import com.spring.jdbc.Pro1.dao.entities.Student;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class App 
{
    public static void main( String[] args )
    {
        StringBuilder output = new StringBuilder();
        output.append("Started...\n\n");
        
        try {
            @SuppressWarnings("resource")
            ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Pro1/Config.xml");
            
            StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
            
            // Insert a new student
            Student student = new Student();
            student.setId(6);  // Using a new ID
            student.setName("amit");
            student.setCity("palamu");
            
            int result = studentDao.insert(student);
            output.append("Student added successfully. Rows affected: " + result + "\n");
            
            // Delete a student
            result = studentDao.delete(3);
            output.append("Student deleted successfully. Rows affected: " + result + "\n");
            
        } catch (Exception e) {
            output.append("\nError occurred: " + e.getMessage() + "\n");
        }
        
        // Create a JTextArea for better formatting
        JTextArea textArea = new JTextArea(output.toString());
        textArea.setEditable(false);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        
        // Add scrolling capability
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(400, 300));
        
        // Show the results in a popup
        JOptionPane.showMessageDialog(null, scrollPane, 
            "Spring JDBC Operation Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
