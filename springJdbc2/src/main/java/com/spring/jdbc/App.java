package com.spring.jdbc;

//import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext c;
	public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
    	
    	c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
////    	 To insert data
//    	Employee c1 = new Employee();
//    	c1.setEid(781);
//    	c1.setEname("Parita");
//    	c1.setDname("Database Engineer");
//    	int r1 = cd.insert(c1);    	
//    	System.out.println("Record inserted " +r1);
//    	
//    	// To edit data
        Employee employee = new Employee();
        employee.setEid(781); // Assuming employee with ID 101 exists
        employee.setEname("Parita Tarwani"); // New name
        employee.setDname("Business Intelligence"); // New department
        int r2 = cd.edit(employee);
        System.out.println("Records updated: " + r2);
//        }
//		// To delete data
//	    Employee employee = new Employee();
//	    employee.setEid(268); // Assuming employee with ID 101 exists
//	    employee.setEname("Riya Thakor"); // New name
//	    employee.setDname("Front-end Developer"); // New department
//	    int r3 = cd.delete(employee);
//	    System.out.println("Records deleted: " + r3);
    	
//    	 To get a particular employee data
//    	Employee e = cd.getEmployee(257);
//    	System.out.println("Records fetched: " + e);
    	
    	//Get all employee data
//    	List<Employee> employees = cd.getAllEmp(); // Use 'cd' object instead of 'EmpDao'
//    	for(Employee e2: employees)
//    	{
//    		System.out.println(e2);
//    	}
//    	
    	
	    }
}
