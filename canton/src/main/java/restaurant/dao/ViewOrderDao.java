package restaurant.dao;
import java.util.List;
import restaurant.daoimpl.EmployeeRowMapper;
import restaurant.daoimpl.ViewOrderRowMapper;
import restaurant.models.Employee;
public interface ViewOrderDao {
	public List<ViewOrderRowMapper> getAllEmployees();
}