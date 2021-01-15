package restaurant.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restaurant.dao.AddItemToOrderDao;
import restaurant.dao.NewEmployeeDao;
import restaurant.dao.ViewEmployeeDao;
import restaurant.daoimpl.ViewEmployeeDaoImpl;
import restaurant.daoimpl.EmployeeRowMapper;
import restaurant.daoimpl.ItemRowMapper;
import restaurant.models.Employee;
import restaurant.models.Item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@RestController
public class AddItemToOrderController {
	
	@Autowired
	private AddItemToOrderDao addItemToOrderDao;

	@RequestMapping("/getItems")
	public List<ItemRowMapper> getItems() {
		//model.addAttribute("name",names);
		List<ItemRowMapper> pds=addItemToOrderDao.getItems();
		System.out.println(pds);
		return pds;
	}
}