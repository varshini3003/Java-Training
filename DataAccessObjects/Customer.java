package DataAccessObjects;

import java.sql.*;
import java.util.*;
import DataTransferObjects.CustomerMasterDTO;

public class Customer implements CustomerMasterDAO{

	@Override
	public CustomerMasterDTO findById(int id) {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customer_id =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerMasterDTO customer = new CustomerMasterDTO();
				customer.setId(id);
				customer.setName(rs.getString("customername"));
				customer.setAddress(rs.getString("customeraddress"));
				return customer;
			}
					
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}
		
		return null;
	}

	@Override
	public CustomerMasterDTO findByName(String name) {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customername =?");
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerMasterDTO customer = new CustomerMasterDTO();
				customer.setName(name);
				customer.setId(rs.getInt("customer_id"));
				customer.setAddress(rs.getString("customeraddress"));
				return customer;
			}		
			
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}
				
		return null;
	}

	@Override
	public Collection<CustomerMasterDTO> findAll() {
		try {
			Connection connection  = DBUtility.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master ");
			ResultSet rs = statement.executeQuery();
			List<CustomerMasterDTO> customers = new ArrayList<>();
			while(rs.next()) {
				CustomerMasterDTO customer = new CustomerMasterDTO();
				customer.setName(rs.getString("customername"));
				customer.setId(rs.getInt("customer_id"));
				customer.setAddress(rs.getString("customeraddress"));
				customers.add(customer);
			}
			return customers;		
		} catch (Exception e) {
			DBUtility.closeConnection(e);
		}
				
		return null;
	}

	@Override
	public int updateCustomer(CustomerMasterDTO customer) {
		try {
			Connection connection  = DBUtility.getConnection();
			int id= customer.getId();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customer_id = ?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			if(rs.next()) {
				statement = connection.prepareStatement("update customer_master set customername =? , customeraddress = ? where customer_id =?;");
				statement.setString(1, customer.getName());
				statement.setString(2, customer.getAddress());
				statement.setInt(3, customer.getId());	
				int n = statement.executeUpdate();
			    DBUtility.closeConnection(null);
			    return n;
			}
			return 0;
					
		} 
        catch (Exception e) {
			DBUtility.closeConnection(e);
		}	
		
		return 0;
	}

	@Override
	public int deleteCustomer(int id) {
		
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from customer_master where customer_id=?");
			statement.setInt(1, id);
			int n = statement.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		}
        catch(Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

}
