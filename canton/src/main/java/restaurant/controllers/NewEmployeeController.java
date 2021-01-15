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

import restaurant.dao.NewEmployeeDao;
import restaurant.dao.ViewEmployeeDao;
import restaurant.daoimpl.ViewEmployeeDaoImpl;
import restaurant.daoimpl.EmployeeRowMapper;
import restaurant.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@RestController
@RequestMapping("")

@CrossOrigin(origins="*",maxAge=3600, methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.OPTIONS,RequestMethod.DELETE}, allowedHeaders={"x-requested-with", "accept", "authorization", "content-type"}, 
exposedHeaders={"access-control-allow-headers", "access-control-allow-methods", "access-control-allow-origin", "access-control-max-age", "X-Frame-Options"},allowCredentials="false",value="*")

public class NewEmployeeController {
	
	@Autowired
	private NewEmployeeDao newEmployeeDao;

	@PostMapping(value="/addEmployee")
	public String addEmployee(@RequestBody List<Employee> employeedetails ) {
		Employee e=new Employee();
		e.setSSN("fdgdf");
        System.out.println(e.getSSN());

        for(int i = 0; i < employeedetails.size(); i++) {
            System.out.println(employeedetails.get(i).getCity());
            System.out.println(employeedetails.get(i).getFirst_Name());
            System.out.println(employeedetails.get(i).getSSN());
            System.out.println(employeedetails.get(i).getIsSupervisor());
            System.out.println(employeedetails.get(i).getLast_Name());
            System.out.println(employeedetails.get(i).getPhoneNo());
            System.out.println(employeedetails.get(i).getState());
            System.out.println(employeedetails.get(i).getType());
            System.out.println(employeedetails.get(i).getSalary());
        }
        newEmployeeDao.addEmployee(employeedetails);
		return "Added Employee";
	}
	
	
	@PostMapping(value="/addTestAllOptions")
	public void testAllOptions(@RequestBody(required=true)@Valid List<Employee> options ) {
		
		options.forEach(opt -> System.out.println(opt.getStreetNo()));
		
	}

}