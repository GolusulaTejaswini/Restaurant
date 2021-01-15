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
import restaurant.models.ViewOrder;

public class ViewOrderRowMapper implements RowMapper<ViewOrder> {

	@Override
	public ViewOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ViewOrder pds=new ViewOrder();
		
		pds.setCustomer_ID(rs.getInt("Customer_ID"));
		pds.setOrder_ID(rs.getInt("Order_ID"));
		pds.setOrder_Total(rs.getInt("Order_Total"));
		pds.setCompany_Name(rs.getString("Company_Name"));

		
		return pds;
	}
	
}