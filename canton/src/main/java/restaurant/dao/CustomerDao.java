package restaurant.dao;
import java.util.List;

import restaurant.daoimpl.OrderRowMapper;
import restaurant.models.Customer;
import restaurant.models.Order;

public interface CustomerDao {
	
	public void addItems(List<Customer> items);

}