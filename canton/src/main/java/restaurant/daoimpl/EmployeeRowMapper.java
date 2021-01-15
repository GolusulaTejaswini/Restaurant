package restaurant.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import restaurant.models.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee pds=new Employee();
		
		pds.setStreetNo(rs.getString("StreetNo")); 
		pds.setStreetName(rs.getString("StreetName"));
		pds.setCity(rs.getString("City"));
		pds.setState(rs.getString("State"));
		pds.setZipCode(rs.getString("ZipCode"));
		pds.setSalary(rs.getFloat("Salary"));
		pds.setType(rs.getString("Type"));
		pds.setFirst_Name(rs.getString("First_Name"));
		pds.setLast_Name(rs.getString("Last_Name"));
		pds.setSSN(rs.getString("SSN"));
		//pds.setEmployee_ID(rs.getInt("Employee_ID"));
		pds.setPhoneNo(rs.getString("PhoneNo"));
		pds.setIsSupervisor(rs.getInt("isSupervisor"));

		
		return pds;
	}
	
}