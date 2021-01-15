package restaurant.dao;
import java.util.List;
import restaurant.daoimpl.EmployeeRowMapper;
import restaurant.daoimpl.ItemRowMapper;
import restaurant.models.Employee;
import restaurant.models.Item;
public interface AddItemToOrderDao {
	public List<ItemRowMapper> getItems();
}