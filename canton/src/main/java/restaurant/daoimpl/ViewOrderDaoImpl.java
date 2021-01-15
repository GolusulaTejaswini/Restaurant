package restaurant.daoimpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import restaurant.controllers.ViewEmployeeController;
import restaurant.dao.ViewEmployeeDao;
import restaurant.dao.ViewOrderDao;
import restaurant.models.Employee;
import restaurant.daoimpl.ViewOrderRowMapper;

@Repository
public  class ViewOrderDaoImpl implements ViewOrderDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ViewOrderRowMapper> getAllEmployees() {
       	System.out.println("Getting Employees"); 
		 String GET_Product_SQL="SELECT * FROM  WEEKLY_ORDERS";	     
		 List pds=jdbcTemplate.query(GET_Product_SQL, new ViewOrderRowMapper());		
	      System.out.println("Employees are Retrived");
	      return pds;
	      
	}

}