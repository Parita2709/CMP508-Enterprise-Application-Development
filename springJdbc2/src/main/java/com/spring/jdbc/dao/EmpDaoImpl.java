package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Employee;

public class EmpDaoImpl implements EmpDao {
    
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Employee employee) {
        // Method for inserting a new employee record
        String q = "INSERT INTO emp_data(eid, ename, dname) VALUES(?, ?, ?)";
        int r = this.jdbcTemplate.update(q, employee.getEid(), employee.getEname(), employee.getDname());
        return r;
    }

    public int edit(Employee employee) {
        // Method for editing an existing employee record
        String q = "UPDATE emp_data SET ename = ?, dname = ? WHERE eid = ?";
        int r = this.jdbcTemplate.update(q, employee.getEname(), employee.getDname(), employee.getEid());
        return r;
    }
        
    public Employee getEmployee(int eid) {
        // Correct method for deleting an employee record
        String q = "SELECT * FROM emp_data WHERE eid = ?";
        RowMapper<Employee> rm = new RowMapperImpl();
        Employee employee = this.jdbcTemplate.queryForObject(q,rm, eid);
        return employee;
    }
    
    public List<Employee> getAllEmp(){
    	String q="SELECT * from emp_data";
    	List<Employee> employee = this.jdbcTemplate.query(q,new RowMapperImpl());
    	return employee;
    }

	public int delete(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
}
