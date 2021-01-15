package restaurant.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import restaurant.models.Employee;
import restaurant.models.Item;

public class ItemRowMapper implements RowMapper<Item> {

	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Item pds=new Item();
		pds.setItem_ID(rs.getInt("Item_ID"));
		pds.setItem_Name(rs.getString("Item_Name")); 
		pds.setItem_Type(rs.getString("Item_Type"));
		pds.setItem_Size(rs.getString("Item_Size"));
		pds.setPrice(rs.getInt("Price"));

		
		return pds;
	}
	
}