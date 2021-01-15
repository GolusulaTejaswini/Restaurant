package restaurant.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restaurant.dao.ViewEmployeeDao;
import restaurant.dao.ViewOrderDao;
import restaurant.daoimpl.ViewEmployeeDaoImpl;
import restaurant.daoimpl.ViewOrderRowMapper;
import restaurant.daoimpl.EmployeeRowMapper;
import restaurant.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@RestController
public class ViewOrderController {
	
	@Autowired
	private ViewOrderDao viewOrderDao;
		public String names="Tejaswini";
	/*@RequestMapping(value="/employees")
	public void addAllOptions(@RequestBody(required=true)@Valid List<Employee> options ) {
				
		viewEmployeeDao.addAllOptions(options);
		System.out.println("Options are Added Successfully");
		
	}*/
	
	@RequestMapping("/ViewOrders")
	public List<ViewOrderRowMapper> getAllProducts() {
		//model.addAttribute("name",names);
		List<ViewOrderRowMapper> pds=viewOrderDao.getAllEmployees();
		System.out.println(pds);
		return pds;
	}
}