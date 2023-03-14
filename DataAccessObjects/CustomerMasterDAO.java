package DataAccessObjects;

import java.util.Collection;
import DataTransferObjects.CustomerMasterDTO;

public interface CustomerMasterDAO {
	public CustomerMasterDTO findById(int customer_id);
	public CustomerMasterDTO findByName(String customername);
	public Collection<CustomerMasterDTO> findAll();	
	public int updateCustomer(CustomerMasterDTO customer);
	public int deleteCustomer(int customer_id);
}
