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
import restaurant.dao.AddItemToOrderDao;
import restaurant.dao.NewEmployeeDao;
import restaurant.dao.ViewEmployeeDao;
import restaurant.models.Employee;
import restaurant.models.Item;

@Repository
public  class AddItemToOrderDaoImpl implements AddItemToOrderDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<ItemRowMapper> getItems() {
       	System.out.println("Getting items"); 
		 String GET_Product_SQL="SELECT * FROM  Menu_Items ";	     
		 List pds=jdbcTemplate.query(GET_Product_SQL, new ItemRowMapper());		
	      System.out.println("items are Retrived");
	      return pds;
	      
	}

}