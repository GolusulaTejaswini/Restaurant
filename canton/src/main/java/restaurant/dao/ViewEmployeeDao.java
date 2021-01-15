package restaurant.dao;
import java.util.List;
import restaurant.daoimpl.EmployeeRowMapper;
import restaurant.models.Employee;
public interface ViewEmployeeDao {
	public List<EmployeeRowMapper> getAllEmployees();
}