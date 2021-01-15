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
import restaurant.controllers.ViewEmployeeController;
import restaurant.dao.ViewEmployeeDao;
import restaurant.models.Employee;

@Repository
public  class ViewEmployeeDaoImpl implements ViewEmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<EmployeeRowMapper> getAllEmployees() {
       	System.out.println("Getting Employees"); 
		 String GET_Product_SQL="SELECT * FROM  Employee ";	     
		 List pds=jdbcTemplate.query(GET_Product_SQL, new EmployeeRowMapper());		
	      System.out.println("Employees are Retrived");
	      return pds;
	      
	}

}