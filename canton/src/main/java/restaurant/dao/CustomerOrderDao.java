package restaurant.dao;
import java.util.List;

import restaurant.daoimpl.OrderRowMapper;
import restaurant.models.Order;

public interface CustomerOrderDao {
	
	public void addItems(List<Order> items);

}