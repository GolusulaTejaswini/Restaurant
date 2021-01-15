package restaurant.daoimpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import restaurant.dao.CustomerOrderDao;
import restaurant.models.Order;

@Repository
public  class CustomerOrderDaoImpl implements CustomerOrderDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addItems(List<Order> items) {
		
		String add_options_SQL="insert into CUSTOMER_ORDER(Number_Of_Items,Order_Total,Customer_ID,ForDelivery) values(?,?,?,?)";

		List<Object[]> batchArgList=new ArrayList<Object[]>();
		
		for(Order ops:items) {
			
			//Object[] obj= {ops.getOptionId(),ops.getOptionName(),ops.getOptionValue()};
			Object[] obj= {ops.getNumber_Of_Items(),ops.getOrder_Total(),ops.getCustomer_ID(),ops.getForDelivery()};

			batchArgList.add(obj);
		}
		jdbcTemplate.batchUpdate(add_options_SQL, batchArgList);	
	}	

}