package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Employee;

public class RowMapperImpl implements RowMapper
{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.setEid(rs.getInt(1));
		e1.setEname(rs.getString("ename"));  // Map 'ename'
        e1.setDname(rs.getString("dname"));
		return e1;
	}

}
