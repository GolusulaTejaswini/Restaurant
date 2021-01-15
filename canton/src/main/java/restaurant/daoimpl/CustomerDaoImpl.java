package restaurant.daoimpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import restaurant.dao.CustomerDao;
import restaurant.dao.CustomerOrderDao;
import restaurant.models.Order;
import restaurant.models.Customer;


@Repository
public  class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addItems(List<Customer> items) {
		
		String add_options_SQL="insert into CUSTOMER(First_Name,Last_Name,StreetNo,StreetName,PhoneNo,City,State,ZipCode) values(?,?,?,?,?,?,?,?)";

		List<Object[]> batchArgList=new ArrayList<Object[]>();
		
		for(Customer ops:items) {
						Object[] obj= {ops.getFirst_Name(),ops.getLast_Name(),ops.getStreetNo(),ops.getStreetName(),
					ops.getPhoneNo(),ops.getCity(),ops.getState(),ops.getZipCode()};
			batchArgList.add(obj);
		}
		jdbcTemplate.batchUpdate(add_options_SQL, batchArgList);	
	}	

}