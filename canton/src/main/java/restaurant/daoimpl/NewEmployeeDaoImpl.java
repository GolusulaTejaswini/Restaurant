package restaurant.daoimpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import restaurant.daoimpl.EmployeeRowMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import restaurant.controllers.NewEmployeeController;
import restaurant.dao.NewEmployeeDao;
import restaurant.dao.ViewEmployeeDao;
import restaurant.models.Employee;

@Repository
public  class NewEmployeeDaoImpl implements NewEmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addEmployee(List<Employee> employeedetails) {
		String insert_employee_sql="insert into Employee(StreetNo,StreetName,City,State,"
				+ "ZipCode,Salary,Type,First_Name,Last_Name,SSN,PhoneNo,isSupervisor) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";

		List<Object[]> batchArgList=new ArrayList<Object[]>();
		
		for(Employee eds:employeedetails) {
			
			Object[] obj= {eds.getStreetNo(),eds.getStreetName(),eds.getCity(),eds.getState(),eds.getZipCode(),eds.getSalary(),eds.getType()
					,eds.getFirst_Name(),eds.getLast_Name(),eds.getSSN(),eds.getPhoneNo(),eds.getIsSupervisor()};

			batchArgList.add(obj);

			
		}
				jdbcTemplate.batchUpdate(insert_employee_sql, batchArgList);
	      
	}

}