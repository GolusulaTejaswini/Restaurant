package restaurant.dao;
import java.util.List;
import restaurant.daoimpl.EmployeeRowMapper;
import restaurant.models.Employee;
public interface NewEmployeeDao {
	public void addEmployee(List<Employee> employeedetails);
}