package restaurant.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import restaurant.models.Employee;
import restaurant.models.Item;
import restaurant.models.Order;

public class OrderRowMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Order pds=new Order();
		
		pds.setNumber_Of_Items(rs.getInt("Number_Of_Items"));
		pds.setOrder_Total(rs.getInt("Order_Total"));
		pds.setCustomer_ID(rs.getInt("Customer_ID"));
		pds.setForDelivery(rs.getInt("ForDelivery"));

		
		return pds;
	}
	
}