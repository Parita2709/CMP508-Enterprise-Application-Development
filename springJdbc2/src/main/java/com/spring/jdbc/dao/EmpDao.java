package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Employee;

public interface EmpDao {
	//Method to insert data
	public int insert(Employee employee);
	
	//Method to edit data
    public int edit(Employee employee);
    
    //Method to delete data
    public int delete(Employee employee);
    
    public Employee getEmployee(int eid);
    
    public List<Employee> getAllEmp();

}
