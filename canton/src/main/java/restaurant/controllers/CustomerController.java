package restaurant.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restaurant.dao.CustomerDao;
import restaurant.dao.CustomerOrderDao;
import restaurant.models.Customer;
import restaurant.models.Order;

@RestController
@RequestMapping("")
@CrossOrigin(origins="*",maxAge=3600, methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS,RequestMethod.DELETE}, allowedHeaders={"x-requested-with", "accept", "authorization", "content-type"}, 
exposedHeaders={"access-control-allow-headers", "access-control-allow-methods", "access-control-allow-origin", "access-control-max-age", "X-Frame-Options"},allowCredentials="false",value="*")

public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;

	@PostMapping(value="/addCustomers")
	public String addAllItems(@RequestBody List<Customer> items ) {
		System.out.println("Entered Successfully");

        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getCity());
        }

        customerDao.addItems(items);
				
		System.out.println("Options are Added Successfully");
		return "Order added";
	}	
	
}